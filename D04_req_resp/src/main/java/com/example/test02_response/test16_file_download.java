/*
 * 文件的下载
 * */


package com.example.test02_response;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/test16")
public class test16_file_download extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // 01 create the byteStream
       // 02 set the response header for the supported header type
       // 03 set the response header and tell it I am going to download
       // 04 read the stream
       // 05 iterative read and write
       // 06 close
        String realPath = getServletContext().getRealPath("/img/1.png");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(realPath));

        /*
        * application/octet-stream   ：应用类型为字节流。
        * */
        resp.setHeader("Content-Type","application/octet-stream");
        /*
        * Content-Disposition : 应该如何处理。
        * atachment;filename=egalDownload.png ： 以附件的形式进行处理， 指定下载的名称。
        * */
        resp.setHeader("Content-Disposition", "atachment;filename=egalDownload.png");

        ServletOutputStream outputStream = resp.getOutputStream();


        byte[] arr = new byte[1024];
        int len;
        while((len = bufferedInputStream.read(arr)) != -1) {
            outputStream.write(arr, 0, len);
        }
        bufferedInputStream.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
