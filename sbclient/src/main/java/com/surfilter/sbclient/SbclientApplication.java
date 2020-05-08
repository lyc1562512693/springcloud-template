package com.surfilter.sbclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableEurekaClient
@SpringBootApplication
public class SbclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbclientApplication.class, args);
    }

    @GetMapping("/client")
    public String getClient(){
        return "this is client1";
    }
}
