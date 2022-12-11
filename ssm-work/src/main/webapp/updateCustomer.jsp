<%--
  Created by IntelliJ IDEA.
  User: daobl
  Date: 2022/12/11
  Time: 0:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改客户信息</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/customer/update" method="post">
        <input type="hidden" name="customerId" value="${customerId}">
        姓名<input type="text" name="customerName">
        电话<input type="text" name="phone">
        邮箱<input type="text" name="email">
        地址<input type="text" name="address">
        公司<input type="text" name="company">
        <input type="submit" value="提交">
    </form>
</body>
</html>
