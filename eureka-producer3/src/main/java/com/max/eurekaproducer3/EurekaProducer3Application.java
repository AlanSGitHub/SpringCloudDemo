package com.max.eurekaproducer3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaProducer3Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProducer3Application.class, args);
    }

}
