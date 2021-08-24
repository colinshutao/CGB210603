package com.jt.mapper;

import com.jt.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
//@Mapper
public interface UserMapper {
    //查询所有的user用户
    List<User> findAll();
}
