<%--
  Created by IntelliJ IDEA.
  User: daobl
  Date: 2022/12/10
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加订单</title>
</head>
<body>
  <form action="${pageContext.request.contextPath}/order/addOrder" method="post">
    <input type="hidden" name="customerId" value="${customerId}">
    订单编号<input type="text" name="sequence">
    价格<input type="text" name="price">
    状态<input type="text" name="status">
    <input type="submit" value="提交">
  </form>
</body>
</html>
