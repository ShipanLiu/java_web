package com.example.test05_Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/session01")
public class Test01_Session_a extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 这样使用：  http://localhost:8080/D04/session01?username=jiba

        String username = req.getParameter("username");

        // get the HttpSession Onject
        HttpSession session = req.getSession();  // 默认参数 true

        // 输出 session ID 检查是否同一个ID
        System.out.println(session.getId());  // AE2A076FB23D5D9425BD042A007EFC39

        // import the data to session
        session.setAttribute("username", username);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
