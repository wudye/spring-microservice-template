package com.mwu.licensingservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
@EnableFeignClients
public class LicensingServiceApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(LicensingServiceApplication.class, args);
    }
}
