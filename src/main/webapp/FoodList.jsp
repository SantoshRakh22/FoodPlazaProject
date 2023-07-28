<%@page import="java.util.Iterator"%>
<%@page import="java.nio.file.DirectoryIteratorException"%>
<%@page import="com.foodplaza.pojo.Food"%>
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
<% String userEmail=(String)session.getAttribute("userEmailId");
String adminEmail=(String)session.getAttribute("adminEmialId");

%>
<jsp:include page="Header.jsp" ></jsp:include>    

<% List<Food>foodList=(List)session.getAttribute("flist"); %>
<table border="2">
<caption>foods</caption>
<tr>
<th>ID</th>
<th>NAME</th>
<th>FoodType</th>
<th>Catagory</th>
<th>Price</th>

<% if(adminEmail!=null && userEmail==null){

%>
<th colpspan="2">action</th>
<%} %>
<% if(adminEmail==null && userEmail!=null){

%>

<th>action</th>
<%} %>

</tr>
<% Iterator<Food>it=foodList.iterator();
while(it.hasNext()){
	Food food=it.next();

%>
<tr>
<td><%=food.getFoodId() %></td>
<td><%=food.getFoodName() %></td>
<td><%=food.getFoodtType() %></td>
<td><%=food.getFoodCatagory() %></td>
<td><%=food.getPrice() %></td>
<% if(adminEmail!=null && userEmail==null)
{
%>
<td><a href="UpdateFood.jsp?foodId=<%=food.getFoodId()%>">edit</a></td>
<td><a href="food?action=delete&foodId=<%=food.getFoodId()%>">delete</a></td>
<%} %>
<% if(adminEmail==null && userEmail!=null) {%>
<td><a href="Addcart.jsp?foodId=<%=food.getFoodId()%>">Add Cart</a></td>
<%} %>

</tr>

<%} %>
</table>
<jsp:include page="Footer.jsp" ></jsp:include>    

</body>
</html>