<%--
  Created by IntelliJ IDEA.
  User: daobl
  Date: 2022/12/10
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<h3>登录页面</h3>
<hr>
<br>
<form action="${pageContext.request.contextPath}/user/login" method="post">
        用户名：<input type="text" name="userName"><br><br>
        密码：&nbsp;&nbsp;&nbsp;<input type="text" name="password"><br><br>
        <input type="submit" value="登录">
    </form>
    <a href="${pageContext.request.contextPath}/registered.jsp">没有账号？点击注册</a>
</body>
</html>
