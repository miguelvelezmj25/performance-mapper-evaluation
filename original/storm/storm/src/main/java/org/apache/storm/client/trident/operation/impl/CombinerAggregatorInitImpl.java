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

package org.apache.storm.client.trident.operation.impl;

import java.util.Map;
import org.apache.storm.client.trident.operation.CombinerAggregator;
import org.apache.storm.client.trident.operation.Function;
import org.apache.storm.client.trident.operation.TridentCollector;
import org.apache.storm.client.trident.operation.TridentOperationContext;
import org.apache.storm.client.trident.tuple.TridentTuple;
import org.apache.storm.client.tuple.Values;

public class CombinerAggregatorInitImpl implements Function {

    CombinerAggregator _agg;

    public CombinerAggregatorInitImpl(CombinerAggregator agg) {
        _agg = agg;
    }

    @Override
    public void execute(TridentTuple tuple, TridentCollector collector) {
        collector.emit(new Values(_agg.init(tuple)));
    }

    @Override
    public void prepare(Map<String, Object> conf, TridentOperationContext context) {
    }

    @Override
    public void cleanup() {
    }

}