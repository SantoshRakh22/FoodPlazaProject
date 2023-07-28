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

<form action="food" method="post" onsubmit="return addfoodvalidation()">
<table>
<caption>Add Food</caption>
<tr>
<td>FoodName:</td>
<td><input type="text" name="fname" id="FoodName" ></td>
<td><span id="foodNameError" style="color:red"></span></td>
</tr>
<tr>
<td>FoodType:</td>
<td><input type="text" name="ftype" id="FoodType" ></td>
<td><span id="foodTypeError" style="color:red"></span></td>
</tr>
<tr>
<td>FoodCategory:</td>
<td><input type="text" name="fcategory" id="FoodCategory" ></td>
<td><span id="foodcatgoryError" style="color:red"></span></td>
</tr>
<tr>
<td>FoodPrice:</td>
<td><input type="text" name="fprice" id="FoodPrice" ></td>
<td><span id="foodpriceError" style="color:red"></span></td>
</tr>
</table>
<input type="submit" name="action" value="AddFood">
<input type="reset" value="reset">
</form>
<jsp:include page="Footer.jsp" ></jsp:include>    

</body>
</html>