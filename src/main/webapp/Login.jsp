<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="validation.js"></script>
</head>
<body>
<jsp:include page="Header.jsp" ></jsp:include> 
<div style="color: red; font-size: 0.5cm;">
<%
 String unsucess=(String)request.getAttribute("unsucess");
if(unsucess!=null)
{
	out.println(unsucess);
}

%>
</div>

<form action="login" method="post" onsubmit="return loginvalidattion()">
<table>
<caption>Login</caption>
<tr>
<td>Select:</td>
<td><select name="type">
<option value="admin">Admin</option>
<option value="user">User</option>
</select></td>
<td><span id="selectError" style="color: red" ></span></td> 

</tr>

<tr>
<td>username:</td>
<td><input type="email" name="uname" id="username" ></td>
<td><span id="usernameError" style="color:red"></span></td>
</tr>

<tr>
<td>Password:</td>
<td><input type="password" name="pass" id="Password" ></td>
<td><span id="passwordError" style="color:red" ></span></td>
</tr>
</table>


<input type="submit" name="action"  value="Login">
<input type="reset" value="clear">
</form>
<jsp:include page="Footer.jsp" ></jsp:include>    

</body>
</html>