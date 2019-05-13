package com.van.apigetway;

import com.van.apigetway.filter.AccessFilter;
import com.van.apigetway.filter.secondFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
/*开启zuul的api网关服务功能*/
@EnableZuulProxy
public class ApiGetwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGetwayApplication.class, args);
    }

    @Bean
    public AccessFilter accessFilter(){
        return  new AccessFilter();
    }

    @Bean
    public secondFilter secondFilter(){
        return new secondFilter();
    }
}
