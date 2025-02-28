/*
 * Copyright 2017-present Facebook, Inc.
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

package com.facebook.buck.cxx;

import static org.junit.Assert.assertThat;

import com.facebook.buck.core.model.BuildTargetFactory;
import com.facebook.buck.core.model.targetgraph.TargetGraph;
import com.facebook.buck.core.model.targetgraph.TargetGraphFactory;
import com.facebook.buck.core.model.targetgraph.TargetNode;
import com.facebook.buck.core.rules.ActionGraphBuilder;
import com.facebook.buck.core.rules.resolver.impl.TestActionGraphBuilder;
import com.facebook.buck.core.sourcepath.resolver.SourcePathResolver;
import com.facebook.buck.cxx.toolchain.CxxPlatformUtils;
import com.facebook.buck.rules.args.Arg;
import com.facebook.buck.rules.macros.LocationMacro;
import org.hamcrest.Matchers;
import org.junit.Test;

public class CxxLocationMacroExpanderTest {

  @Test
  public void expandCxxGenrule() throws Exception {
    CxxGenruleBuilder builder =
        new CxxGenruleBuilder(BuildTargetFactory.newInstance("//:rule")).setOut("out.txt");
    TargetNode<?> node = builder.build();
    TargetGraph targetGraph = TargetGraphFactory.newInstance(node);
    ActionGraphBuilder graphBuilder = new TestActionGraphBuilder(targetGraph);
    SourcePathResolver pathResolver = graphBuilder.getSourcePathResolver();
    CxxGenrule cxxGenrule = (CxxGenrule) graphBuilder.requireRule(node.getBuildTarget());
    CxxLocationMacroExpander expander =
        new CxxLocationMacroExpander(CxxPlatformUtils.DEFAULT_PLATFORM);
    String expanded =
        Arg.stringify(
            expander.expandFrom(
                node.getBuildTarget(), graphBuilder, LocationMacro.of(node.getBuildTarget())),
            pathResolver);
    assertThat(
        expanded,
        Matchers.equalTo(
            pathResolver
                .getAbsolutePath(
                    cxxGenrule.getGenrule(CxxPlatformUtils.DEFAULT_PLATFORM, graphBuilder))
                .toString()));
  }
}
