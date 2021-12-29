<%@ page import="java.util.ArrayList" %>

<%--
JSP_Grammar1.jsp
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="errorPage.jsp" %>

<%@ include file="/JSP_Grammar1.jsp"%>
<html>
<head>
    <title>Include 指令</title>
</head>
<body>
<%--得到 /JSP_Grammar1.jsp 里面的str 变量 --%>
    <%= str%>
<%-- problem :   can not use the "out" or "pageContext"  why?   --%>
</body>
</html>
