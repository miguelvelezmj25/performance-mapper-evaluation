/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.storm.server.daemon.supervisor;

import java.io.File;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import org.apache.commons.io.FileUtils;
import org.apache.storm.client.Config;
import org.apache.storm.server.DaemonConfig;
import org.apache.storm.client.StormTimer;
import org.apache.storm.client.cluster.ClusterStateContext;
import org.apache.storm.client.cluster.ClusterUtils;
import org.apache.storm.client.cluster.DaemonType;
import org.apache.storm.client.cluster.IStormClusterState;
import org.apache.storm.client.daemon.DaemonCommon;
import org.apache.storm.client.daemon.StormCommon;
import org.apache.storm.server.daemon.supervisor.timer.ReportWorkerHeartbeats;
import org.apache.storm.server.daemon.supervisor.timer.SupervisorHealthCheck;
import org.apache.storm.server.daemon.supervisor.timer.SupervisorHeartbeat;
import org.apache.storm.server.daemon.supervisor.timer.SynchronizeAssignments;
import org.apache.storm.server.event.EventManager;
import org.apache.storm.server.event.EventManagerImp;
import org.apache.storm.client.generated.Assignment;
import org.apache.storm.client.generated.AuthorizationException;
import org.apache.storm.client.generated.LocalAssignment;
import org.apache.storm.client.generated.Nimbus;
import org.apache.storm.client.generated.NotAliveException;
import org.apache.storm.client.generated.SupervisorAssignments;
import org.apache.storm.client.generated.SupervisorWorkerHeartbeat;
import org.apache.storm.server.localizer.AsyncLocalizer;
import org.apache.storm.server.logging.ThriftAccessLogger;
import org.apache.storm.client.messaging.IContext;
import org.apache.storm.server.metric.StormMetricsRegistry;
import org.apache.storm.server.scheduler.ISupervisor;
import org.apache.storm.client.security.auth.IAuthorizer;
import org.apache.storm.client.security.auth.ReqContext;
import org.apache.storm.client.security.auth.ThriftConnectionType;
import org.apache.storm.client.security.auth.ThriftServer;
import com.google.common.annotations.VisibleForTesting;
import org.apache.thrift.TException;
import org.apache.thrift.TProcessor;
import org.apache.storm.client.utils.ConfigUtils;
import org.apache.storm.client.utils.LocalState;
import org.apache.storm.client.utils.ObjectReader;
import org.apache.storm.client.utils.ServerConfigUtils;
import org.apache.storm.client.utils.ShellUtils;
import org.apache.storm.client.utils.Time;
import org.apache.storm.client.utils.Utils;
import org.apache.storm.client.utils.VersionInfo;
import org.apache.storm.client.utils.WrappedAuthorizationException;
import org.apache.storm.client.utils.WrappedNotAliveException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Supervisor implements DaemonCommon, AutoCloseable {
    private static final Logger LOG = LoggerFactory.getLogger(Supervisor.class);
    private final Map<String, Object> conf;
    private final IContext sharedContext;
    private final IAuthorizer authorizationHandler;
    private final ISupervisor iSupervisor;
    private final Utils.UptimeComputer upTime;
    private final String stormVersion;
    private final IStormClusterState stormClusterState;
    private final LocalState localState;
    private final String supervisorId;
    private final String assignmentId;
    private final int supervisorPort;
    private final String hostName;
    // used for reporting used ports when heartbeating
    private final AtomicReference<Map<Long, LocalAssignment>> currAssignment;
    private final StormTimer heartbeatTimer;
    private final StormTimer workerHeartbeatTimer;
    private final StormTimer eventTimer;
    //Right now this is only used for sending metrics to nimbus,
    // but we may want to combine it with the heartbeatTimer at some point
    // to really make this work well.
    private final ExecutorService heartbeatExecutor;
    private final AsyncLocalizer asyncLocalizer;
    private final StormMetricsRegistry metricsRegistry;
    private final ContainerMemoryTracker containerMemoryTracker;
    private final SlotMetrics slotMetrics;
    private volatile boolean active;
    private EventManager eventManager;
    private ReadClusterState readState;
    private ThriftServer thriftServer;
    //used for local cluster heartbeating
    private Nimbus.Iface localNimbus;

    private Supervisor(ISupervisor iSupervisor, StormMetricsRegistry metricsRegistry)
        throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        this(ConfigUtils.readStormConfig(), null, iSupervisor, metricsRegistry);
    }

    /**
     * Constructor for supervisor daemon.
     *
     * @param conf          config
     * @param sharedContext {@link IContext}
     * @param iSupervisor   {@link ISupervisor}
     * @throws IOException
     */
    public Supervisor(Map<String, Object> conf, IContext sharedContext, ISupervisor iSupervisor, StormMetricsRegistry metricsRegistry)
        throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        this.conf = conf;
        this.metricsRegistry = metricsRegistry;
        this.containerMemoryTracker = new ContainerMemoryTracker(metricsRegistry);
        this.slotMetrics = new SlotMetrics(metricsRegistry);
        this.iSupervisor = iSupervisor;
        this.active = true;
        this.upTime = Utils.makeUptimeComputer();
        this.stormVersion = VersionInfo.getVersion();
        this.sharedContext = sharedContext;
        this.heartbeatExecutor = Executors.newFixedThreadPool(1);
        this.authorizationHandler = StormCommon.mkAuthorizationHandler(
            (String) conf.get(DaemonConfig.SUPERVISOR_AUTHORIZER), conf);
        if (authorizationHandler == null && conf.get(DaemonConfig.NIMBUS_AUTHORIZER) != null) {
            throw new IllegalStateException("It looks like authorization is turned on for nimbus but not for the "
                + "supervisor. ( " + DaemonConfig.SUPERVISOR_AUTHORIZER + " is not set)");
        }

        iSupervisor.prepare(conf, ServerConfigUtils.supervisorIsupervisorDir(conf));

        try {
            this.stormClusterState = ClusterUtils.mkStormClusterState(conf,
                                                                      new ClusterStateContext(DaemonType.SUPERVISOR, conf));
        } catch (Exception e) {
            LOG.error("supervisor can't create stormClusterState");
            throw Utils.wrapInRuntime(e);
        }

        this.currAssignment = new AtomicReference<>(new HashMap<>());

        try {
            this.localState = ServerConfigUtils.supervisorState(conf);
            this.asyncLocalizer = new AsyncLocalizer(conf, metricsRegistry);
        } catch (IOException e) {
            throw Utils.wrapInRuntime(e);
        }
        this.supervisorId = iSupervisor.getSupervisorId();
        this.assignmentId = iSupervisor.getAssignmentId();
        this.supervisorPort = ObjectReader.getInt(conf.get(Config.SUPERVISOR_THRIFT_PORT));

        try {
            this.hostName = Utils.hostname();
        } catch (UnknownHostException e) {
            throw Utils.wrapInRuntime(e);
        }

        this.heartbeatTimer = new StormTimer(null, new DefaultUncaughtExceptionHandler());

        this.workerHeartbeatTimer = new StormTimer(null, new DefaultUncaughtExceptionHandler());

        this.eventTimer = new StormTimer(null, new DefaultUncaughtExceptionHandler());
    }

    /**
     * supervisor daemon enter entrance.
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Utils.setupDefaultUncaughtExceptionHandler();
        StormMetricsRegistry metricsRegistry = new StormMetricsRegistry();
        @SuppressWarnings("resource")
        Supervisor instance = new Supervisor(new StandaloneSupervisor(), metricsRegistry);
        instance.launchDaemon();
    }

    /**
     * Get the executor service that is supposed to be used for heart-beats.
     */
    public ExecutorService getHeartbeatExecutor() {
        return heartbeatExecutor;
    }

    public String getId() {
        return supervisorId;
    }

    IContext getSharedContext() {
        return sharedContext;
    }

    StormMetricsRegistry getMetricsRegistry() {
        return metricsRegistry;
    }
    
    ContainerMemoryTracker getContainerMemoryTracker() {
        return containerMemoryTracker;
    }

    SlotMetrics getSlotMetrics() {
        return slotMetrics;
    }

    public Map<String, Object> getConf() {
        return conf;
    }

    public ISupervisor getiSupervisor() {
        return iSupervisor;
    }

    public Utils.UptimeComputer getUpTime() {
        return upTime;
    }

    public String getStormVersion() {
        return stormVersion;
    }

    public IStormClusterState getStormClusterState() {
        return stormClusterState;
    }

    public ReadClusterState getReadClusterState() {
        return readState;
    }

    LocalState getLocalState() {
        return localState;
    }

    public String getAssignmentId() {
        return assignmentId;
    }

    public int getThriftServerPort() {
        return supervisorPort;
    }

    public String getHostName() {
        return hostName;
    }

    public AtomicReference<Map<Long, LocalAssignment>> getCurrAssignment() {
        return currAssignment;
    }

    AsyncLocalizer getAsyncLocalizer() {
        return asyncLocalizer;
    }

    EventManager getEventManger() {
        return eventManager;
    }

    Supervisor getSupervisor() {
        return this;
    }

    public Nimbus.Iface getLocalNimbus() {
        return this.localNimbus;
    }

    public void setLocalNimbus(Nimbus.Iface nimbus) {
        this.localNimbus = nimbus;
    }

    /**
     * Launch the supervisor.
     */
    public void launch() throws Exception {
        LOG.info("Starting Supervisor with conf {}", ConfigUtils.maskPasswords(conf));
        String path = ServerConfigUtils.supervisorTmpDir(conf);
        FileUtils.cleanDirectory(new File(path));

        SupervisorHeartbeat hb = new SupervisorHeartbeat(conf, this);
        hb.run();
        // should synchronize supervisor so it doesn't launch anything after being down (optimization)
        Integer heartbeatFrequency = ObjectReader.getInt(conf.get(DaemonConfig.SUPERVISOR_HEARTBEAT_FREQUENCY_SECS));
        heartbeatTimer.scheduleRecurring(0, heartbeatFrequency, hb);

        this.eventManager = new EventManagerImp(false);
        this.readState = new ReadClusterState(this);

        asyncLocalizer.start();

        if ((Boolean) conf.get(DaemonConfig.SUPERVISOR_ENABLE)) {
            // This isn't strictly necessary, but it doesn't hurt and ensures that the machine stays up
            // to date even if callbacks don't all work exactly right
            eventTimer.scheduleRecurring(0, 10,
                                         new EventManagerPushCallback(new SynchronizeAssignments(this, null, readState), eventManager));

            // supervisor health check
            eventTimer.scheduleRecurring(30, 30, new SupervisorHealthCheck(this));
        }

        ReportWorkerHeartbeats reportWorkerHeartbeats = new ReportWorkerHeartbeats(conf, this);
        Integer workerHeartbeatFrequency = ObjectReader.getInt(conf.get(Config.WORKER_HEARTBEAT_FREQUENCY_SECS));
        workerHeartbeatTimer.scheduleRecurring(0, workerHeartbeatFrequency, reportWorkerHeartbeats);
        LOG.info("Starting supervisor with id {} at host {}.", getId(), getHostName());
    }

    /**
     * start distribute supervisor.
     */
    public void launchDaemon() {
        LOG.info("Starting supervisor for storm version '{}'.", VersionInfo.getVersion());
        try {
            Map<String, Object> conf = getConf();
            if (ConfigUtils.isLocalMode(conf)) {
                throw new IllegalArgumentException("Cannot start server in local mode!");
            }
            launch();

            metricsRegistry.registerGauge("supervisor:num-slots-used-gauge", () -> SupervisorUtils.supervisorWorkerIds(conf).size());
            //This will only get updated once
            metricsRegistry.registerMeter("supervisor:num-launched").mark();
            metricsRegistry.registerMeter("supervisor:num-shell-exceptions", ShellUtils.numShellExceptions);
            metricsRegistry.startMetricsReporters(conf);
            Utils.addShutdownHookWithForceKillIn1Sec(() -> {
                metricsRegistry.stopMetricsReporters();
                this.close();
            });

            // blocking call under the hood, must invoke after launch cause some services must be initialized
            launchSupervisorThriftServer(conf);
        } catch (Exception e) {
            LOG.error("Failed to start supervisor\n", e);
            System.exit(1);
        }
    }

    @VisibleForTesting
    public void checkAuthorization(String operation) throws AuthorizationException {
        checkAuthorization(null, null, operation, null);
    }

    @VisibleForTesting
    public void checkAuthorization(String topoName, Map<String, Object> topoConf, String operation)
        throws AuthorizationException {
        checkAuthorization(topoName, topoConf, operation, null);
    }

    @VisibleForTesting
    public void checkAuthorization(String topoName, Map<String, Object> topoConf, String operation, ReqContext context)
        throws AuthorizationException {
        IAuthorizer aclHandler = authorizationHandler;
        if (context == null) {
            context = ReqContext.context();
        }
        Map<String, Object> checkConf = new HashMap<>();
        if (topoConf != null) {
            checkConf.putAll(topoConf);
        } else if (topoName != null) {
            checkConf.put(Config.TOPOLOGY_NAME, topoName);
        }

        if (context.isImpersonating()) {
            LOG.info("principal: {} is trying to impersonate principal: {}", context.realPrincipal(),
                     context.principal());
            throw new WrappedAuthorizationException("Supervisor does not support impersonation");
        }

        if (aclHandler != null) {
            if (!aclHandler.permit(context, operation, checkConf)) {
                ThriftAccessLogger.logAccess(context.requestID(), context.remoteAddress(), context.principal(),
                                             operation, topoName, "access-denied");
                throw new WrappedAuthorizationException(operation + (topoName != null ? " on topology " + topoName : "")
                                                 + " is not authorized");
            } else {
                ThriftAccessLogger.logAccess(context.requestID(), context.remoteAddress(), context.principal(),
                                             operation, topoName, "access-granted");
            }
        }
    }

    private void launchSupervisorThriftServer(Map<String, Object> conf) throws IOException {
        // validate port
        int port = getThriftServerPort();
        try {
            ServerSocket socket = new ServerSocket(port);
            socket.close();
        } catch (BindException e) {
            LOG.error("{} is not available. Check if another process is already listening on {}", port, port);
            throw new RuntimeException(e);
        }

        TProcessor processor = new org.apache.storm.client.generated.Supervisor.Processor(
            new org.apache.storm.client.generated.Supervisor.Iface() {
                @Override
                public void sendSupervisorAssignments(SupervisorAssignments assignments)
                    throws AuthorizationException, TException {
                    checkAuthorization("sendSupervisorAssignments");
                    LOG.info("Got an assignments from master, will start to sync with assignments: {}", assignments);
                    SynchronizeAssignments syn = new SynchronizeAssignments(getSupervisor(), assignments,
                                                                            getReadClusterState());
                    getEventManger().add(syn);
                }

                @Override
                public Assignment getLocalAssignmentForStorm(String id)
                    throws NotAliveException, AuthorizationException, TException {
                    Map<String, Object> topoConf = null;
                    try {
                        topoConf = ConfigUtils.readSupervisorStormConf(conf, id);
                    } catch (IOException e) {
                        LOG.warn("Topology config is not localized yet...");
                    }
                    checkAuthorization(id, topoConf, "getLocalAssignmentForStorm");
                    Assignment assignment = getStormClusterState().assignmentInfo(id, null);
                    if (null == assignment) {
                        throw new WrappedNotAliveException("No local assignment assigned for storm: "
                                                    + id
                                                    + " for node: "
                                                    + getHostName());
                    }
                    return assignment;
                }

                @Override
                public void sendSupervisorWorkerHeartbeat(SupervisorWorkerHeartbeat heartbeat)
                    throws AuthorizationException, NotAliveException, TException {
                    // do nothing except validate heartbeat for now.
                    String id = heartbeat.get_storm_id();
                    Map<String, Object> topoConf = null;
                    try {
                        topoConf = ConfigUtils.readSupervisorStormConf(conf, id);
                    } catch (IOException e) {
                        LOG.warn("Topology config is not localized yet...");
                        throw new WrappedNotAliveException(id + " does not appear to be alive, you should probably exit");
                    }
                    checkAuthorization(id, topoConf, "sendSupervisorWorkerHeartbeat");
                }
            });
        this.thriftServer = new ThriftServer(conf, processor, ThriftConnectionType.SUPERVISOR);
        this.thriftServer.serve();
    }

    /**
     * Used for local cluster assignments distribution.
     *
     * @param assignments {@link SupervisorAssignments}
     */
    public void sendSupervisorAssignments(SupervisorAssignments assignments) {
        //for local test
        if (Time.isSimulating() && !(Boolean) conf.get(DaemonConfig.SUPERVISOR_ENABLE)) {
            return;
        }
        SynchronizeAssignments syn = new SynchronizeAssignments(this, assignments, readState);
        eventManager.add(syn);
    }

    @Override
    public void close() {
        try {
            LOG.info("Shutting down supervisor {}", getId());
            this.active = false;
            heartbeatTimer.close();
            workerHeartbeatTimer.close();
            eventTimer.close();
            if (eventManager != null) {
                eventManager.close();
            }
            if (readState != null) {
                readState.close();
            }
            asyncLocalizer.close();
            getStormClusterState().disconnect();
            if (thriftServer != null) {
                this.thriftServer.stop();
            }
        } catch (Exception e) {
            LOG.error("Error Shutting down", e);
        }
    }

    void killWorkers(Collection<String> workerIds, ContainerLauncher launcher) throws InterruptedException, IOException {
        HashSet<Killable> containers = new HashSet<>();
        for (String workerId : workerIds) {
            try {
                Killable k = launcher.recoverContainer(workerId, localState);
                if (!k.areAllProcessesDead()) {
                    k.kill();
                    containers.add(k);
                } else {
                    k.cleanUp();
                }
            } catch (Exception e) {
                LOG.error("Error trying to kill {}", workerId, e);
            }
        }
        int shutdownSleepSecs = ObjectReader.getInt(conf.get(Config.SUPERVISOR_WORKER_SHUTDOWN_SLEEP_SECS));
        if (!containers.isEmpty()) {
            Time.sleepSecs(shutdownSleepSecs);
        }
        for (Killable k : containers) {
            try {
                long start = Time.currentTimeMillis();
                while (!k.areAllProcessesDead()) {
                    if ((Time.currentTimeMillis() - start) > 10_000) {
                        throw new RuntimeException("Giving up on killing " + k
                                                   + " after " + (Time.currentTimeMillis() - start) + " ms");
                    }
                    k.forceKill();
                    Time.sleep(100);
                }
                k.cleanUp();
            } catch (Exception e) {
                LOG.error("Error trying to clean up {}", k, e);
            }
        }
    }

    public void shutdownAllWorkers(BiConsumer<Slot, Long> onWarnTimeout, UniFunc<Slot> onErrorTimeout) {
        if (readState != null) {
            readState.shutdownAllWorkers(onWarnTimeout, onErrorTimeout);
        } else {
            try {
                ContainerLauncher launcher = ContainerLauncher.make(getConf(), getId(), getThriftServerPort(),
                                                                    getSharedContext(), getMetricsRegistry(), getContainerMemoryTracker());
                killWorkers(SupervisorUtils.supervisorWorkerIds(conf), launcher);
            } catch (Exception e) {
                throw Utils.wrapInRuntime(e);
            }
        }
    }

    @Override
    public boolean isWaiting() {
        if (!active) {
            return true;
        }

        return heartbeatTimer.isTimerWaiting()
               && workerHeartbeatTimer.isTimerWaiting()
               && eventTimer.isTimerWaiting()
               && eventManager.waiting();
    }
}