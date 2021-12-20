<%--
  Created by IntelliJ IDEA.
  User: Shipan Liu
  Date: 02.12.2021
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>student login</title>
</head>
<body>
<form action="loginStudentServlet" method="get" autocomplete="off">
    name: <input type="text" name="username"> <br>
    password: <input type="password" name="password"> <br>
    <button type="submit">login</button>
</form>

</body>
</html>
