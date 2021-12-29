<%--
  Created by IntelliJ IDEA.
  User: Shipan Liu
  Date: 28.12.2021
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--    add data --%>
    <% request.setAttribute("username", "jiba");%>

    <%-- out put the data    --%>
     JSP 表达式： <%= request.getAttribute("username") %>
     EL  表达式： ${username}

</body>
</html>
