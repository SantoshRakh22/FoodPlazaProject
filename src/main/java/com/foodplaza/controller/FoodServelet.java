package com.foodplaza.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.foodplaza.dao.FoodDao_impl1;
import com.foodplaza.pojo.Food;
@WebServlet("/food")
public class FoodServelet extends HttpServlet{
	FoodDao_impl1 fdi=new FoodDao_impl1();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   HttpSession session=req.getSession();
		PrintWriter out=resp.getWriter();
		String action = req.getParameter("action");
		if(action!=null && action.equals("delete")) {
			int  foodid =Integer.parseInt(req.getParameter("foodId"));
			boolean b = fdi.deleteFoodById(foodid);
			if(b) {
				out.println("Success.jsp");	
			}
			else {
				out.println("Fail.jsp");	
			}
		}
		else {

	   List<Food> foodList = fdi.getAllFood();
	   if(foodList!=null && !(foodList.isEmpty())) {
		session.setAttribute("flist", foodList);
		resp.sendRedirect("FoodList.jsp");
	   }
	   else {
		   resp.sendRedirect("Fail");
	   }
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out=resp.getWriter();
	String action=req.getParameter("action");
	
	if(action!=null && action.equals("AddFood")) {
	String foodName=req.getParameter("fname");
	String foodType=req.getParameter("ftype");
	String foodCatagory=req.getParameter("fcategory");
	double foodPrice=Double.parseDouble(req.getParameter("fprice"));
	Food food=new Food(foodName, foodType, foodCatagory, foodPrice);
	boolean b = fdi.addFood(food);
	if(b) {
		resp.sendRedirect("Success.jsp");	
	}
	else {
		resp.sendRedirect("Fail.jsp");	
	}
	}
	else if(action!=null && action.equals("updatefood")) {
		int  id = Integer.parseInt(req.getParameter("fid"));
		String foodName = req.getParameter("fname");
		String foodType = req.getParameter("ftype");
		String foodCatagory = req.getParameter("fcategory");
		double  foodPrice =Double.parseDouble(req.getParameter("fprice"));
		Food food=new Food(foodName, foodType, foodCatagory, foodPrice);
		food.setFoodId(id);
		boolean b = fdi.updateFoodById(food);
		if(b) {
			resp.sendRedirect("Success.jsp");	
		}
		else {
			resp.sendRedirect("Fail.jsp");
		}
	}
	}
}
