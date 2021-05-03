package com.bian.Dao;

import com.bian.pojo.User;

import java.util.List;

/**
 * @author Kevin
 * @Data 2021/4/13
 */
public interface UserMapper {
    //查询全部用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
    //插入一个用户
    int addUser(User user);
    //修改一个用户
    int updateUser(User user);
    //删除一个用户
    int deleteUser(int id);
}

