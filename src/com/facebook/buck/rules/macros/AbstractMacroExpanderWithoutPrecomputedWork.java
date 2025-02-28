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

import com.facebook.buck.core.cell.CellPathResolver;
import com.facebook.buck.core.macros.MacroException;
import com.facebook.buck.core.model.BuildTarget;
import com.facebook.buck.core.rules.ActionGraphBuilder;
import com.facebook.buck.rules.args.Arg;

public abstract class AbstractMacroExpanderWithoutPrecomputedWork<T>
    implements MacroExpander<T, Object> {

  private static final Object NO_PRECOMPUTED_WORK = new Object();

  @Override
  public final Object precomputeWorkFrom(
      BuildTarget target, CellPathResolver cellNames, ActionGraphBuilder graphBuilder, T input) {
    return NO_PRECOMPUTED_WORK;
  }

  @Override
  public final Arg expandFrom(
      BuildTarget target, ActionGraphBuilder graphBuilder, T input, Object precomputedWork)
      throws MacroException {
    return expandFrom(target, graphBuilder, input);
  }

  public abstract Arg expandFrom(BuildTarget target, ActionGraphBuilder graphBuilder, T input)
      throws MacroException;
}
