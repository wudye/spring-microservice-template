package com.mwu.gatewayserver.config;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggingGatewayFilterFactory extends
        AbstractGatewayFilterFactory<LoggingGatewayFilterFactory.
                        Config> {
    public LoggingGatewayFilterFactory() {
        super(Config.class);
    }
    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            System.out.println("Incoming request: " +
                    exchange.getRequest().getURI());
            return chain.filter(exchange);
        };
    }
    public static class Config {
// Put the configuration properties for your filter here
    }
}