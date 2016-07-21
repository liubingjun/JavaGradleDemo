package com.manage.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.MapPropertySource;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClusterConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class RedisClusterConfig {

    private Logger logger = LoggerFactory.getLogger(RedisClusterConfig.class);

    @Value("${spring.redis.cluster.nodes}")
    private String clusterNodes;

    @Value("${spring.redis.cluster.timeout}")
    private Long timeout;

    @Value("${spring.redis.cluster.max-redirects}")
    private int redirects;

    @Value("${spring.redis.cluster.maxIdle}")
    private int maxIdle;

    @Value("${spring.redis.cluster.maxTotal}")
    private int maxTotal;

    @Value("${spring.redis.cluster.maxWaitMillis}")
    private long maxWaitMillis;

    @Bean
    public RedisClusterConfiguration getClusterConfiguration() {

        Map<String, Object> source = new HashMap<String, Object>();

        source.put("spring.redis.cluster.nodes", clusterNodes);

        source.put("spring.redis.cluster.timeout", timeout);

        source.put("spring.redis.cluster.max-redirects", redirects);

        return new RedisClusterConfiguration(new MapPropertySource("RedisClusterConfiguration", source));

    }

    @Bean
    public JedisConnectionFactory getConnectionFactory() {

        logger.info("getConnectionFactory");
        return new JedisConnectionFactory(getClusterConfiguration(),getJedisPoolConfig());

    }

    @Bean
    public JedisClusterConnection getJedisClusterConnection() {
        logger.info("getJedisClusterConnection");

        return (JedisClusterConnection) getConnectionFactory().getConnection();

    }

    @Bean
    public JedisPoolConfig getJedisPoolConfig() {
        logger.info("getJedisPoolConfig");

        JedisPoolConfig jedisPoolConfig =  new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMaxTotal(maxTotal);
        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
        return jedisPoolConfig;
    }

    @Bean
    public RedisTemplate getRedisTemplate() {
        logger.info("getRedisTemplate");

        RedisTemplate clusterTemplate = new RedisTemplate();

        clusterTemplate.setConnectionFactory(getConnectionFactory());

        clusterTemplate.setKeySerializer(new StringRedisSerializer());

        clusterTemplate.setDefaultSerializer(new JdkSerializationRedisSerializer());

        return clusterTemplate;

    }

    @Bean
    public ListOperations getListOperations() {
        logger.info("getListOperations");
        return getRedisTemplate().opsForList();
    }

    @Bean
    public HashOperations getHashOperations() {
        logger.info("getHashOperations");
        return getRedisTemplate().opsForHash();
    }

    @Bean
    public SetOperations getSetOperations() {
        logger.info("getSetOperations");
        return getRedisTemplate().opsForSet();
    }
}
