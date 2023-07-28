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

import com.foodplaza.dao.AdminDao_Impl;
import com.foodplaza.pojo.AdminLogin;
@WebServlet("/login")
public class LoginServlet  extends HttpServlet{
	AdminDao_Impl adi=new AdminDao_Impl();
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 HttpSession session=req.getSession();
	 session.invalidate();
	 resp.sendRedirect("index.jsp");
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String type=req.getParameter("type");
	 String emailid = req.getParameter("uname");
	 String password = req.getParameter("pass");
	 String action=req.getParameter("action");
	 HttpSession session=req.getSession();

	 if(action!=null && action.equals("Login"))
		 
{
		 if(type.equals("user")) {
			 boolean b = adi.userLogin(emailid, password);
			 if(b) {
				 session.setAttribute("userEmailId", emailid);
				 req.setAttribute("Login", "Login Successfully");
	        	 RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
	        	 rd.forward(req, resp);
				 
				// resp.sendRedirect("index.jsp");
			 }
			 else {
				 //resp.sendRedirect("Fail.jsp");
				 req.setAttribute("unsucess", "Login fail");
	        	 RequestDispatcher rd=req.getRequestDispatcher("Login.jsp");
	        	 rd.forward(req, resp);
			 }
		 }
		 if(type.equals("admin")) {
			 boolean b = adi.adminLogin(emailid, password);
			 if(b) {
				 session.setAttribute("adminEmialId", emailid);
				 //resp.sendRedirect("index.jsp");
				 req.setAttribute("Login", "Login Successfully");
	        	 RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
	        	 rd.forward(req, resp);
				 
			 }
			 else {
				// resp.sendRedirect("Fail.jsp");
				 req.setAttribute("unsucess", "Login fail");
	        	 RequestDispatcher rd=req.getRequestDispatcher("Login.jsp");
	        	 rd.forward(req, resp);
			 }
		 }
		 
	 }
	 
	 else if(action!=null && action.equals("ChangePassword")) {
		 String newpass = req.getParameter("newpass");
		 if(type.equals("user")) {
			 boolean b = adi.userChangePassword(emailid, newpass);
			 if(b) {
				 
				 session.setAttribute("adminEmialId", emailid);
				 resp.sendRedirect("index.jsp");
				 
			 }
			 else {
				 resp.sendRedirect("Fail.jsp");
			 }
	 }
		 if(type.equals("admin")) {
			 boolean b = adi.adminChangePassword(emailid, newpass);
			 if(b) {
				 resp.sendRedirect("Success.jsp");
			 }
			 else {
				 resp.sendRedirect("Fail.jsp");
			 }
			 }
		 }
    }
}
