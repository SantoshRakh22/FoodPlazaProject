<%@page import="com.foodplaza.pojo.Order"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp" ></jsp:include> 
<%Order order=(Order)request.getAttribute("order"); %>
OrderId<%=order.getOrderId() %><br>
EmailId<%=order.getEmailId()%><br>
Date<%=order.getDate() %><br>
TotalPrice<%=order.getTotalPrice() %><br>

<jsp:include page="Footer.jsp" ></jsp:include>    
 
</body>
</html>