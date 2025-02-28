/*
 * Copyright 2016-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.rules.macros;

import com.facebook.buck.core.model.BuildTarget;
import com.facebook.buck.core.model.targetgraph.TargetGraph;
import com.facebook.buck.core.rulekey.AddToRuleKey;
import com.facebook.buck.core.rules.ActionGraphBuilder;
import com.facebook.buck.core.rules.BuildRule;
import com.facebook.buck.core.sourcepath.SourcePath;
import com.facebook.buck.core.sourcepath.resolver.SourcePathResolver;
import com.facebook.buck.query.QueryBuildTarget;
import com.facebook.buck.rules.args.Arg;
import com.facebook.buck.util.MoreIterables;
import com.facebook.buck.util.RichStream;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Used to expand the macro {@literal $(query_targets_and_outputs "some(query(:expression))")} to
 * the full target names and the set of the outputs of the targets matching the query separated by a
 * space. Example queries
 *
 * <pre>
 *   '$(query_targets_and_outputs "deps(:foo)")'
 *   '$(query_targets_and_outputs "filter(bar, classpath(:bar))")'
 *   '$(query_targets_and_outputs "attrfilter(annotation_processors, com.foo.Processor, deps(:app))")'
 * </pre>
 *
 * Example output:
 *
 * <pre>
 * $(query_targets_and_outputs "deps(:foo)") ->
 *   "//:bar1 /tmp/project/buck-out/gen/bar1/out_file //:bar2 /tmp/project/buck-out/gen/bar2/out_file"
 * </pre>
 */
public class QueryTargetsAndOutputsMacroExpander
    extends QueryMacroExpander<QueryTargetsAndOutputsMacro> {

  public QueryTargetsAndOutputsMacroExpander(Optional<TargetGraph> targetGraph) {
    super(targetGraph);
  }

  @Override
  public Class<QueryTargetsAndOutputsMacro> getInputClass() {
    return QueryTargetsAndOutputsMacro.class;
  }

  @Override
  public Arg expandFrom(
      BuildTarget target,
      ActionGraphBuilder graphBuilder,
      QueryTargetsAndOutputsMacro input,
      QueryResults precomputedWork) {
    return new QueriedTargestAndOutputsArg(
        precomputedWork.results.stream()
            .map(
                queryTarget -> {
                  Preconditions.checkState(queryTarget instanceof QueryBuildTarget);
                  return graphBuilder.getRule(((QueryBuildTarget) queryTarget).getBuildTarget());
                })
            .filter(rule -> rule.getSourcePathToOutput() != null)
            .sorted()
            .collect(Collectors.toList()),
        input.getSeparator());
  }

  private class QueriedTargestAndOutputsArg implements Arg {
    @AddToRuleKey private final ImmutableList<BuildTarget> targets;
    @AddToRuleKey private final ImmutableList<SourcePath> outputs;
    @AddToRuleKey private final String separator;

    public QueriedTargestAndOutputsArg(Iterable<BuildRule> queriedRules, String separator) {
      this.targets =
          RichStream.from(queriedRules)
              .map(BuildRule::getBuildTarget)
              .collect(ImmutableList.toImmutableList());
      this.outputs =
          RichStream.from(queriedRules)
              .map(BuildRule::getSourcePathToOutput)
              .collect(ImmutableList.toImmutableList());
      this.separator = separator;
    }

    @Override
    public void appendToCommandLine(Consumer<String> consumer, SourcePathResolver pathResolver) {
      Stream.Builder<String> items = Stream.builder();
      MoreIterables.forEachPair(
          targets,
          outputs,
          (target, output) -> {
            items.add(
                String.format(
                    "%s%s%s",
                    target.getFullyQualifiedName(),
                    separator,
                    pathResolver.getAbsolutePath(output)));
          });
      consumer.accept(items.build().collect(Collectors.joining(separator)));
    }
  }
}
