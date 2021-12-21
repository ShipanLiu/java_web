package com.example.test01_request;

import com.example.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Map;

/*
 这里需要打开html 文件先进行注册
* */

@WebServlet(name = "test03", value = "/test03")
public class test03_request_parameters extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // get a single para value
        String name = req.getParameter("name");
        System.out.println(name);
        String age = req.getParameter("age");
        System.out.println(age);

        //  get all values from a para(is the para contains multiple values)
        String[] hobbies = req.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }

        System.out.println("*********************");

        Enumeration<String> parameterNames = req.getParameterNames();
        while(parameterNames.hasMoreElements()) {
            System.out.println(parameterNames.nextElement());
        }

        System.out.println("***********************");

        Map<String, String[]> parameterMap = req.getParameterMap();
        for(String key: parameterMap.keySet()) {
            System.out.print(key);
            String[] values = parameterMap.get(key);
            for(String value : values) {
                System.out.print(value + " , ");
            }
            System.out.println("");
        }

        PrintWriter writer = resp.getWriter();
        writer.println("submit with success");
        writer.close();


        // 手动封装 encapsulate a studnet Object
        Student stu = new Student(name, age, hobbies);

        // sout the object
        System.out.println(stu);

        /*1.反射的方式来进行封装。我不需要关心获得的是name 还是age。 我关心的是 给他反射进去*/
        Map<String, String[]> maps = req.getParameterMap();

        // 2.encapsulate student object
        Student stu2 = new Student();
        // 2.1
        for(String key : maps.keySet()) {
            String[] value = maps.get(key);
            try {
                // 属性描述器，input the properities and get the corresponding get/set method
                PropertyDescriptor pd = new PropertyDescriptor(key, stu2.getClass());
                Method writeMethod = pd.getWriteMethod();
                // invoke the values to the corresponding keys in Student, like name or age...
                if(value.length > 1) {
                    // this means the item in the array is more than one
                    writeMethod.invoke(stu2, (Object)value);
                } else {
                    writeMethod.invoke(stu2, value);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // 输出看看效果。
        System.out.println("this is stu2");
        System.out.println(stu2);




        /*3下面第三种方式  自动封装， 使用工具类。*/
//        下载 commons-beanutils.jar


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req,resp);
    }
}