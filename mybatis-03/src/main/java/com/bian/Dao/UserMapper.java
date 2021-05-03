package com.bian.Dao;

import com.bian.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author Kevin
 * @Data 2021/4/13
 */
public interface UserMapper {
    //根据id查询用户
    User getUserById(int id);
    //分页:limit实现
    List<User> getUserByLimit(Map<String,Integer> map);
    //分页2:RowBounds实现
    List<User> getUserByRowBounds();
}


