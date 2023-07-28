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

<form action="customer" method="post"  onsubmit="return addCustomerValidation()()">
<table>
<caption>AddCustomer</caption>

<tr>
<td>CustomerName:</td>
<td><input type="text" name="cName" id="Name"></td>
<td><span id="nameError" style="color:red"></span></td>
</tr>


<tr>
<td>CustomerEmail</td>
<td><input type="text" name="emailid" id=EmailId></td>
<td><span id="emailError" style="color:red" ></span></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="text" name="password" id="Password" ></td>
<td><span id="passError" style="color:red"></span></td>
</tr>

<tr>
<td>Address:</td>
<td><input type="text" name="address" id="Address" ></td>
<td><span id="addressError" style="color:red"></span></td>
</tr>

<tr>
<td>ContactNo:</td>
<td><input type="text" name="contactNo" id="ContactNo" ></td>
<td><span id="contactError" style="color:red"></span></td>
</tr>
</table>
<input type="submit" name="action" value="AddCustomer">
<input type="reset" value="reset">
</form>
<jsp:include page="Footer.jsp" ></jsp:include>    

</body>
</html>