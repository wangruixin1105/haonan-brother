package com.haonan.common.redis.redisson;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * redisson 连接配置类
 */
@Component
@ConfigurationProperties(prefix = "redisson")
@Data
public class RedissonProperties {

    private String serverAddress;

    private String port;

    private String password;

}
