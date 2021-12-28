/*
 * 定时刷新
 * */


package com.example.test02_response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test13")
public class test13_response_auto_refresh extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String msg = "无法注册， fuck you，you will be redirected to regist.html after 3 seconds";

        // 三秒之后， 自动刷新。
        resp.setHeader("Refresh", "3;URL=/D04/regist.html");

        resp.setContentType("text/html;charset=UTF-8");

        resp.getWriter().write(msg);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
