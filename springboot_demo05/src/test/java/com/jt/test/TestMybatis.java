package com.jt.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jt.mapper.UserMapper;
import com.jt.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class TestMybatis {

    @Autowired
    private UserMapper userMapper; //必须有对象!!!!

    @Test
    public void test01() {



//        List<User> userList = userMapper.findAll();
//        System.out.println(userList.size());

//insert into
        User user1 = new User();
        user1.setName("america").setAge(22).setSex("323d");
        userMapper.insert(user1);
        System.out.println("insert into OK!");

//update
        User user2 = new User();
        user2.setId(43).setName("周淑涛").setAge(21).setSex("2");
        userMapper.updateById(user2);
        System.out.println("update ok!");

//select
        User user4 = userMapper.selectById(43);
        System.out.println(user4);
        System.out.println("select ok!");

//delete
        Integer i = userMapper.deleteById(237);
        if (i != null) {
            System.out.println(i);
            System.out.println("删除成功！");
        }


    }

    @Test
    public void test02() {
        //1.通过对象封装数据
        User user1 = new User();
        user1.setName("小乔").setSex("女");
        //2.构建条件构造器 根据对象中不为null的属性充当where条件!
        QueryWrapper<User> queryWrapper = new QueryWrapper<>(user1);
        //3.根据条件构造器 实现数据查询
        List<User> userList= userMapper.selectList(queryWrapper);
        System.out.println(userList);
    }

    @Test
    public void test03() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", "君");
        List<User> userList = userMapper.selectList(queryWrapper);
        System.out.println(userList);


    }
    @Test
    public void select06(){
        String name = "貂蝉";
        int age = 18;
        boolean nameFlag = name == null ? false : true;
        boolean ageFlag = age == 0 ? false : true;
        QueryWrapper<User> queryWrapper = new QueryWrapper();
        queryWrapper.eq(nameFlag,"name",name)
                .eq(ageFlag,"age",age);
        List<User> userList = userMapper.selectList(queryWrapper);
        System.out.println(userList);
    }
    @Test
    public void selectIn(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("name","王德发","貂蝉");
//        queryWrapper.in("name",1，2，3，4，);
        List<User> userList = userMapper.selectList(queryWrapper);
        System.out.println(userList);

        //数组在未来由用户负责传递. 注意使用包装类型
        Integer[] array = new Integer[]{1,4,5,6};
        //数组转化为List集合
        List ids = Arrays.asList(array);
//        List<Integer> ids = new ArrayList<>();
//        ids.add(1);
//        ids.add(4);
//        ids.add(5);
//        ids.add(6);
        List<User> userList2 = userMapper.selectBatchIds(ids);
        System.out.println(userList2);
    }

    /**
     * 9.查询性别为男的用户,只查询ID字段
     *  selectObjs(); 只查询第一列字段(主键)
     *  实际用途:  根据业务只需要主键的查询
     */
    @Test
    public void selectObjs(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("sex","男");
//        queryWrapper.eq("name","貂蝉"); => [12, 38]
        List<Object> ids = userMapper.selectObjs(queryWrapper);
        System.out.println(ids);
    }
}