/**
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.storm.starter;

import org.apache.storm.client.task.OutputCollector;
import org.apache.storm.client.task.TopologyContext;
import org.apache.storm.client.testing.TestWordSpout;
import org.apache.storm.client.topology.ConfigurableTopology;
import org.apache.storm.client.topology.OutputFieldsDeclarer;
import org.apache.storm.client.topology.TopologyBuilder;
import org.apache.storm.client.topology.base.BaseRichBolt;
import org.apache.storm.client.tuple.Fields;
import org.apache.storm.client.tuple.Tuple;
import org.apache.storm.client.tuple.Values;
import org.apache.storm.client.utils.Utils;
import org.apache.storm.server.LocalCluster;

import java.util.Map;

/** This is a basic example of a Storm topology. */
public class ExclamationTopology extends ConfigurableTopology {

  public static void main(String[] args) throws Exception {
    //    System.out.println("DSFdsf");
    ConfigurableTopology.start(new ExclamationTopology(), args);
  }

  protected int run(String[] args) throws Exception {
    TopologyBuilder builder = new TopologyBuilder();

    builder.setSpout("word", new TestWordSpout(false), 1);
    builder.setBolt("exclaim1", new ExclamationBolt(), 1).shuffleGrouping("word");
    builder.setBolt("exclaim2", new ExclamationBolt(), 1).shuffleGrouping("exclaim1");

    conf.setDebug(true);

    String topologyName = "test1";

    conf.setNumWorkers(1);

    if (args != null && args.length > 0) {
      topologyName = args[0];
    }

    //        return submit(topologyName, conf, builder);

    try (LocalCluster cluster = new LocalCluster()) {
      cluster.submitTopology(topologyName, conf, builder.createTopology());
      Utils.sleep(10000);
      cluster.killTopology(topologyName);
      cluster.shutdown();
    }

    return 0;
  }

  public static class ExclamationBolt extends BaseRichBolt {
    OutputCollector _collector;

    @Override
    public void prepare(
        Map<String, Object> conf, TopologyContext context, OutputCollector collector) {
      _collector = collector;
    }

    @Override
    public void execute(Tuple tuple) {
      _collector.emit(tuple, new Values(tuple.getString(0) + "!!!"));
      _collector.ack(tuple);
    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
      declarer.declare(new Fields("word"));
    }
  }
}
