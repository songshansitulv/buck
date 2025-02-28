/*
 * Copyright 2019-present Facebook, Inc.
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
package com.facebook.buck.core.test.rule;

import com.facebook.buck.core.model.BuildTarget;
import com.facebook.buck.rules.macros.StringWithMacros;
import com.google.common.collect.ImmutableMap;
import java.util.Optional;

/**
 * This marks a Description Arg for a test rule as having a test runner that knows how to run the
 * test. The test runner is declared as a library.
 *
 * <p>TODO(bobyf): need a slightly better api or a new rule as a library doesn't quite make sense.
 */
public interface HasTestRunnerLibrary {

  /** @return the target to the library containing the test runner */
  Optional<BuildTarget> getRunnerLibrary();

  /**
   * @return the freeform (for now) specs as required for running tests. For example, cmds,
   *     contacts, etc. This is serialized as json for for the external test runner.
   */
  Optional<ImmutableMap<String, StringWithMacros>> getSpecs();
}
