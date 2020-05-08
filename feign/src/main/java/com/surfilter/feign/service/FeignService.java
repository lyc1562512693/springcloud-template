package com.surfilter.feign.service;

import com.surfilter.feign.hystrix.MyHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-client3",fallback = MyHystrix.class)
public interface FeignService {
    @GetMapping(value = "/client3")
    String printMessage(@RequestParam("id")int id);
}
