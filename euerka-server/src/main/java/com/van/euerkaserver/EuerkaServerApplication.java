package com.van.euerkaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  /*开启euerka服务端*/
public class EuerkaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EuerkaServerApplication.class, args);
       // new SpringApplicationBuilder(EuerkaServerApplication.class).web(true).run(args);
    }
}
