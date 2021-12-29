<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>JSP</h1>
<%--这是注释--%>
<%--下面是Java 代码--%>
<%
    System.out.println("hello JSP");
    String str = "jiab";
%>

<%--jsp 表达式--%>

<%=
    "hello<br>"
%>

<%--
    jsp声名变量 或者方法
    if add ! , then is 成员变量
    if 没有 ！ then is 局部变量
--%>

<%! String s = "abc";%>
<%=s%>

<%! public void getSum(){}%>


<br/>
这是我的第一个JSP
</body>
</html>