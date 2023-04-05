package com.example.mall.goods.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.rebloom.client.Client;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private int port;

    @Value("${spring.redis.bloom-filter.name}")
    private String name;

    @Value("${spring.redis.bloom-filter.init-capacity}")
    private long initCapacity;

    @Value("${spring.redis.bloom-filter.error-rate}")
    private double errorRate;

    @Bean
    public <T> RedisTemplate<String, T> redisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<String, T> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(connectionFactory);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        return redisTemplate;
    }

    @Bean
    public Client redisBloomClient() {
        Client redisBloomClient = new Client(host, port);
        redisBloomClient.createFilter(name, initCapacity, errorRate);
        return redisBloomClient;
    }
}
