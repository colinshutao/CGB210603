package com.jt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jt.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
//@Mapper
public interface UserMapper extends BaseMapper<User> {
    //查询所有的user用户

}
