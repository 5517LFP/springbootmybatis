package com.example.sourcetwo.mapper;


import com.example.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface UserMapper2 {
    @Select("select * from user where id=#{id}")
    User Sel(int id);
}
