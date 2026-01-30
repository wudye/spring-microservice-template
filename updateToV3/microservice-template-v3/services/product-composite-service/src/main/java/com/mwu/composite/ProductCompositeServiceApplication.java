package com.mwu.composite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.mwu")
public class ProductCompositeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductCompositeServiceApplication.class, args);
    }
}
