package com.example.test01_request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
请求转发

访问 http://localhost:8080/D04/test05
* */

@WebServlet(name = "test07", value = "/test07")
public class test07_request_include_a extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        // set the shared data
        req.setAttribute("jiba", "dan");

        // get the requestdispatcher obj
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/test08");
        // 转发
        requestDispatcher.include(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req,resp);
    }
}