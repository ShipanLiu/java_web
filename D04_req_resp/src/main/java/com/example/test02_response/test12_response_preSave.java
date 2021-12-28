/*
 * 缓存， 可以缓存1小时， 通用的东西 就不需要再次向服务器请求了。
 * */


package com.example.test02_response;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/test12")
public class test12_response_preSave extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String news = "这是一个火爆的新闻";

        // set the save time, expires after one hour
        resp.setDateHeader("Expires", System.currentTimeMillis() + 1*60*60*1000);

        resp.setContentType("text/html;charset=UTF-8");

        resp.getWriter().write(news);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
