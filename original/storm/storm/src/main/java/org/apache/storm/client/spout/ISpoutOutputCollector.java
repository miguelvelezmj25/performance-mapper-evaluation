/**
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.  The ASF licenses this file to you under the Apache License, Version
 * 2.0 (the "License"); you may not use this file except in compliance with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package org.apache.storm.client.spout;

import java.util.List;
import org.apache.storm.client.task.IErrorReporter;

/**
 * Methods are not expected to be thread safe. Each thread expected to have a separate instance of this type of object, or else externally
 * synchronize any shared instance.
 */

public interface ISpoutOutputCollector extends IErrorReporter {
    /**
     * Returns the task ids that received the tuples.
     */
    List<Integer> emit(String streamId, List<Object> tuple, Object messageId);

    void emitDirect(int taskId, String streamId, List<Object> tuple, Object messageId);

    long getPendingCount();

    void flush();
}

