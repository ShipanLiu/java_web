package com.example.test02_studentManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // if the form was saved, the we need to get the data
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String score = req.getParameter("grade");

        //  save the file to local
        BufferedWriter bw = new BufferedWriter(new FileWriter("C://jiba//studentInformation.txt", true));
        bw.write(name + "," + age + "," + score);
        bw.newLine();
        bw.close();

        // response to the server
        // get the writer from the resp
        PrintWriter writer = resp.getWriter();
        writer.println("saved with success");
        // close the writer
        writer.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
