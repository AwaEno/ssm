<%--
  Created by IntelliJ IDEA.
  User: daobl
  Date: 2022/12/10
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/login.jsp">有账号？去登录</a>
<hr>
<h3>注册页面</h3>
<form action="${pageContext.request.contextPath}/user/registered" method="post">
    用户名：<input type="text" name="userName"><br><br>
    密码：&nbsp;&nbsp;&nbsp;<input type="text" name="password"><br><br>
    <input type="submit" value="注册">
</form>
</body>
</html>
