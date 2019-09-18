package com.redis.controller;

import com.pojo.Student;
import com.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangfu
 */
@RestController
public class RedisController implements com.api.service.RedisService {

    @Autowired
    private RedisService redisService;

    @RequestMapping("/addRedisData")
    @Override
    public void addRedisData(@RequestBody Student student) {
        redisService.addRedisData(student);
    }
}
