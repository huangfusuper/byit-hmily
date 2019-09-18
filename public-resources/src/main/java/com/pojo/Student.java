package com.pojo;

import lombok.Data;

/**
 * @author 实体
 */
@Data
public class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }
}
