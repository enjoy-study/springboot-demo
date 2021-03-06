package com.bill;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 自定义starter
 * properties
 */
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {
    private String host;
    private int port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
