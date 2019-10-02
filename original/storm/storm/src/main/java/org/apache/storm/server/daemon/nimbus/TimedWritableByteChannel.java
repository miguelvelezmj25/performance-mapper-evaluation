/**
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.
 * See the NOTICE file distributed with this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package org.apache.storm.server.daemon.nimbus;

import com.codahale.metrics.Timer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

import org.apache.storm.server.metric.timed.TimedResource;

public class TimedWritableByteChannel extends TimedResource<WritableByteChannel> implements WritableByteChannel {

    public TimedWritableByteChannel(WritableByteChannel measured, Timer timer) {
        super(measured, timer);
    }

    @Override
    public int write(ByteBuffer src) throws IOException {
        return getMeasured().write(src);
    }

    @Override
    public boolean isOpen() {
        return getMeasured().isOpen();
    }

    @Override
    public void close() throws IOException {
        try {
            super.close();
        } catch (Exception e) {
            //WritableByteChannel is a Channel which implements Closeable.
            // Hence although declared AutoCloseable super#close here should only throws IOException
            //We rethrow to conform the signature
            throw (IOException) e;
        }
    }
}