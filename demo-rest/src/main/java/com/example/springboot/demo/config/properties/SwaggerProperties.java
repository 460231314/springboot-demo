package com.example.springboot.demo.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author yujie
 */
@Configuration
@ConfigurationProperties(prefix = "swagger", ignoreUnknownFields = true)
@PropertySource("classpath:runtime.properties")
@Data
@Component
public class SwaggerProperties {

    /**
     * 是否开启swagger
     */
    private Boolean enabled;

}
