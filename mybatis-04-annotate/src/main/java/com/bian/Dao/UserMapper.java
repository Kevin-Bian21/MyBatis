package com.bian.Dao;

import com.bian.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author Kevin
 * @Data 2021/4/13
 */
public interface UserMapper {

    @Select("Select * from user")
    List<User> getUsers();

    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);

    @Delete("delete from user where id=#{uid}")
    int deleteUser(@Param("uid") int im);
}


