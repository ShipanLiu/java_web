package com.listener;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// for testing the Test02, to see if could listen the changes


@WebServlet("/listener")
public class Demo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().setAttribute("name", "jiba");
        getServletContext().setAttribute("name", "lisi");

        getServletContext().removeAttribute("name");
    }
}
