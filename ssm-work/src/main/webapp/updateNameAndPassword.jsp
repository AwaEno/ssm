<%--
  Created by IntelliJ IDEA.
  User: daobl
  Date: 2022/12/10
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户名和密码</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/home.jsp">返回首页</a>
<hr>
<h3>修改用户名和密码页面</h3>
<form action="${pageContext.request.contextPath}/user/update" method="post">
    <input type="hidden" name="userId" value="${user.userId}">
    用户名：<input type="text" name="userName"><br><br>
    密码：&nbsp;&nbsp;&nbsp;<input type="text" name="password"><br><br>
    <input type="submit" value="提交修改">
</form>
</body>
</html>
