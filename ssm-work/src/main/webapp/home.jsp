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
    <title>主页面</title>
</head>
<body>
    <h1>主页面</h1>
    <hr>
    <h3>功能列表：</h3>
<a href="${pageContext.request.contextPath}/order/findAll">1.查看所有订单</a><br><br>
    <a href="${pageContext.request.contextPath}/customer/findAll/">2.查看所有客户</a><br><br>
    <a href="${pageContext.request.contextPath}/user/beforeUpdate">3.修改用户名和密码</a><br><br>
    <a href="${pageContext.request.contextPath}/login.jsp">4.退出登录</a><br>

</body>
</html>
