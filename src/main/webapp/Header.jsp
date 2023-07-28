<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link href="templatemo_style.css" rel="stylesheet" type="text/css" />

<title>Insert title here</title>
</head>
<body>
<%    String userMail=(String)session.getAttribute("userEmailId");
String adminMail=(String)session.getAttribute("adminEmialId");

%>
<div id="templatemo_container">
	<div id="templatemo_header">
    	<div id="site_title"></div>
    </div> <!-- end of header -->
    
    <div id="templatemo_menu">
        <ul>
        <% if(adminMail==null && userMail==null){ %>
        	<li class="current"><a href="index.jsp"><b>Home</b></a></li>
            <li><a href="food"><b>Food Menu</b></a></li>
            <li><a href="AddCustomer.jsp"><b>Customer Registration</b></a></li>
             <li ><a href="Login.jsp"><b>LogIn</b></a></li>
              <li ><a href="ContactUs.jsp"><b>Contact Us</b></a></li>
              <%} %>
          
         
           <% if(adminMail!=null && userMail==null){ %>
            <li><a href="AddFood.jsp"><b>Add Food</b></a></li>
          <li><a href="food"><b>Food Menu</b></a></li>
           <li><a href="customer"><b>Customer List</b></a></li>
           <li ><a href="ChangePassword.jsp"><b>Change password</b></a></li>
            <li ><a href="login"><b>LogOut</b></a></li>
            <li ><a href="feedback"><b>FeedBackList</b></a></li>
          
          <%} %>
          
          <% if(adminMail==null && userMail!=null){ %>
           <li><a href="food"><b>Food Menu</b></a></li>
            <li ><a href="cart"><b>CartList</b></a></li>
            <li ><a href="ChangePassword.jsp"><b>Change password</b></a></li>
            <li ><a href="login"><b>Log Out</b></a></li>
            <li ><a href="UpdateCustomer.jsp?cEmailid=<%=userMail%>"><b>edit profile</b></a></li>
            <li ><a href="AddFeedBack.jsp"><b>AddFeedback</b></a></li>
            <%} %>
        </ul>
    </div>
</body>
</html>