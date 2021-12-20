package com.example.test01_request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;

/*
 这里需要打开html 文件先进行注册
* */

@WebServlet(name = "test03", value = "/test03")
public class test03_request_parameters extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // get a single para value
        System.out.println(req.getParameter("name"));

        //  get all values from a para(is the para contains multiple values)
        String[] hobbies = req.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }

        System.out.println("*********************");

        Enumeration<String> parameterNames = req.getParameterNames();
        while(parameterNames.hasMoreElements()) {
            System.out.println(parameterNames.nextElement());
        }

        System.out.println("***********************");

        Map<String, String[]> parameterMap = req.getParameterMap();
        for(String key: parameterMap.keySet()) {
            System.out.print(key);
            String[] values = parameterMap.get(key);
            for(String value : values) {
                System.out.print(value + " , ");
            }
            System.out.println("");
        }

        PrintWriter writer = resp.getWriter();
        writer.println("submit with success");
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req,resp);
    }
}