package com.api.service;

import com.pojo.Student;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface StudentService {
    /**
     * 保存
     * @param student
     */
    @RequestMapping(value = "/saveStudent",method = RequestMethod.POST)
    void saveStudent(@RequestBody Student student);
}
