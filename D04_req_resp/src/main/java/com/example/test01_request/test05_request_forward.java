package com.example.test01_request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
请求转发

访问 http://localhost:8080/D04/test05
* */

@WebServlet(name = "test05", value = "/test05")
public class test05_request_forward extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // set the shared data
        req.setAttribute("tender", "male");

        // get the requestdispatcher obj
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/test06");
        // 转发
        requestDispatcher.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req,resp);
    }
}