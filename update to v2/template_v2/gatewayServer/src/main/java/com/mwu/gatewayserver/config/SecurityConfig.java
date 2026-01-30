package com.mwu.gatewayserver.config;

import org.springframework.boot.autoconfigure.batch.BatchDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;


@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

@Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {


        http
            .authorizeExchange(exchanges -> exchanges
                    .pathMatchers("/login").permitAll()
                .anyExchange().authenticated()
            )
            .oauth2ResourceServer(jwt -> jwt.jwt(Customizer.withDefaults()));
        return http.build();
    }
}
