package com.bian.Dao;

import com.bian.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Kevin
 * @Data 2021/4/18
 */
public interface teacherMapper {
    //获取所有老师
    List<Teacher> getTeachers();

    //获取指定老师下的所有学生及老师的信息
    Teacher getTeacher(@Param("tid")int id);
    Teacher getTeacher2(@Param("tid")int id);
}
