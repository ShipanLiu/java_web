<%@ page import="com.example.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--基本数据类型--%>
    <% request.setAttribute("age", "23");%>
    基本数据类型： ${age}<br>


    <%--获取 自定义对象--%>
    <%
        // EL 表达式里面没有 空指针 异常，
        Student stu = new Student(); // 不传入 name and age
        request.setAttribute("stu", stu);
    %>
    Student: ${stu} <br>
    <%--stu.name 原理： 调用student 里面的 getName()--%>
    name: ${stu.name} <br>
    age: ${stu.age} <br>

    <%--数组--%>
    <%
        String[] arr = {"jier1", "jier2"};
        request.setAttribute("arr", arr);
    %>
    arr: ${arr}<br>
    arr[0]: ${arr[0]}<br>
    arr[1]: ${arr[1]}<br>
    arr[100]: ${arr[100]}<br>  // 没有索引overflow异常

    <%--List--%>
    <%
        ArrayList<String> list = new ArrayList<>();
        list.add("dan1");
        list.add("dan2");
        request.setAttribute("list", list);
    %>

    list: ${list}<br>

    <%--Map--%>
    <%
        HashMap<String, Student> map = new HashMap<>();
        map.put("stu1", new Student("xiaoming", 30));
        map.put("stu2", new Student("jibadan", 40));
        request.setAttribute("map", map);
    %>
    map: ${map} <br>
    map[0].name : ${map.stu1.name} <br>
    map[1].age : ${map.stu2.age}


</body>
</html>
