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

<form action="login" method="post"  onsubmit="return changePasswordValidation()">
<table>
<caption>changePassword</caption>
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
<td>oldpassword</td>
<td><input type="text" name="oldpass" id="oldpassword"></td>
<td><span id="oldpassError" style="color:red"></span></td>
</tr>

<tr>
<td>newpassword</td>
<td><input type="text" name="newpass" id="newpassword"></td>
<td><span id="newpassError" style="color:red"></span></td>
</tr>
<tr>
<td>changepassword</td>
<td><input type="text" name="changepass" id="changepassword"></td>
<td><span id="changepassError" style="color:red"></span></td>
</tr>
</table>
<input type="submit" name="action" value="ChangePassword">
<input type="reset" value="reset">
</form>
<jsp:include page="Footer.jsp" ></jsp:include>    

</body>
</html>