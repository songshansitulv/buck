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
package com.facebook.buck.multitenant.service

/**
 * Appends data that backs an [Index].
 */
interface IndexAppender {

    /**
     * @return the generation that corresponds to the specified commit or `null` if no such
     *     generation is available
     */
    fun getGeneration(commit: Commit): Int?

    /**
     * @return the commit most recently added to the index or `null` if no commits have been added.
     *     If the result is non-null, then it is guaranteed to return a non-null value when used
     *     with [getGeneration].
     */
    fun getLatestCommit(): Commit?

    /**
     * Currently, the caller is responsible for ensuring that addCommitData() is invoked
     * serially (never concurrently) for each commit in a chain of version control history.
     *
     * The expectation is that the caller will use something like `buck audit rules` based on the
     * changes in the commit to produce the BuildPackageChanges object to pass to this method.
     */
    fun addCommitData(commit: Commit, changes: BuildPackageChanges)
}
