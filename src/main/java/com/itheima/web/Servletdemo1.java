package com.itheima.web;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.Brand;
import com.itheima.pojo.User;
import com.itheima.util.SqlSessionFactoryCre;
import org.apache.commons.io.IOUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/demo1")
public class Servletdemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Brand> brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"三只松鼠","三只松鼠",100,"三只松鼠，好吃不上火",1));
        brands.add(new Brand(2,"优衣库","优衣库",200,"优衣库，服适人生",0));
        brands.add(new Brand(3,"小米","小米科技有限公司",1000,"为发烧而生",1));
        request.setAttribute("brands",brands);
        request.getRequestDispatcher("/replay.jsp").forward(request,response);
        String username = request.getParameter("username");
        username = new String(username.getBytes(StandardCharsets.ISO_8859_1),StandardCharsets.UTF_8);
        String password = request.getParameter("password");
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryCre.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.sel(username, password);
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        if (user!=null){
            writer.write(user.getUsername()+"您好");
        }else {
            writer.write("宁输入的用户不存在");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
