package com.example.sourceone.service;


import com.example.entity.User;
import com.example.sourceone.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        System.out.println("参数为："+id);
        return userMapper.Sel(id);
    }
}
