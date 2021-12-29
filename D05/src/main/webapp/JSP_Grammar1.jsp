<%@ page import="java.util.ArrayList" %>

<%--
1. page 指令

errorPage ：  if error happens, the jumpt to error page




--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="errorPage.jsp" %>
<html>
<head>
    <title>JSP 指令</title>
</head>
<body>
<%--    故意有错误--%>
<%--    <% int result = 1/0; %>--%>
    <% ArrayList list = new ArrayList();%>
    <% String str = "jibadan";%>
</body>
</html>
