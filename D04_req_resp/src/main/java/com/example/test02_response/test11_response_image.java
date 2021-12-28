/*
 *   The webapp is always the root folder,
 *  so the img should be put under the webapp folder
 *
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
import java.io.PrintWriter;

@WebServlet("/test11")
public class test11_response_image extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         // 在发布之后， 这个相对路径 "/img/1.png" 就回完蛋， 要找到绝对路径。

        String realPath = getServletContext().getRealPath("/img/1.png");
        System.out.println("the real path is: " + realPath);

        // create stream input(read), of the image
        BufferedInputStream readStream = new BufferedInputStream(new FileInputStream( realPath));

        // create response output stream
        ServletOutputStream outputStream = resp.getOutputStream();

        // iterative read and write
        byte[] container = new byte[1024];
        int len;
        while((len = readStream.read(container)) != -1) {
            outputStream.write(container, 0 , len);
        }

        // close the resource
        readStream.close();   // outputStream随着 resp的消失， 而消失。
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
