package com.example.controller;

import com.example.sourceone.service.UserService;
import com.example.sourcetwo.service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserService2 userService2;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }

    @RequestMapping("getUser2/{id}")
    public String GetUser2(@PathVariable int id){
        return userService2.Sel(id).toString();
    }
}
