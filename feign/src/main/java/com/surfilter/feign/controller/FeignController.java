package com.surfilter.feign.controller;

import com.surfilter.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/feign")
public class FeignController {
    @Autowired
    protected FeignService feignService;
    @GetMapping(value="/print")
    public String printMessage(int id){
       return feignService.printMessage(id);
    }
}
