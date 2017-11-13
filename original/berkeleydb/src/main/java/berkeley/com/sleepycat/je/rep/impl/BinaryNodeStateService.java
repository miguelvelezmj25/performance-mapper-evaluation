/*-
 * Copyright (C) 2002, 2017, Oracle and/or its affiliates. All rights reserved.
 *
 * This file was distributed by Oracle as part of a version of Oracle Berkeley
 * DB Java Edition made available at:
 *
 * http://www.oracle.com/technetwork/database/database-technologies/berkeleydb/downloads/index.html
 *
 * Please see the LICENSE file included in the top-level directory of the
 * appropriate version of Oracle Berkeley DB Java Edition for a copy of the
 * license and additional information.
 */

package berkeley.com.sleepycat.je.rep.impl;

import berkeley.com.sleepycat.je.JEVersion;
import berkeley.com.sleepycat.je.log.LogEntryType;
import berkeley.com.sleepycat.je.rep.impl.BinaryNodeStateProtocol.BinaryNodeStateRequest;
import berkeley.com.sleepycat.je.rep.impl.BinaryNodeStateProtocol.BinaryNodeStateResponse;
import berkeley.com.sleepycat.je.rep.impl.node.NameIdPair;
import berkeley.com.sleepycat.je.rep.impl.node.RepNode;
import berkeley.com.sleepycat.je.rep.net.DataChannel;
import berkeley.com.sleepycat.je.rep.utilint.BinaryProtocol.ProtocolException;
import berkeley.com.sleepycat.je.rep.utilint.ServiceDispatcher;
import berkeley.com.sleepycat.je.rep.utilint.ServiceDispatcher.ExecutingService;
import berkeley.com.sleepycat.je.utilint.JVMSystemUtils;
import berkeley.com.sleepycat.je.utilint.LoggerUtils;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * The service registered by a RepNode to answer the state request.
 * <p>
 * To support the new BinaryStateProtocol, we introduce this new
 * BinaryNodeStateService, it's used by "Ping" command.
 * <p>
 * Note: we can merge the two NodeState services together once we support
 * acitve version updates.
 */
public class BinaryNodeStateService extends ExecutingService {

    /* Identifies the Node State querying Service. */
    public static final String SERVICE_NAME = "BinaryNodeState";
    private final RepNode repNode;
    private final ServiceDispatcher dispatcher;
    private final Logger logger;

    public BinaryNodeStateService(ServiceDispatcher dispatcher,
                                  RepNode repNode) {
        super(SERVICE_NAME, dispatcher);
        this.repNode = repNode;
        this.dispatcher = dispatcher;
        this.logger = LoggerUtils.getLogger(getClass());

        dispatcher.register(this);
    }

    public void shutdown() {
        dispatcher.cancel(SERVICE_NAME);
    }

    @Override
    public Runnable getRunnable(DataChannel dataChannel) {
        return new NodeStateServiceRunnable(dataChannel);
    }

    class NodeStateServiceRunnable implements Runnable {
        private DataChannel channel;

        NodeStateServiceRunnable(DataChannel channel) {
            this.channel = channel;
        }

        /* Create the NodeState for the request. */
        private BinaryNodeStateResponse createResponse
        (BinaryNodeStateProtocol protocol) {

            long joinTime = repNode.getMonitorEventManager().getJoinTime();
            long txnEndVLSN = (repNode.getCurrentTxnEndVLSN() == null ?
                    0L : repNode.getCurrentTxnEndVLSN().getSequence());
            long masterTxnEndVLSN = repNode.replica().getMasterTxnEndVLSN();
            int activeFeeders = repNode.feederManager().activeReplicaCount();

            return protocol.new BinaryNodeStateResponse
                    (repNode.getNodeName(), repNode.getGroup().getName(),
                            repNode.getMasterName(), JEVersion.CURRENT_VERSION, joinTime,
                            repNode.getRepImpl().getState(), txnEndVLSN, masterTxnEndVLSN,
                            activeFeeders, LogEntryType.LOG_VERSION,
                            repNode.getAppState(), JVMSystemUtils.getSystemLoad());
        }

        @Override
        public void run() {
            BinaryNodeStateProtocol protocol = null;

            try {
                protocol = new BinaryNodeStateProtocol(NameIdPair.NOCHECK,
                        repNode.getRepImpl());
                try {
                    channel.getSocketChannel().configureBlocking(true);

                    BinaryNodeStateRequest msg =
                            protocol.read(channel, BinaryNodeStateRequest.class);

                    /*
                     * Response a protocol error if the group name doesn't
                     * match.
                     */
                    final String groupName = msg.getGroupName();
                    if(!repNode.getGroup().getName().equals(groupName) ||
                            !repNode.getNodeName().equals(msg.getNodeName())) {
                        throw new ProtocolException("Sending the request to" +
                                " a wrong group or a wrong node.");
                    }

                    /* Write the response the requested node. */
                    BinaryNodeStateResponse response =
                            createResponse(protocol);
                    protocol.write(response, channel);
                    LoggerUtils.finest(logger, repNode.getRepImpl(),
                            "Deal with a node state request successfully.");
                } catch(ProtocolException e) {
                    LoggerUtils.info(logger, repNode.getRepImpl(),
                            "Get a ProtocolException with message: " +
                                    LoggerUtils.exceptionTypeAndMsg(e) +
                                    " while dealing with a node state request.");
                    protocol.write
                            (protocol.new ProtocolError(e.getMessage()), channel);
                } catch(Exception e) {
                    LoggerUtils.info(logger, repNode.getRepImpl(),
                            "Unexpected exception: " +
                                    LoggerUtils.exceptionTypeAndMsg(e));
                    protocol.write
                            (protocol.new ProtocolError(e.getMessage()), channel);
                } finally {
                    if(channel.isOpen()) {
                        channel.close();
                    }
                }
            } catch(IOException e) {

                /*
                 * Channel has already been closed, or the close itself
                 * failed.
                 */
            }
        }
    }
}
