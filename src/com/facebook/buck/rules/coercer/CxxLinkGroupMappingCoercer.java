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
package com.facebook.buck.rules.coercer;

import com.facebook.buck.core.cell.CellPathResolver;
import com.facebook.buck.core.linkgroup.CxxLinkGroupMapping;
import com.facebook.buck.core.linkgroup.CxxLinkGroupMappingTarget;
import com.facebook.buck.core.model.TargetConfiguration;
import com.facebook.buck.io.filesystem.ProjectFilesystem;
import com.facebook.buck.util.types.Pair;
import com.google.common.collect.ImmutableList;
import java.nio.file.Path;
import java.util.Collection;

/**
 * {@link TypeCoercer} for {@link CxxLinkGroupMapping}.
 *
 * <p>This {@link TypeCoercer} is used to convert a single link group mapping entry (i.e., single
 * element in the list of <code>link_group_map</code> to a {@link CxxLinkGroupMapping}.
 */
public class CxxLinkGroupMappingCoercer implements TypeCoercer<CxxLinkGroupMapping> {
  private final TypeCoercer<String> linkGroupTypeCoercer;
  private final TypeCoercer<ImmutableList<CxxLinkGroupMappingTarget>> mappingTargetsCoercer;
  private final TypeCoercer<Pair<String, ImmutableList<CxxLinkGroupMappingTarget>>>
      buildTargetWithTraversalTypeCoercer;

  public CxxLinkGroupMappingCoercer(
      TypeCoercer<String> linkGroupTypeCoercer,
      TypeCoercer<ImmutableList<CxxLinkGroupMappingTarget>> mappingTargetCoercer) {
    this.linkGroupTypeCoercer = linkGroupTypeCoercer;
    this.mappingTargetsCoercer = mappingTargetCoercer;
    this.buildTargetWithTraversalTypeCoercer =
        new PairTypeCoercer<>(this.linkGroupTypeCoercer, this.mappingTargetsCoercer);
  }

  @Override
  public Class<CxxLinkGroupMapping> getOutputClass() {
    return CxxLinkGroupMapping.class;
  }

  @Override
  public boolean hasElementClass(Class<?>... types) {
    return linkGroupTypeCoercer.hasElementClass(types)
        || mappingTargetsCoercer.hasElementClass(types);
  }

  @Override
  public void traverse(
      CellPathResolver cellRoots, CxxLinkGroupMapping object, Traversal traversal) {
    linkGroupTypeCoercer.traverse(cellRoots, object.getLinkGroup(), traversal);
    mappingTargetsCoercer.traverse(cellRoots, object.getMappingTargets(), traversal);
  }

  @Override
  public CxxLinkGroupMapping coerce(
      CellPathResolver cellRoots,
      ProjectFilesystem filesystem,
      Path pathRelativeToProjectRoot,
      TargetConfiguration targetConfiguration,
      Object object)
      throws CoerceFailedException {

    if (object instanceof CxxLinkGroupMapping) {
      return (CxxLinkGroupMapping) object;
    }

    if (object instanceof Collection<?> && ((Collection<?>) object).size() == 2) {
      Pair<String, ImmutableList<CxxLinkGroupMappingTarget>> linkGroupWithMappingTargets =
          buildTargetWithTraversalTypeCoercer.coerce(
              cellRoots, filesystem, pathRelativeToProjectRoot, targetConfiguration, object);
      return CxxLinkGroupMapping.of(
          linkGroupWithMappingTargets.getFirst(), linkGroupWithMappingTargets.getSecond());
    }

    throw CoerceFailedException.simple(
        object,
        getOutputClass(),
        "input should be pair of a link group and list of mapping targets");
  }
}
