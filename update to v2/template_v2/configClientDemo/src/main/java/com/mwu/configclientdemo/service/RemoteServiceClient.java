package com.mwu.configclientdemo.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RemoteServiceClient {

    private final RestTemplate restTemplate;

    public RemoteServiceClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // 使用服务ID（Eureka 注册名）调用，示例 SERVICE-ID 为 CONFIG-CLIENT
    public String getRemoteHealth() {
        return restTemplate.getForObject("http://CONFIG-CLIENT/actuator/health", String.class);
    }
}
