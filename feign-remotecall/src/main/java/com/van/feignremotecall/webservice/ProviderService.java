package com.van.feignremotecall.webservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname ProviderService
 * @Description TODO
 * @Author fbz
 * @Date 2019/5/10 11:55
 * @Version 1.0
 **/
@FeignClient( value = "provider-service")
public interface ProviderService {

    @RequestMapping(value = "/pro/out")
    String string();
}
