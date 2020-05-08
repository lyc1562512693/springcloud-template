package com.surfilter.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;
    public String getUserById(int id){
        return restTemplate.getForObject("http://SERVICE-CLIENT3/client3?id=" + id,String.class);
    }

    public String getClient() {
        return restTemplate.getForObject("http://SERVICE-CLIENT/client",String.class);
    }
}
