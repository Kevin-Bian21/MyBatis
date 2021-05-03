package com.bian.Dao;

import com.bian.Utils.MybatisUtils;
import com.bian.pojo.Student;
import com.bian.pojo.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Kevin
 * @Data 2021/4/18
 */
public class myTest {
    @Test
    public void getTeachers(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        teacherMapper mapper = sqlSession.getMapper(teacherMapper.class);
        List<Teacher> teacherList = mapper.getTeachers();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }
    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        teacherMapper mapper = sqlSession.getMapper(teacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
    @Test
    public void getTeacher2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        teacherMapper mapper = sqlSession.getMapper(teacherMapper.class);
        Teacher teacher = mapper.getTeacher2(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
