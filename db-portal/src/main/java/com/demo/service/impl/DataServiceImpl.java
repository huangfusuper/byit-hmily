package com.demo.service.impl;

import com.demo.service.DataService;
import com.demo.feign.service.MySqlService;
import com.demo.feign.service.StudentRedisService;
import com.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private MySqlService mySqlService;
    @Autowired
    private StudentRedisService redisService;

    @Override
    public void addData() {
        mySqlService.saveStudent(new Student("1","张三"));
        redisService.addRedisData(new Student("1","张三"));
    }
}
