package com.surfilter.feign.hystrix;

import com.surfilter.feign.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class MyHystrix implements FeignService {
    @Override
    public String printMessage(int id) {
        return "哈哈发放的";
    }
}
