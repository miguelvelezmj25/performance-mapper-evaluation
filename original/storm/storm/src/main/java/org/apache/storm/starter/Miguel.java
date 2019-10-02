package org.apache.storm.starter;

import org.apache.storm.client.Config;
import org.apache.storm.client.StormSubmitter;
import org.apache.storm.client.task.OutputCollector;
import org.apache.storm.client.task.TopologyContext;
import org.apache.storm.client.testing.TestWordSpout;
import org.apache.storm.client.topology.OutputFieldsDeclarer;
import org.apache.storm.client.topology.TopologyBuilder;
import org.apache.storm.client.topology.base.BaseRichBolt;
import org.apache.storm.client.tuple.Fields;
import org.apache.storm.client.tuple.Tuple;
import org.apache.storm.client.tuple.Values;
import org.apache.storm.client.utils.Utils;
import org.apache.storm.server.LocalCluster;
import org.apache.storm.starter.spout.RandomSentenceSpout;

import java.util.Map;

public class Miguel {

    public static void main(String[] args) throws Exception {
        TopologyBuilder builder = new TopologyBuilder();

        builder.setSpout("word", new TestWordSpout(), 1);
        builder.setBolt("exclaim1", new ExclamationBolt(), 1).shuffleGrouping("word");
        builder.setBolt("exclaim2", new ExclamationBolt(), 1).shuffleGrouping("exclaim1");

        Config conf = new Config();
        conf.setDebug(true);

        if (args != null && args.length > 0) {
            conf.setNumWorkers(3);

            StormSubmitter.submitTopologyWithProgressBar(args[0], conf, builder.createTopology());
        } else {

            LocalCluster cluster = new LocalCluster();
            cluster.submitTopology("test", conf, builder.createTopology());
            Utils.sleep(10000);
            cluster.killTopology("test");
            cluster.shutdown();
        }
    }

    public static class ExclamationBolt extends BaseRichBolt {
        OutputCollector _collector;

        @Override
        public void prepare(Map conf, TopologyContext context, OutputCollector collector) {
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
