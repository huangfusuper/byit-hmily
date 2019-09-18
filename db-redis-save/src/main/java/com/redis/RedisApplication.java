package com.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableEurekaClient
@ImportResource({"classpath:applicationContext.xml"})
public class RedisApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class,args);
    }
}
