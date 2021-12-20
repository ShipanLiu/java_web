package com.example.test01_request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/*
* 在tomcat 里面， 我设置了： http://localhost:8080/D04
*
现在只需要访问 http://localhost:8080/D04/test01 就可以了。
* */

@WebServlet(name = "test02", value = "/test02")
public class test02_request_headers extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // get a single header
        System.out.println(req.getHeader("Connection"));
        // get multiple headers
        Enumeration<String> headers = req.getHeaders("Accept-Encoding");
        // iteration
        while (headers.hasMoreElements()) {
            System.out.println(headers.nextElement());
        }

        System.out.println("*****************");
        Enumeration<String> headerNames = req.getHeaderNames();
        while(headerNames.hasMoreElements()) {
            String singleHeaderName = headerNames.nextElement();
            String singleValue = req.getHeader(singleHeaderName);
            System.out.println(singleHeaderName + " : " + singleValue);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}


//keep-alive
//        gzip, deflate, br
//        *****************
//        host : localhost:8080
//        connection : keep-alive
//        sec-ch-ua : "Chromium";v="94", "Google Chrome";v="94", ";Not A Brand";v="99"
//        sec-ch-ua-mobile : ?0
//        sec-ch-ua-platform : "Windows"
//        upgrade-insecure-requests : 1
//        user-agent : Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.81 Safari/537.36
//        accept : text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9
//sec-fetch-site : none
//sec-fetch-mode : navigate
//sec-fetch-user : ?1
//sec-fetch-dest : document
//accept-encoding : gzip, deflate, br
//accept-language : en,zh;q=0.9,zh-TW;q=0.8,pt-BR;q=0.7,pt;q=0.6,en-US;q=0.5,zh-CN;q=0.4,de;q=0.3
//cookie : JSESSIONID=93A9324CD42B7699B0B4BD30EAC2B6B6; Idea-43d89001=a997c250-6aaa-4e9b-a735-cff3d521a344