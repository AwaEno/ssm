<%--
  Created by IntelliJ IDEA.
  User: daobl
  Date: 2022/12/10
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>客户列表</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/home.jsp">返回首页</a><br>
<hr>
<h3 >客户列表</h3>
<a href="${pageContext.request.contextPath}/addCustomerAndOrder.jsp">添加客户和订单</a><br>
<br>
    <table border="1" cellpadding="10" cellspacing="0" width="1250">
        <th>序号</th>
        <th>客户名</th>
        <th>电话</th>
        <th>邮箱</th>
        <th>地址</th>
        <th>公司</th>
        <th>订单编号</th>
        <th colspan="3">操作</th>
        <c:forEach items="${customerList}" var="customer" varStatus="i">
            <tr align="center">
                <td>${i.index+1}</td>
                <td>${customer.customerName}</td>
                <td>${customer.phone}</td>
                <td>${customer.email}</td>
                <td>${customer.address}</td>
                <td>${customer.company}</td>
                <td>
                    <c:forEach items="${customer.orderList}" var="order">
                        &nbsp;&nbsp;${order.sequence}
                    </c:forEach>
                </td>
                <td><a href="${pageContext.request.contextPath}/order/getCustomerId/${customer.customerId}">增加订单</a></td>
                <td><a href="${pageContext.request.contextPath}/customer/beforeUpdate/${customer.customerId}">修改客户信息</a></td>
                <td><a href="${pageContext.request.contextPath}/customer/deleteByCustomerId/${customer.customerId}">删除客户</a></td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>
