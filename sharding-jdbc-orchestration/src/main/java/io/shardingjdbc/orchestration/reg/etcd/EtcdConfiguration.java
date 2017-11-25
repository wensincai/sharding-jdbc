package io.shardingjdbc.orchestration.reg.etcd;

import lombok.Getter;
import lombok.Setter;

/**
 * Etcd configuration.
 *
 * @author junxiong
 */
@Getter
@Setter
public final class EtcdConfiguration {
    
    /**
     * Etcd server list.
     * 
     * <p>Include ip address and port, multiple servers split by comma. Etc: {@code http://host1:2379,http://host2:2379}</p>
     */
    private String serverLists;
    
    /**
     * Root namespace of etcd cluster.
     */
    private String namespace;
    
    /**
     * Time to live milliseconds of ephemeral keys.
     */
    private int timeToLiveMilliseconds;
    
    /**
     * Timeout when calling a etcd method in milliseconds.
     */
    private int timeoutMilliseconds = 500;
    
    /**
     * Maximal retries when calling a etcd method.
     */
    private int retryIntervalMilliseconds = 200;
    
    /**
     * Maximal retries when calling a etcd method.
     */
    private int maxRetries = 3;
    
    /**
     * Username of etcd cluster.
     * 
     * <p>Default is not need digest</p>
     */
    private String username;
    
    /**
     * Password of etcd cluster.
     */
    private String password;
}
