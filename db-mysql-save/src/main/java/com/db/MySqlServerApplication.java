package com.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ImportResource;

/**
 * @author huangfu
 */
@SpringBootApplication
@EnableEurekaClient
@ImportResource({"classpath:applicationContext.xml"})
@MapperScan("com.db.mapper")
public class MySqlServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySqlServerApplication.class,args);
    }
}
