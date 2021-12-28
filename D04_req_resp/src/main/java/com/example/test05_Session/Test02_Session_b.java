package com.example.test05_Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/session02")
public class Test02_Session_b extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //浏览器访问： http://localhost:8080/D04/session02


        HttpSession session = req.getSession();

        // 输出 session ID 检查是否同一个ID
        System.out.println(session.getId());  // AE2A076FB23D5D9425BD042A007EFC39

        // get the "username" from test01
        Object username = session.getAttribute("username");

        // show the username back to client brower
        resp.getWriter().write(username + "");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
