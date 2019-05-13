package com.van.feignconsumer.controller;

import com.van.feignconsumer.webservice.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname FeignConsumer
 * @Description TODO
 * @Author fbz
 * @Date 2019/5/10 11:59
 * @Version 1.0
 **/
@RestController
@RequestMapping("/feign")
public class FeignConsumer {

    @Autowired
    private ProviderService providerService;

    @RequestMapping("/remotecall")
    public String test(){
        String string = providerService.string();
        return string;
    }

}
