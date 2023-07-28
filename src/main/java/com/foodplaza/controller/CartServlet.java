package com.foodplaza.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.foodplaza.dao.CartDao_Impl;
import com.foodplaza.pojo.Cart;
@WebServlet("/cart")
public class CartServlet extends HttpServlet{
	CartDao_Impl  cti=new CartDao_Impl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 HttpSession session=req.getSession();
			PrintWriter out=resp.getWriter();
			String action = req.getParameter("action");
			if(action!=null && action.equals("delete")) {
				int  cartId =Integer.parseInt(req.getParameter("cartId"));
				boolean b = cti.deleteCart(cartId);
				if(b) {
					out.println("cart");	
				}
				else {
					out.println("Fail.jsp");	
				}
			}
			else {
			
			String email=(String)session.getAttribute("userEmail");
			List<Cart> cartlist = cti.showCart(email);
			if(cartlist!=null && !(cartlist.isEmpty())) {
				session.setAttribute("clist", cartlist);
				resp.sendRedirect("CartList.jsp");
			}
			else {
				//resp.sendRedirect("Fail.jsp");
				 req.setAttribute("emptycart", "Cart is Empty");
	        	 RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
	        	 rd.forward(req, resp);
			}
			}
		}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
         int foodid=Integer.parseInt(req.getParameter("foodId"));	
         String foodname=req.getParameter("FoodName");
         String emailid=req.getParameter("EmailId");
         double price=Double.parseDouble(req.getParameter("Price"));
         double totalprice=Double.parseDouble(req.getParameter("TotalPrice"));
         int quantity=Integer.parseInt(req.getParameter("quantity"));
         //int foodId, String emailId, String foodName, double price, double totalPrice,
			//int quantity
         Cart cart=new Cart(foodid, emailid,foodname, price, totalprice, quantity);
         boolean b = cti.addToCart(cart);
         if(b) {
        	 //resp.sendRedirect("Success.jsp");
        	 req.setAttribute("Addcart", "AddCart Successfully");
        	 RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
        	 rd.forward(req, resp);
         }
         else {
        	 resp.sendRedirect("Fail.jsp");
         }
    
    
	}
}
