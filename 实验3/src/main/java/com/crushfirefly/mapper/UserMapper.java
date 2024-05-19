package com.crushfirefly.mapper;

import com.crushfirefly.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("insert into user(username, password) values (#{username},#{password})")
    void insertUser(User user);

    @Select("select * from user where username= #{username}")
    User getUserByUsername(User user);

    @Select("select * from user where username = #{username} and password = #{password}")
    User getUserByUsernameAndPassword(User user);
}
