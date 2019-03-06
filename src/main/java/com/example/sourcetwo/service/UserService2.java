package com.example.sourcetwo.service;


import com.example.sourcetwo.mapper.UserMapper2;
import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserService2 {
    @Autowired
    UserMapper2 userMapper2;
    public User Sel(int id){
        System.out.println("参数为："+id);
        return userMapper2.Sel(id);
    }
}
