package com.mwu.productservice.product;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(
        scanBasePackages = {
                "com.mwu"
        })
public class ProductServiceApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(ProductServiceApplication.class, args);
    }
}
