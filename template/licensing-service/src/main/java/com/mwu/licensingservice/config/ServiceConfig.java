package com.mwu.licensingservice.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Service;

@Configuration
@ConfigurationProperties(prefix = "example")
@Getter
@Service
public class ServiceConfig {

    private String property;

    public void setProperty(String property) {
        this.property = property;
        System.out.println("GsonBuilderUtils property set to: " + property);
    }
    @Value("${redis.server}")
    private String redisServer="";
    @Value("${redis.port}")
    private String redisPort="";
}
