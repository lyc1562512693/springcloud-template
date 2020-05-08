package com.surfilter.ribbon.controller;

import com.surfilter.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ribbon")
public class RibbonController {
    @Autowired
    protected RibbonService ribbonService;
    @GetMapping("/getClientUser")
    public String getClientUser(int id){
        return ribbonService.getUserById(id);
    }
    @GetMapping("/getClient")
    public String getClient(){
        return ribbonService.getClient();
    }
}
