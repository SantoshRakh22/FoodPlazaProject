package com.foodplaza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.foodplaza.pojo.FeedBack;
import com.foodplaza.utility.DBUtility;

public class FeedBackDao_impl implements FeedBackDao {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int row;
	
	@Override
	public boolean addFeedBack(FeedBack feedback) {
		try {
			con=DBUtility.getConnect();
			sql="insert into FeedBack_123_afreen(CustomerName, CustomerEmail, Review, Rating, Suggestion) values (?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1,feedback.getCustName());
			ps.setString(2, feedback.getEmailId());
			ps.setString(3, feedback.getReview());
			ps.setString(4, feedback.getRanking());
			ps.setString(5, feedback.getSuggestion());
			row=ps.executeUpdate();
			if(row>0) {
				return true;
			}
			else {
				return false;
			}
			
		}
		 catch(SQLException e) {
				e.printStackTrace();
			}
		return false;
	}



	@Override
	public List<FeedBack> getAllFeedBack() {
		List<FeedBack> feedlist=new ArrayList<>();
		try {
			con=DBUtility.getConnect();
			sql="select * from FeedBack_123_afreen";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				FeedBack feedback=new FeedBack();
				feedback.setCustName(rs.getString("CustName"));
				feedback.setEmailId(rs.getString("EamilId"));
				feedback.setReview(rs.getString("Review"));
				feedback.setRanking(rs.getString("Ranking"));
				feedback.setSuggestion(rs.getString("Suggestion"));
				feedlist.add(feedback);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return feedlist;
	}


	

}
