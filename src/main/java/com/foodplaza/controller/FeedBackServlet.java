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

import com.foodplaza.dao.FeedBackDao_impl;
import com.foodplaza.pojo.Customer;
import com.foodplaza.pojo.FeedBack;

@WebServlet("/feedback")
public class FeedBackServlet extends HttpServlet{
	FeedBackDao_impl fdi=new FeedBackDao_impl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		PrintWriter out=resp.getWriter();
		String action=req.getParameter("action");
		List<FeedBack> flist=fdi.getAllFeedBack();
		
		if(flist!=null && !(flist.isEmpty())) {
			session.setAttribute("fList", flist);
			resp.sendRedirect("FeedBackList.jsp");
		}
		else
		{
			resp.sendRedirect("Fail.jsp");
		}

	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action=req.getParameter("action");
		if(action!=null && action.equals("AddFeedBack"))
		{
			PrintWriter out=resp.getWriter();
			String cName=req.getParameter("name");
			String cEmail=req.getParameter("eid");
			String cReview=req.getParameter("review");
			String cRank=req.getParameter("rank");
			String cSug=req.getParameter("sug");

			FeedBack feed=new FeedBack(cName, cEmail, cReview, cRank, cSug);
			boolean b=fdi.addFeedBack(feed);
			if(b) {
				resp.sendRedirect("Success.jsp");
			}
			else {
				resp.sendRedirect("Fail.jsp");

			}
		}
	}	
}
