<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>


<%@ page language="java" import="com.foodplaza.pojo.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>

	<% List<FeedBack> feedlist=(List)session.getAttribute("fList");%>
<form action="feedback" method="post">

<table border="2">
		<caption>FeedBack</caption>
		<tr>
			<th>Name</th>
			<th>EmailId</th>
			<th>Review</th>
			<th>Ranking</th>
			<th>Suggestion</th>
			
			
		</tr>

		<% Iterator<FeedBack> it=feedlist.iterator();
	while(it.hasNext()){
		FeedBack feed=it.next();
		
%>
		<tr>
			<td><%=feed.getCustName() %></td>
			<td><%=feed.getEmailId() %></td>
			<td><%=feed.getReview() %></td>
			<td><%=feed.getRanking() %></td>
			<td><%=feed.getSuggestion()%></td>
			
		</tr>
		<%} %>
	</table>
		<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>