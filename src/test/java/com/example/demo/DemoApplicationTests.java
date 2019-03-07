package com.example.demo;



import com.example.entity.User;


import com.example.sourcetwo.mapper.UserMapper2;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


    @Autowired
   UserMapper2 userMapper2;


    @Test
    public void contextLoads() {
    }
    @Test
    public void test(){
      /*  User user=new User();
        user.setRealName("dsfsd");
        user.setUserName("sdfa");
        user.setId(66);
        user.setPassWord("dsd");
        userMapper2.insert(user);*/
    }


}
