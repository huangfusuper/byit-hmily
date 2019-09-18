package com.db.controller;

import com.db.service.StudentService;
import com.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySqlController implements com.api.service.StudentService {
    @Autowired
    private StudentService studentService;

    @Override
    @Transactional
    @RequestMapping("saveStudent")
    public void saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }
}
