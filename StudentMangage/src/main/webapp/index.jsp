<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>student management system</title>
</head>
<body>
  <%--
  获取数据， 如果获取 显示查看和 添加， 如果没有获取， 显示登陆。
  --%>

<%
  Object username = session.getAttribute("username");
  if(username == null){
%>
  <a href="/stu/login.jsp">please login</a>
<%}
  else
{%>
  <a href="/stu/addStudent.jsp">add students</a>
  <a href="/stu/loginStudentServlet">list students</a>
<%}%>

</body>
</html>