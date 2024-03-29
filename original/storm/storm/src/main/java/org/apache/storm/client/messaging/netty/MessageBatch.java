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

package org.apache.storm.client.messaging.netty;

import java.util.ArrayList;
import org.apache.storm.client.messaging.TaskMessage;
import io.netty.buffer.ByteBuf;

class MessageBatch implements INettySerializable {

    private final int buffer_size;
    private final ArrayList<TaskMessage> msgs;
    private int encoded_length;

    MessageBatch(int buffer_size) {
        this.buffer_size = buffer_size;
        msgs = new ArrayList<>();
        encoded_length = ControlMessage.EOB_MESSAGE.encodeLength();
    }

    void add(TaskMessage msg) {
        if (msg == null) {
            throw new RuntimeException("null object forbidden in message batch");
        }

        msgs.add(msg);
        encoded_length += msgEncodeLength(msg);
    }

    private int msgEncodeLength(TaskMessage taskMsg) {
        if (taskMsg == null) {
            return 0;
        }

        int size = 6; //INT + SHORT
        if (taskMsg.message() != null) {
            size += taskMsg.message().length;
        }
        return size;
    }

    /**
     * @return true if this batch used up allowed buffer size
     */
    boolean isFull() {
        return encoded_length >= buffer_size;
    }

    /**
     * @return true if this batch doesn't have any messages
     */
    boolean isEmpty() {
        return msgs.isEmpty();
    }

    /**
     * @return number of msgs in this batch
     */
    int size() {
        return msgs.size();
    }

    @Override
    public int encodeLength() {
        return encoded_length;
    }
    
    /**
     * create a buffer containing the encoding of this batch
     */
    @Override
    public void write(ByteBuf dest) {
        for (TaskMessage msg : msgs) {
            writeTaskMessage(dest, msg);
        }

        //add a END_OF_BATCH indicator
        ControlMessage.EOB_MESSAGE.write(dest);
    }

    /**
     * write a TaskMessage into a buffer
     *
     * Each TaskMessage is encoded as: task ... short(2) len ... int(4) payload ... byte[]     *
     */
    private void writeTaskMessage(ByteBuf buf, TaskMessage message) {
        int payload_len = 0;
        if (message.message() != null) {
            payload_len = message.message().length;
        }

        int task_id = message.task();
        if (task_id > Short.MAX_VALUE) {
            throw new RuntimeException("Task ID should not exceed " + Short.MAX_VALUE);
        }

        buf.writeShort((short) task_id);
        buf.writeInt(payload_len);
        if (payload_len > 0) {
            buf.writeBytes(message.message());
        }
    }

}
