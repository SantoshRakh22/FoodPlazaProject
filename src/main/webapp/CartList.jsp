<%@page import="java.util.Iterator"%>
<%@page import="com.foodplaza.pojo.Cart"%>
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

<% List<Cart>cartlist=(List)session.getAttribute("clist"); %>
<form action="placeorder" method="post">
<table border="2">
<caption>Cart List</caption>
<tr>
<th>cartId</th>
<th>food Id</th>
<th>email Id</th>
<th>Food Name</th>
<th>Price</th>
<th>total price </th>
<th>quantity</th>
<th colpspan="2">action</th>
<th>action</th>
</tr>
<% Iterator<Cart>it=cartlist.iterator(); 
while(it.hasNext()){
	Cart cart=it.next();
%>
<tr>
<td><%=cart.getCartID() %></td>
<td><%=cart.getFoodId() %></td>
<td><%=cart.getEmailId() %></td>
<td><%=cart.getFoodName()%></td>
<td><%=cart.getPrice()%></td>
<td><%=cart.getTotalPrice()%></td>
<td><%=cart.getQuantity()%></td>

<td><a href="cart?action=delete&cartId=<%=cart.getCartID()%>">delete</a></td>



<%} %>


</table>
<input type="submit" value="PlaceOrder">
<jsp:include page="Footer.jsp" ></jsp:include>    

</form>
</body>
</html>