package com.example.test03_StudentManageV2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
/*
* realize the check and list the students functions
* */

@WebServlet("/listStudentServlet")
public class ListStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\jiba\\stu.txt"));

        ArrayList<Student> list = new ArrayList<>();

        // read the data from the file
        String line;  // 一行一行地读。
        while((line = br.readLine()) != null) {
            // 张三，23，100
            Student stu = new Student();
            String[] splitArr = line.split(",");
            // 把读到的东西 封装到一个student 的类里面。
            stu.setName(splitArr[0]);
            stu.setAge(Integer.parseInt(splitArr[1]));
            stu.setGrade(Integer.parseInt(splitArr[2]));

            // add the stu into the array
            list.add(stu);
        }

        // 遍历集合 ： 将数据响应给服务器
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        for(Student stu: list) {
            writer.write(stu.getName() + "," + stu.getAge() + "," + stu.getGrade());
            writer.write("<br/>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
