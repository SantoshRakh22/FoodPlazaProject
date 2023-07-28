 <%@page import="com.foodplaza.pojo.Food"%>
<%@page import="com.foodplaza.dao.FoodDao_impl1"%>
<%@ pagelanguage="java"   contentType="text/html; charset=UTF-8"
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

<%
    FoodDao_impl1 fdi=new FoodDao_impl1();
    int id=Integer.parseInt(request.getParameter("foodId"));
    Food food=fdi.searchFoodById(id);
    %>

<form action="food" onsubmit="return updatefoodvalidation()" method="post">
<table >
<caption>Update Food></caption>
<td>ExistingFoodId:</td>
<td><input type="text" name="fid" id="FoodId" value="<%=food.getFoodId()%>" ></td>
<td><span id="existingfoodIdError" style="color:red"></span></td>
</tr>
<tr>
<td>FoodName:</td>
<td><input type="text" name="fname" id="FoodName" value="<%=food.getFoodName()%>"></td>
<td><span id="foodNameError" style="color:red"></span></td>

</tr>
<tr>
<td>FoodType:</td>
<td><input type="text" name="ftype" id="FoodType"value="<%=food.getFoodtType()%>" ></td>
<td><span id="foodTypeError" style="color:red"></span></td>

</tr>

<tr>
<td>FoodCategory:</td>
<td><input type="text" name="fcategory" id="FoodCategory"value="<%=food.getFoodId()%>" ></td>
<td><span id="foodCatagoryIdError" style="color:red"></span></td>

</tr>

<tr>
<td>Price:</td>
<td><span id="priceError" style="color:red"></span></td>
</tr>
</table>
<input type="submit" name="action" value="updatefood">
<input type="reset" value="reset">
</form>
<jsp:include page="Footer.jsp" ></jsp:include>    

</body>
</html>