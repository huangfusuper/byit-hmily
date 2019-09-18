package com.api.service;

import com.pojo.Student;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author huangfu
 */
public interface RedisService {
    /**
     * 向redis添加一条数据
     * @param student
     */
    @RequestMapping(value = "/addRedisData",method = RequestMethod.POST)
    void addRedisData(@RequestBody Student student);
}
