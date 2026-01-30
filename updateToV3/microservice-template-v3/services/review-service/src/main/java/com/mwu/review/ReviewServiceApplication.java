package com.mwu.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mwu")
public class ReviewServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(ReviewServiceApplication.class, args);
  }
}
