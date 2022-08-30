package com.itheima.web;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import com.itheima.util.SqlSessionFactoryCre;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

@WebServlet("/demo2")
public class Servletdemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        username = new String(username.getBytes(StandardCharsets.ISO_8859_1),StandardCharsets.UTF_8);
        String password = request.getParameter("password");
        User user1 = new User();
        user1.setUsername(username);
        user1.setPassword(password);
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryCre.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selByname(username);
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        if (user==null){
            mapper.addUser(user1);
            writer.write("注册成功");

        }else {
            writer.write("该用户已被注册，请更换用户名注册");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}


