<%@page import="com.foodplaza.pojo.Food"%>
<%@page import="com.foodplaza.dao.FoodDao_impl1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function total()
{
	price=parseFloat(document.getElementById("Price").value)
	quantity=parseInt(document.getElementById("quantity").value)
	total=price*quantity;
	document.getElementById("TotalPrice").value=total
	
	}



</script>
</head>
<body>
<jsp:include page="Header.jsp" ></jsp:include>    

<%
    FoodDao_impl1 fdi=new FoodDao_impl1();
    int id=Integer.parseInt(request.getParameter("foodId"));
    Food food=fdi.searchFoodById(id);
    String emailId=(String)session.getAttribute("userEmailId");
    %>
<form action="cart" method="post" onsubmit="return addfoodvalidation()">
<table>
<caption>Add cart></caption>
<tr>
<td>EmailId:</td>
<td><input type="text" name="EmailId" id="EmailId" value="<%=emailId%>"></td>
<td><span id="EmailIdError" style="color:red"></span></td>
</tr>

<tr>
<td>FoodId:</td>
<td><input type="text" name="foodId" id="FoodId" value="<%=food.getFoodId()%>" ></td>
<td><span id="FoodIdError" style="color:red"></span></td>
</tr>
<tr>
<td>FoodName:</td>
<td><input type="text" name="FoodName" id="FoodName" value="<%=food.getFoodName()%>" ></td>
<td><span id="FoodNameError" style="color:red"></span></td>
</tr>
<tr>
<td>Price:</td>
<td><input type="text" name="Price" id="Price" value="<%=food.getPrice()%>" ></td>
<td><span id="priceError" style="color:red"></span></td>
</tr>

<tr>
<td>TotalPrice:</td>
<td><input type="text" name="TotalPrice" id="TotalPrice" onclick="total()"> </td>
<td><span id="TotalPriceError" style="color:red"></span></td>
</tr>
<tr>
<td>quantity:</td>
<td><input type="text" name="quantity" id="quantity" ></td>
<td><span id="quantityError" style="color:red"></span></td>
</tr>


</table>
<input type="submit" name="action" value="Addcart">
<input type="reset" value="reset">
</form>
<jsp:include page="Footer.jsp" ></jsp:include>    

</body>
</html>