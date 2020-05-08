package com.surfilter.sbserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SbserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbserverApplication.class, args);
    }

}
