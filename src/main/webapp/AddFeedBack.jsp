<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>

	<form action="feedback" method ="post" onsubmit="return AddFeedValidation()">
		<table>
		<caption>Add your feedback here..</caption>
			<tr>
				<td>Customer Name:</td>
				<td><input type="text" name="name" id="name"></td>
				<td><span id="cnameError" style="color: red"></span></td>
			</tr>
			<tr>
				<td>EmailId:</td>
				<td><input type="text" name="eid" id="eid"></td>
				<td><span id="cEmail" style="color: red"></span></td>
			</tr>
			<tr>
				<td>Review:</td>
				<td><input type="text" name="review" id="review"></td>
				<td><span id="cReview" style="color: red"></span></td>
			</tr>
			<tr>
				<td>Ranking:</td>
				<td><input type="text" name="rank" id="rank"></td>
				<td><span id="cRank" style="color: red"></span></td>
			</tr>
			<tr>
				<td>Suggestion:</td>
				<td><input type="text" name="sug" id="sug"></td>
				<td><span id="csug" style="color: red"></span></td>
			</tr>
		</table>

		<input type="submit" name="action" value="AddFeedBack"> 
		<input type="reset" value="clear">

	<jsp:include page="Footer.jsp"></jsp:include>
	</form>
</body>
</html>