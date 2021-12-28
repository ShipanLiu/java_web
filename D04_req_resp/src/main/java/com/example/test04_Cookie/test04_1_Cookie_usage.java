package com.example.test04_Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/test04_1")
public class test04_1_Cookie_usage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.write("最后的访问时间： <br>");

        Cookie cookie = new Cookie("time", System.currentTimeMillis() + "");

        // set the maxmal live time
        cookie.setMaxAge(3600);  // 1 hour

        // send the cookie back to client
        resp.addCookie(cookie);

        // get the cookie
        Cookie[] cookies = req.getCookies();
        for(Cookie c : cookies) {
            if("time".equals(c.getName())) {
                String value = c.getValue();
                // format 一下
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
                // the "value" is a string, we need to change it to long
                writer.write(simpleDateFormat.format(new Date(Long.parseLong(value))));
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
