package com.db.mapper;

import com.pojo.Student;
import org.apache.ibatis.annotations.Insert;

/**
 * @author mapper
 */
public interface StudentMapper {
    /**
     * 保存方法
     * @param student
     */
    @Insert("insert into student values(#{id},#{name})")
    void saveStudent(Student student);
}
