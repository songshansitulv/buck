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

package com.facebook.buck.remoteexecution;

import com.facebook.buck.remoteexecution.interfaces.Protocol;
import com.facebook.buck.remoteexecution.interfaces.Protocol.Digest;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Callable;

/** Interface used by OutputsMaterializer to fetch outputs from the CAS. */
public interface AsyncBlobFetcher {
  ListenableFuture<ByteBuffer> fetch(Protocol.Digest digest);

  ListenableFuture<Void> fetchToStream(Digest digest, WritableByteChannel channel);

  ListenableFuture<Void> batchFetchBlobs(
      ImmutableMultimap<Digest, Callable<WritableByteChannel>> requests,
      ImmutableMultimap<Digest, SettableFuture<Void>> futures)
      throws IOException;
}
