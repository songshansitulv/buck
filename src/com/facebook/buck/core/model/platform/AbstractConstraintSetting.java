/*
 * Copyright 2018-present Facebook, Inc.
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

package com.facebook.buck.core.model.platform;

import com.facebook.buck.core.model.BuildTarget;
import com.facebook.buck.core.util.immutables.BuckStyleImmutable;
import java.util.Optional;
import org.immutables.value.Value;

/** Represents a group of constraints defined using {@code constraint_setting}. */
@BuckStyleImmutable
@Value.Immutable(builder = false, copy = false, prehash = true)
public abstract class AbstractConstraintSetting {
  @Value.Parameter
  public abstract BuildTarget getBuildTarget();

  @Value.Parameter
  @Value.Auxiliary
  public abstract Optional<HostConstraintDetector> getHostConstraintDetector();
}
