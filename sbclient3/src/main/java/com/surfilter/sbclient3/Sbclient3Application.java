package com.surfilter.sbclient3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@EnableEurekaClient
@SpringBootApplication
public class Sbclient3Application {

    public static void main(String[] args) {
        SpringApplication.run(Sbclient3Application.class, args);
    }

}
