<%--
  Created by IntelliJ IDEA.
  User: daobl
  Date: 2022/12/11
  Time: 0:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改订单</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/order/update" method="post">
        <input type="hidden" name="orderId" value="${orderId}">
        订单编号<input type="text" name="sequence">
        价格<input type="text" name="price">
        是否已处理<input type="text" name="status">
        <input type="submit" value="提交">
    </form>
</body>
</html>
