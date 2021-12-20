/*
* 这里使用自动注解的方式进行。
*
* */


package com.example.test01_tomcat2;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Test1", value = "/Test1")   // 浏览器访问： http://localhost:8080/Tomcat2/Test1
public class Test1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("tomcat2 excuted");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}