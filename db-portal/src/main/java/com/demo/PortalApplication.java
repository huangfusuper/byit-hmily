package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ImportResource;

/**
 * @author huangfu
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@ImportResource({"classpath:applicationContext.xml"})
public class PortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(PortalApplication.class);
    }
}
