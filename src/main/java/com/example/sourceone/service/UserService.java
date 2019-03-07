package com.example.sourceone.service;


import com.example.entity.User;
import com.example.sourceone.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public PageInfo<User> findList(int pagenum,int pageSize){
        PageHelper.startPage(pagenum,pageSize);

        List<User> list=userMapper.findList();
        PageInfo<User> showlist=new PageInfo<User>(list);
        return showlist;


    }
}
