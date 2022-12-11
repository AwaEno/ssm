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
<a href="${pageContext.request.contextPath}/home.jsp">返回首页</a>
<hr>
<h3>订单列表</h3>
    <table border="1" cellpadding="10" cellspacing="0" width="800">
        <th>序号</th>
        <th>订单编号</th>
        <th>价格(￥)</th>
        <th>是否已处理</th>
        <th>客户</th>
        <th colspan="2">操作</th>
        <c:forEach items="${orderList}" var="order" varStatus="i">
            <tr align="center">
                <td>${i.index+1}</td>
                <td>${order.sequence}</td>
                <td>${order.price}</td>
                <c:if test="${order.status==1}">
                    <td>已处理</td>
                </c:if>
                <c:if test="${order.status==0}">
                    <td>未处理</td>
                </c:if>
                <td>${order.customer.customerName}</td>
                <td><a href="${pageContext.request.contextPath}/order/deleteByOrderId/${order.orderId}">删除</a></td>
                <td><a href="${pageContext.request.contextPath}/order/beforeUpdate/${order.orderId}">修改</a></td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>
