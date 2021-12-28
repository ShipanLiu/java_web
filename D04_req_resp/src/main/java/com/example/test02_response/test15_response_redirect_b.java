/*
 * 这是 redirect 的目的地。
 * */


package com.example.test02_response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test15")
public class test15_response_redirect_b extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         // we will get a "null", because the attribute from another server can out be shared
        // because of redirect.
        System.out.println(req.getParameter("name"));

        System.out.println("redirect b is executed");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
