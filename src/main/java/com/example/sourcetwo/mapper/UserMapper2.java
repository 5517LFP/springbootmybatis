package com.example.sourcetwo.mapper;


import com.example.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
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

    @Insert("insert INTO user(id,userName,passWord,realName) VALUES (#{user.id},#{user.userName},#{user.passWord},#{user.realName})")
    void insert (@Param("user") User user);

    @Insert("insert INTO user(id,userName,passWord,realName) VALUES (#{id},#{uname},#{pwd},#{rname})")
    void insert2 (@Param("id") int id, @Param("uname") String uname,@Param("pwd") String pwd,@Param("rname") String rname);

    @Delete("delete  from user where id=#{id}")
    void delete(int id);
}
