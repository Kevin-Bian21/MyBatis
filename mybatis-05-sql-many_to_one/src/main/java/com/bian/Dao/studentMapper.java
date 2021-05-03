package com.bian.Dao;

import com.bian.pojo.Student;
import com.bian.pojo.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Kevin
 * @Data 2021/4/18
 */
public interface studentMapper {
    List<Student> getStudents();
    List<Student> getStudents2();
    Teacher getTeacherById(int id);
}
