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

package org.apache.storm.client.security.auth.workertoken;

import java.util.Base64;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import javax.crypto.spec.SecretKeySpec;
import org.apache.storm.client.cluster.ClusterStateContext;
import org.apache.storm.client.cluster.ClusterUtils;
import org.apache.storm.client.cluster.DaemonType;
import org.apache.storm.client.cluster.IStormClusterState;
import org.apache.storm.client.generated.PrivateWorkerKey;
import org.apache.storm.client.generated.WorkerTokenInfo;
import org.apache.storm.client.generated.WorkerTokenServiceType;
import org.apache.storm.client.security.auth.ClientAuthUtils;
import org.apache.storm.client.security.auth.ThriftConnectionType;
import org.apache.storm.client.security.auth.sasl.PasswordProvider;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.apache.storm.client.utils.Time;
import org.apache.storm.client.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Allow for SASL authentication using worker tokens.
 */
public class WorkerTokenAuthorizer implements PasswordProvider {
    private static final Logger LOG = LoggerFactory.getLogger(WorkerTokenAuthorizer.class);
    private final LoadingCache<WorkerTokenInfo, PrivateWorkerKey> keyCache;

    /**
     * Constructor.
     *
     * @param conf           the daemon config for the server.
     * @param connectionType the type of connection we are authorizing.
     */
    public WorkerTokenAuthorizer(Map<String, Object> conf, ThriftConnectionType connectionType) {
        this(connectionType.getWtType(), buildStateIfNeeded(conf, connectionType));
    }

    @VisibleForTesting
    WorkerTokenAuthorizer(final WorkerTokenServiceType serviceType, final IStormClusterState state) {
        LoadingCache<WorkerTokenInfo, PrivateWorkerKey> tmpKeyCache = null;
        if (state != null) {
            tmpKeyCache =
                CacheBuilder.newBuilder()
                            .maximumSize(2_000)
                            .expireAfterWrite(2, TimeUnit.HOURS)
                            .build(new CacheLoader<WorkerTokenInfo, PrivateWorkerKey>() {

                                @Override
                                public PrivateWorkerKey load(WorkerTokenInfo wtInfo) {
                                    return state.getPrivateWorkerKey(serviceType,
                                                                     wtInfo.get_topologyId(),
                                                                     wtInfo.get_secretVersion());
                                }
                            });
        }
        keyCache = tmpKeyCache;
    }

    private static IStormClusterState buildStateIfNeeded(Map<String, Object> conf, ThriftConnectionType connectionType) {
        IStormClusterState state = null;

        if (ClientAuthUtils.areWorkerTokensEnabledServer(connectionType, conf)) {
            try {
                state = ClusterUtils.mkStormClusterState(conf, new ClusterStateContext(DaemonType.UNKNOWN, conf));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return state;
    }

    @VisibleForTesting
    byte[] getSignedPasswordFor(byte[] user, WorkerTokenInfo deser) {
        assert keyCache != null;

        if (deser.is_set_expirationTimeMillis() && deser.get_expirationTimeMillis() <= Time.currentTimeMillis()) {
            throw new IllegalArgumentException("Token is not valid, token has expired.");
        }

        PrivateWorkerKey key;
        try {
            key = keyCache.getUnchecked(deser);
        } catch (CacheLoader.InvalidCacheLoadException e) {
            //This happens when the key is not found, the cache loader returns a null and this exception is thrown.
            // because the cache cannot store a null.
            throw new IllegalArgumentException("Token is not valid, private key not found.", e);
        }

        if (key.is_set_expirationTimeMillis() && key.get_expirationTimeMillis() <= Time.currentTimeMillis()) {
            throw new IllegalArgumentException("Token is not valid, key has expired.");
        }

        return WorkerTokenSigner.createPassword(user, new SecretKeySpec(key.get_key(), WorkerTokenSigner.DEFAULT_HMAC_ALGORITHM));
    }

    @Override
    public Optional<char[]> getPasswordFor(String userName) {
        if (keyCache == null) {
            return Optional.empty();
        }
        byte[] user = null;
        WorkerTokenInfo deser = null;
        try {
            user = Base64.getDecoder().decode(userName);
            deser = Utils.deserialize(user, WorkerTokenInfo.class);
        } catch (Exception e) {
            LOG.info("Could not decode {}, might just be a plain digest request...", userName, e);
            return Optional.empty();
        }

        try {
            byte[] password = getSignedPasswordFor(user, deser);
            return Optional.of(Base64.getEncoder().encodeToString(password).toCharArray());
        } catch (Exception e) {
            LOG.error("Could not get password for token {}/{}", deser.get_userName(), deser.get_topologyId(), e);
            return Optional.empty();
        }
    }

    @Override
    public String userName(String userName) {
        byte[] user = Base64.getDecoder().decode(userName);
        WorkerTokenInfo deser = Utils.deserialize(user, WorkerTokenInfo.class);
        return deser.get_userName();
    }
}