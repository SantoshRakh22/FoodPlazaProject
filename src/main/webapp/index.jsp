<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Tea and Meal - Free CSS Template</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
	<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>

<jsp:include page="Header.jsp" ></jsp:include>    
<div style="color:green; font-size:0.5cm">
<%

String login=(String)request.getAttribute("Login");
if(login!=null)
{
  out.print(login);	
}

String addCart=(String)request.getAttribute("addcart");
if(addCart!=null)
{
	out.println(addCart);
}

%>
</div>

<div style="color:red; font-size:0.5cm">
<% 
String emptyCart=(String)request.getAttribute("add cart");
if(emptyCart!=null)
{
	out.println(emptyCart);
}
%>
</div>


    <div id="templatemo_top_dishes">

    	<h1>Recommended Dishes</h1>
        <div class="top_dishes_box">
       	  <img src="images/templatemo_image_01.jpg" alt="image" width="205" height="150"/>
          <h2>Cura bitur turpis</h2>
            <p>Nulla a risus. Ali quam lectus dui, euismod id, volutpat ac, fringilla eu, ipsum. <a href="#">Read more...</a></p>
      </div>
        
        <div class="top_dishes_box">
       	  <img src="images/templatemo_image_02.jpg" alt="image" />
            <h2>Suspen metus lorem</h2>
          <p>Volutpat non, molestie sit amet, placerat id, elit. Praesent laoreet. Mauris velit. <a href="#">Read more...</a></p>
        </div>
        
        <div class="top_dishes_box">
       	  <img src="images/templatemo_image_03.jpg" alt="image" />
            <h2>Phasellus dui velit</h2>
          <p>Laoreet id, accumsan nec, dui. Etiam varius. Maecenas sit amet est et enim laoreet rutrum. <a href="#">Read more...</a></p>
      </div>
        
        <div class="top_dishes_box">
       	  <img src="images/templatemo_image_04.jpg" alt="image" />
            <h2>Donec iaculis felis</h2>
          <p>Praesent varius egestas velit. Donec a massa ut pede pulvinar vulputate. Nulla et augue. <a href="#">Read more...</a></p>
        </div>
        
        <div class="cleaner">&nbsp;</div>
    
    </div> <!-- end of top dishes -->
    
    
<jsp:include page="Footer.jsp" ></jsp:include>    
    -->
</body>
</html>
