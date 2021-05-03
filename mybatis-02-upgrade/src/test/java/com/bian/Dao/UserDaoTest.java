package com.bian.Dao;

import com.bian.utils.MybatisUtils;
import com.bian.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Kevin
 * @Data 2021/4/13
 */
public class UserDaoTest {
    @Test
    public void getUserList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for(User user : userList){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
