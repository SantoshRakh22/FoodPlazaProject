package com.foodplaza.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.foodplaza.dao.CustomerDao_impl;
import com.foodplaza.pojo.Customer;
@WebServlet("/customer")
public class CustomerServlet extends HttpServlet{
	CustomerDao_impl cdi=new CustomerDao_impl();
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 HttpSession session=req.getSession();
		PrintWriter out=resp.getWriter();
		String action = req.getParameter("action");
		if(action!=null && action.equals("delete")) {
			String cEmailId = req.getParameter("cEmailid");
			boolean b = cdi.deleteCustomerById(cEmailId);
			if(b) {
				out.println("Success.jsp");
			}
			else {
				out.println("Fail.jsp");
			}
		}
		else {
		
	   List<Customer>clist=cdi.getAllCustomer();
	   if(clist!=null && !(clist.isEmpty())) {
		   session.setAttribute("cList", clist);
		   resp.sendRedirect("CustomerList.jsp");
		   
	   }
	   else {
		   resp.sendRedirect("Fail.jsp");
	   }
	 
		} 
 }

 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 PrintWriter out=resp.getWriter();
	 String action=req.getParameter("action");
	 
	 if(action!=null && action.equals("AddCustomer")) {
		 String cname = req.getParameter("cName");
		 String emailid = req.getParameter("emailid");
		 String password = req.getParameter("password");
		 String address = req.getParameter("address");
		 String contactNo = req.getParameter("contactNo");
		 Customer customer=new Customer(cname, emailid, password, address, contactNo);
		 boolean b = cdi.addCustomer(customer);
		 if(b) {
				resp.sendRedirect("Success.jsp");
				
			}
			else {
				resp.sendRedirect("Fail.jsp");
				
			}
	 }
	 else if(action!=null && action.equals("updatecustomer")){
		 String name = req.getParameter("name");
		 String email = req.getParameter("email");
		 String password = req.getParameter("password");
		 String address = req.getParameter("address");
		 String contactNo = req.getParameter("contactNo");
		 Customer customer=new Customer(name, email, password, address, contactNo);
		 boolean b = cdi.updateCustomerById(customer);
		 if(b) {
				resp.sendRedirect("Success.jsp");
				
			}
			else {
				resp.sendRedirect("Fail.jsp");
				
			}
		 }
	}
}
