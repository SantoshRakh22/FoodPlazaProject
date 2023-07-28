package com.foodplaza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.foodplaza.pojo.Cart;
import com.foodplaza.pojo.Order;
import com.foodplaza.utility.DBUtility;

public class OrderDao_Impl implements OderDao{
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int row;
	@Override
	public Order placeOrder(String emailId) {
		String date=new Date().toString();
			double totalPrice=0;
			Order order=null;
			try {
			con=DBUtility.getConnect();
			sql="select sum(totalPrice) as total from cart_123_afreen where emailID=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, emailId);
			rs=ps.executeQuery();
			if(rs.next()) {
				totalPrice=rs.getDouble("total");
			}
			if(totalPrice >0) {
				sql="insert into order_123_afreen(emailID,totalPrice,DATE) values(?,?,?)";
				ps=con.prepareStatement(sql);
				ps.setString(1,emailId );
				ps.setDouble(2, totalPrice);
				ps.setString(3, date);
				row=ps.executeUpdate();
				if(row>0) {
					sql="select * from order_123_afreen where emailID=? and DATE=? ";
					ps=con.prepareStatement(sql);
					ps.setString(1, emailId);
					ps.setString(2, date);
					rs=ps.executeQuery();
					if(rs.next()) {
						order=new Order();
						order.setOrderId(rs.getInt("OrderId"));
						order.setEmailId(rs.getString("emailID"));
						order.setTotalPrice(rs.getDouble("totalPrice"));
						order.setDate(rs.getString("DATE"));
						
						
					}
					
				}
				
			}
			

			

			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return order;
	}

	@Override
	public List<Order> showorder() {
		List<Order>ot=new ArrayList<>();
		try {
			con=DBUtility.getConnect();
			sql="select * from order_123_afreen";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				Order order=new Order();
				order.setOrderId(rs.getInt("orderid"));
				order.setEmailId(rs.getString("emailId"));
				order.setTotalPrice(rs.getDouble("totalPrice"));
				order.setDate(rs.getString("date"));
				ot.add(order);				
				
			}
				
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return ot;
	}

}
