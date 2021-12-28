/*
 * redirect, not like request forward, redirect happens on response and it might redirect to
 * another server and the request resource can not be shared as well
 * */


package com.example.test02_response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test14")
public class test14_response_redirect_a extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("redirect A is executed");

        // set shared attribute, check if redirect could get or not
        req.setAttribute("name", "jiba");

        // redirect to /D04/test15（可以想象成一个其他的服务器。）
//        resp.sendRedirect(req.getContextPath() + "/test15");
        resp.sendRedirect("http://youtube.com");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
