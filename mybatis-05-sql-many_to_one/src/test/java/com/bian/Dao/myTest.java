package com.bian.Dao;

import com.bian.Utils.MybatisUtils;
import com.bian.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

/**
 * @author Kevin
 * @Data 2021/4/18
 */
public class myTest {
    static Logger logger = Logger.getLogger(myTest.class);
    @Test
    public void getStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        logger.info("info:进入了testLog4j");
        List<Student> studentList = mapper.getStudents();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public void getStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        logger.info("info:进入了testLog4j");
        List<Student> studentList = mapper.getStudents2();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }

}
