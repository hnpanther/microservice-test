package com.hadi.bookserviceproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookServiceProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookServiceProjectApplication.class, args);
    }

}
