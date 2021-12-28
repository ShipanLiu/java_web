package com.example.test03_StudentManageV2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@WebServlet("/addStudentServlet")
public class AddStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //get the data from the form
        String name = req.getParameter("name");
        String age = req.getParameter("age"); // attention, the age now is String
        String grade = req.getParameter("grade");

        // create student object
        Student stu = new Student();
        stu.setName(name);
        stu.setGrade(Integer.parseInt(grade));
        stu.setAge(Integer.parseInt(age));

        // save student to c:\\jiba\stu.txt
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\jiba\\stu.txt", true));
        bw.write(stu.getName() + "," + stu.getAge() + "," + stu.getGrade());
        bw.newLine();
        bw.close();

        // response to the server via the reftrsh timer
        // 在添加成功之后， 两秒之后返回主页。
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("The Student " + stu.getName() + " is saved, go back to homepage in 2 seconds");
        resp.setHeader("Refresh", "2;URL=/D04/homePage.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
