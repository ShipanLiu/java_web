package com.example.test01_request;

import com.example.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.PropertyDescriptor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Map;

/*
 这里需要打开html 文件先进行注册

 使用stream 来进行获取数据,

 结果是： name=shipan&age=23&hobby=study&hobby=game   不容易分割。 因此不怎么用
* */

@WebServlet(name = "test04", value = "/test04")
public class test04_request_IO_params extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // set the encoding method
        req.setCharacterEncoding("UTF-8");

        // 字符流  ---- 基本用不到
//        BufferedReader br = req.getReader();
//        String line;
//        while((line = br.readLine()) != null) {
//            System.out.println(line);
//        }

        //br.close();  no need, if the req terminated, the br will also be closed
        // attention, the form submit method should be post in html file

        // 字节流   ----  用户上传文件时候， 需要将文件转化成字节流
        System.out.println("字节流开始啦");
        ServletInputStream inputStream = req.getInputStream();
        // define a container to save the byte
        byte[] byteContainer = new byte[1024];
        int len;
        while((len = inputStream.read(byteContainer)) != -1) {
            // convert to string at the end
            System.out.println(new String(byteContainer, 0, len));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req,resp);
    }
}