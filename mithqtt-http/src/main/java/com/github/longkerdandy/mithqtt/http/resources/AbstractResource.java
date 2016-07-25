package com.github.longkerdandy.mithqtt.http.resources;

import com.github.longkerdandy.mithqtt.api.auth.Authenticator;
import com.github.longkerdandy.mithqtt.http.cluster.NATSCluster;
import com.github.longkerdandy.mithqtt.http.util.Validator;
import com.github.longkerdandy.mithqtt.storage.redis.sync.RedisSyncStorage;

/**
 * Abstract Base Resource
 */
public abstract class AbstractResource {

    protected final String serverId;
    protected final Validator validator;
    protected final RedisSyncStorage redis;
    protected final NATSCluster cluster;
    protected final Authenticator authenticator;

    public AbstractResource(String serverId, Validator validator, RedisSyncStorage redis, NATSCluster cluster, Authenticator authenticator) {
        this.serverId = serverId;
        this.validator = validator;
        this.redis = redis;
        this.cluster = cluster;
        this.authenticator = authenticator;
    }
}
