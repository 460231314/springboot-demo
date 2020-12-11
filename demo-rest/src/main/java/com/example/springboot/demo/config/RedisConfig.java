package com.example.springboot.demo.config;


import com.example.springboot.demo.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

@Configuration
public class RedisConfig {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Bean
    public RedisBootstrap redis() {
        RedisUtils.setRedisTemplate(stringRedisTemplate);
        return new RedisBootstrap();
    }

    static class RedisBootstrap {
    }
}
