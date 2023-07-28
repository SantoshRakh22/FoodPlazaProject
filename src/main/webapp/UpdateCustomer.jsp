
<%@page import="com.foodplaza.pojo.Customer"%>
<%@page import="com.foodplaza.dao.CustomerDao_impl"%>
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

<%CustomerDao_impl cdi=new CustomerDao_impl();

String cEmailId=request.getParameter("cEmailid"); 
Customer cust=cdi.searchCustomerByEmailId(cEmailId);
%>
<form action="customer" method="post" onsubmit="return updatecustomervalidation()">

<table>
<caption>Update Customer></caption>

<tr>
<td>ExistingEmailId:</td>
<td><input type="text" name="email" id="EmailId" value="<%=cust.getcEmailId()%>" ></td>
<td><span id="emailIdError" style="color:red"></span></td>

</tr>

<tr>
<td> CName:</td>
<td><input type="text" name="name" id="CName" value="<%=cust.getCustomerName()%>"></td>
<td><span id="CNameError" style="color:red"></span></td>

</tr>

<tr>
<td>Password:</td>
<td><input type="text" name="password" id="Password" value="<%=cust.getcPassword()%>" ></td>
<td><span id="PasswordError" style="color:red"></span></td>

<td></td>
</tr>

<tr>
<td>Address:</td>
<td><input type="text" name="address" id="Address" value="<%=cust.getcAddress()%>"></td>
<td><span id="AddressError" style="color:red"></span></td>

</tr>

<tr>
<td>ContactNo:</td>
<td><input type="text" name="contactNo" id="ContactNo" value="<%=cust.getcContactNo()%>"></td>
<td><span id="ContactNoError" style="color:red"></span></td>
</tr>
<table>
<input type="submit" name="action" value="UpdateCustomer">
<input type="reset" value="reset">
</form>
<jsp:include page="Footer.jsp" ></jsp:include>    
</body>
</html>