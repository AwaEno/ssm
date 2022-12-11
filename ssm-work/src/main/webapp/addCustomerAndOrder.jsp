<%--
  Created by IntelliJ IDEA.
  User: daobl
  Date: 2022/12/10
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加订单</title>
</head>
<body>
<h3>添加订单和客户号信息</h3>
<hr>
    <form action="${pageContext.request.contextPath}/order/addCustomerAndOrder" method="post">
        <input type="button" value="订单信息"><br>
        订单号<input type="text" name="sequence">
        价格<input type="text" name="price">
        状态<input type="text" name="status"><br>
        <hr width="1">
        <input type="button" value="客户信息"><br>
        客户名<input type="text" name="customerName">
        电话<input type="text" name="phone">
        邮箱<input type="text" name="email">
        地址<input type="text" name="address">
        公司<input type="text" name="company"><br>
        <hr width="1">
        <input type="submit" value="添加">
    </form>
</body>
</html>
