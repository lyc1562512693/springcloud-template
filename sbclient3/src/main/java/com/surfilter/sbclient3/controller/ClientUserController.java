package com.surfilter.sbclient3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientUserController {
    @GetMapping("/client3")
    public String getName(int id){
        if(id == 1){
            return "client1";
        }
        return "client3";
    }
}
