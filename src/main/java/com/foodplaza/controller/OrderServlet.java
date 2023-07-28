package com.foodplaza.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.foodplaza.dao.CartDao_Impl;
import com.foodplaza.dao.OrderDao_Impl;
import com.foodplaza.pojo.Order;


@WebServlet("/placeorder")
public class OrderServlet extends HttpServlet {
	OrderDao_Impl orderImpl=new OrderDao_Impl();
	CartDao_Impl cart=new CartDao_Impl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		PrintWriter out=resp.getWriter();
		String emailId=(String)session.getAttribute("userEmailId");
		Order order=orderImpl.placeOrder(emailId);
	    if(order!=null) {
	    	boolean b = cart.clearCart(emailId);
	    	if(b)
	    	{
	    		req.setAttribute("order", order);
	    		RequestDispatcher rd=req.getRequestDispatcher("Billing.jsp");
	    		rd.forward(req, resp);
	    		
	    	}
	    	
	    	
	    }
	    
	    resp.sendRedirect("Fail.jsp");
	}

}
