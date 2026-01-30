package com.mwu.configclientdemo.controller;

import com.mwu.configclientdemo.service.RemoteServiceClient;
import com.netflix.discovery.shared.Applications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    private final RemoteServiceClient client;
    public ClientController(RemoteServiceClient client) {
        this.client = client;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello from Config Client!";
    }
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/services")
    public void services() {
        System.out.println(discoveryClient.getServices());
    }





    @GetMapping("/call")
    public String callRemote() {
        return client.getRemoteHealth();
    }

}
