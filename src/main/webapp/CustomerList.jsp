<%@page import="java.util.Iterator"%>
<%@page import="com.foodplaza.pojo.Customer"%>
<%@page import="java.util.List"%>
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

<% List<Customer>customerlist=(List) session.getAttribute("cList"); %>

<table border="2">
<caption>customers</caption>
<tr>
<th>customerName</th>
<th>emailId</th>
<th>password</th>
<th>address</th>
<th>contactno</th>
</tr>
<%Iterator<Customer>it=customerlist.iterator();
while(it.hasNext()){
	Customer culist=it.next();
%>
<tr>
<td><%=culist.getCustomerName()%></td>
<td><%=culist.getcEmailId()%></td>
<td><%=culist.getcPassword()%></td>
<td><%=culist.getcAddress()%></td>
<td><%=culist.getcContactNo()%></td>

<td><a href="customer?action=delete&cEmailid=<%=culist.getcEmailId()%>">delete</a></td>

</tr>

<%} %>

</table>
<jsp:include page="Footer.jsp" ></jsp:include>    

</body>
</html>