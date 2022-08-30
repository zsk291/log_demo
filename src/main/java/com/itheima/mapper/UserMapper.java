package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    /**
     * 根据用户名和密码查询对象
     * @param username
     * @param password
     * @return
     */
    @Select("select * from mybatis.tb_user where username = #{username} and password = #{password};")
    User sel(@Param("username") String username,@Param("password") String password);

    /**
     * 检验是否存在该用户
     * @param username
     * @return
     */
    @Select("select * from mybatis.tb_user where username = #{username};")
    User selByname(String username);

    /**
     * 添加一个用户
     * @param user
     */
    @Insert("insert into mybatis.tb_user values (null,#{username},#{password});")
    void addUser(User user);
}
