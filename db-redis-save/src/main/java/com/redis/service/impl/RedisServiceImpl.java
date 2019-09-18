package com.redis.service.impl;

import com.pojo.Student;
import com.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author huangfu
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;
    @Override
    public void addRedisData(Student student) {
        redisTemplate.opsForValue().set(student.getName(),student);
    }
}
