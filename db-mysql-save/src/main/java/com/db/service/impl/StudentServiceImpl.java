package com.db.service.impl;

import com.db.mapper.StudentMapper;
import com.db.service.StudentService;
import com.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    @Transactional
    public void saveStudent(Student student) {
        studentMapper.saveStudent(student);
    }
}
