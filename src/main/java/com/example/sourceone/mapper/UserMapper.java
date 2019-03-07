package com.example.sourceone.mapper;


import com.example.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface UserMapper {
    @Select("select * from user where id=#{id}")
    public User Sel(int id);

    @Select("select * from user")
    public List<User> findList();
}
