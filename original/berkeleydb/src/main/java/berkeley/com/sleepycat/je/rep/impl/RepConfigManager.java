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

import java.util.Enumeration;
import java.util.Properties;

import berkeley.com.sleepycat.je.EnvironmentConfig;
import berkeley.com.sleepycat.je.EnvironmentFailureException;
import berkeley.com.sleepycat.je.config.ConfigParam;
import berkeley.com.sleepycat.je.config.EnvironmentParams;
import berkeley.com.sleepycat.je.dbi.DbConfigManager;
import berkeley.com.sleepycat.je.dbi.RepConfigProxy;
import berkeley.com.sleepycat.je.rep.RepInternal;
import berkeley.com.sleepycat.je.rep.ReplicationConfig;

public class RepConfigManager extends DbConfigManager {

    /**
     * If the replication configuration object was set with overridden
     * validation, we need to continue to override when we generate a new
     * configuration.
     */
    private final boolean validateParams;

    public RepConfigManager(EnvironmentConfig envConfig,
                            RepConfigProxy repConfigProxy) {
        super(envConfig);
        checkEnvConfig(envConfig);
        ReplicationConfig repConfig = (ReplicationConfig) repConfigProxy;
        props.putAll(repConfig.getProps());
        repConfig.verify();
        this.validateParams = repConfig.getValidateParams();
    }

    /**
     * Verifies that the environment config is suitable for a replicated
     * environment.
     *
     * @param envConfig the environment config being checked.
     *
     * @throws IllegalArgumentException via ReplicatedEnvironment ctor.
     */
    private static void checkEnvConfig(EnvironmentConfig envConfig)
        throws IllegalArgumentException {

        if (!envConfig.getTransactional()) {
            throw new IllegalArgumentException
                ("A replicated environment must be transactional");
        }
        String logMemOnly = envConfig.getConfigParam
                            (EnvironmentParams.LOG_MEMORY_ONLY.getName());
        if (Boolean.parseBoolean(logMemOnly)) {
            throw new IllegalArgumentException
                ("A replicated environment must not log to memory");
        }
    }

    /**
     * Create a new ReplicationConfig for use in creating Replicator handles.
     * Be sure to only pick out replication related properties.
     */
    public ReplicationConfig makeReplicationConfig() {

        /*
         * TODO: the code would be nicer if we replaced the properties bag with
         * a class that knows how to iterate over the param values, associating
         * the ConfigParam object with it. As a future task, this is similar to
         * code in DbConfigManager, and ought to be refactored out. We can also
         * strip out the multivalued param support.
         */
        Properties repProperties = new Properties();

        /* Check that the properties have valid names and values. */
        Enumeration<?> propNames = props.propertyNames();
        while (propNames.hasMoreElements()) {
            String name = (String) propNames.nextElement();
            /* Is this a valid property name? */
            ConfigParam param =
                EnvironmentParams.SUPPORTED_PARAMS.get(name);

            if (param == null) {
                /* See if the parameter is an multi-value parameter. */
                String mvParamName = ConfigParam.multiValueParamName(name);
                param = EnvironmentParams.SUPPORTED_PARAMS.get(mvParamName);
                if (param == null) {
                    throw EnvironmentFailureException.unexpectedState
                        (name +
                         " is not a valid BDBJE environment configuration");
                }
            }

            if (param.isForReplication()) {
                repProperties.setProperty(name, props.getProperty(name));
            }
        }

        return RepInternal.makeReplicationConfig
            (repProperties, validateParams);
    }
}
