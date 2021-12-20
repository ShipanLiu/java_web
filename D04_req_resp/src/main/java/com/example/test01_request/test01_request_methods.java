package com.example.test01_request;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/*
* 在tomcat 里面， 我设置了： http://localhost:8080/D04
*
现在只需要访问 http://localhost:8080/D04/test01 就可以了。
* */

@WebServlet(name = "test01", value = "/test01")
public class test01_request_methods extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //01
        System.out.println(req.getContextPath()); // 就是tomcat的地址：   /D04
        // 02
        System.out.println(req.getServletPath()); //    /test01
        // 03  ip adress
        System.out.println(req.getRemoteAddr()); //     0:0:0:0:0:0:0:1
        //04
        System.out.println(req.getQueryString());//     null
        // 05 uri
        System.out.println(req.getRequestURI()); //     /D04/test01     相当于共和国（比较短一点）
        // 06 url
        System.out.println(req.getRequestURL()); //     http://localhost:8080/D04/test01   相当于中华人民共和国
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req,resp);
    }
}