package com.jt.test;

import com.jt.pojo.Dog;
import com.jt.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class TestSpring {

    @Autowired
    private User user;
    @Autowired
    private Dog dahuang;

    @Test
    public void testDog() {
        dahuang.setDogId(1).setDogName("tugou").setDogLike("gutou");
        System.out.println(dahuang.toString());
    }




    @Test
    public void testUser() {
        System.out.println(user.toString());
    }
}

