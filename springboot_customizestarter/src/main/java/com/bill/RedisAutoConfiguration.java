package com.bill;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

@Configuration //开启配置
@ConditionalOnClass(Jedis.class) //配置类什么时候加载,环境中有Jedis.class则加载
@EnableConfigurationProperties(RedisProperties.class) //开启使用映射实例
@ConditionalOnProperty //存在对应配置信息时初始化加载该配置类（即application.prpperties中有redis前缀的配置）
        (
                prefix = "redis",//存在配置前缀redis
                value = "enabled",//开启
                matchIfMissing = true//缺失检查
        )
public class RedisAutoConfiguration {
    /**
     * 环境中没有Jedis
     * @param redisProperties
     * @return
     */
    @Bean
    @ConditionalOnMissingBean //环境里已经有Jedis不加载,当环境中没有Jedis才加载，防止重复加载
    public Jedis jedis(RedisProperties redisProperties) {
        return new Jedis(redisProperties.getHost(), redisProperties.getPort());
    }
}
