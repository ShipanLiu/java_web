<%@ page import="com.example.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <%--empty is for checking if empty or not--%>
    <%
        String str = null;
        String str2 = "";
        int[] arr = {};

    %>

    ${empty str} <br>     // true
    ${empty str2} <br>      // true
    ${empty arr} <br>       // true

    <%--三元运算--%>
    <%request.setAttribute("gender", "female");%>
    <input type="radio" name="gender" value="male" ${gender == "male" ? "checked" : ""}>男
    <input type="radio" name="gender" value="female" ${gender == "female"? "checked" : ""}>女 <br>

    <%-- El 中获取 隐式对象--%>

   <%--pageContext 可以获取其他三个域对象 + JSP 中八个隐式对象--%>
   <%--   /D05--%>
    ${pageContext.request.contextPath}<br>

   <%--applicationScope, SessionScope, requestScope, pageScope 操作四大域对象中的数据--%>
    <%
        request.setAttribute("name", "jiab");
    %>
    ${name} <br>
    ${requestScope.name} <br>

    <%--header for getting value       headerValues for getting an array--%>
    ${header["connection"]} <br>
    ${headerValues["connection"][0]} <br>

    <%--param paramValues --%>
   <%--http://localhost:8080/D05/EL03.jsp?username=jiba&hobby=study&hobby=sport--%>
    ${param.username} <br>
    ${paramValues.hobby[0]} <br>s
    ${paramValues.hobby[1]} <br>

    <%--initParam  获取全局配置参数   在 WEB-INF 文件中  web.xml 中设置。--%>
    ${initParam["pname"]}

    <%--cookie--%>
    <%--   获取 JSESSIONID--%>
    ${cookie.JSESSIONID.name}
    ${cookie.JSESSIONID.value}


</body>
</html>
