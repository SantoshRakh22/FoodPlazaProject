package com.foodplaza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.foodplaza.utility.DBUtility;

public class AdminDao_Impl implements AdminDao {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;

	@Override
	public boolean userLogin(String emailId, String password) {
		try {
		con=DBUtility.getConnect();

		String sql="select * from customer_123_afreen where cEmailId=? and cPassword=?";
		ps=con.prepareStatement(sql);
		ps.setString(1,emailId);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			return true;
		}
		else {
			return false;
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}
		return false;
	}

	@Override
	public boolean userChangePassword(String emailId, String newPassword) {
		try {
			con=DBUtility.getConnect();

			String sql="update customer_123_afreen set cPassword=? where  cEmailId=?  ";
			ps=con.prepareStatement(sql);
			ps.setString(1, newPassword);
			ps.setString(2,emailId);
		    int	row=ps.executeUpdate();
		    if (row>0) {
		    	return true;
		    	}
		    else {
		    	return false;
		    	}
		    
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
     
	
		}

	@Override
	public boolean adminLogin(String adminEmailid, String adminPassword) {
		try {
			con=DBUtility.getConnect();

			String sql="select * from AdminLogin_123_afreen where aEmailId=? and AdminPassword=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,adminEmailid);
			ps.setString(2, adminPassword);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return true;
			}
			else {
				return false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}		return false;
	}

	@Override
	public boolean adminChangePassword(String adminEmailid, String newAdminPassword) {
		try {
			con=DBUtility.getConnect();

			String sql="update AdminLogin_123_afreen set AdminPassword=?  where  aEmailId=?  ";
			ps=con.prepareStatement(sql);
			ps.setString(1, newAdminPassword);
			ps.setString(2,adminEmailid);
		    int	row=ps.executeUpdate();
		    if (row>0) {
		    	return true;
		    	}
		    else {
		    	return false;
		    	}
		    
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
