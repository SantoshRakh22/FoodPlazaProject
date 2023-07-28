package com.foodplaza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.foodplaza.pojo.Cart;
import com.foodplaza.utility.DBUtility;

public class CartDao_Impl implements CartDao {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int row;
	@Override
	public boolean addToCart(Cart cart) {
		try {
		con=DBUtility.getConnect();
		

		sql="insert into cart_123_afreen (foodId,emailID,foodname,price,totalPrice,quantity)values (?,?,?,?,?,?)";
		ps=con.prepareStatement(sql);
		ps.setInt(1, cart.getFoodId());
		ps.setString(2, cart.getEmailId());
		ps.setString(3, cart.getFoodName());
		ps.setDouble(4, cart.getPrice());
		ps.setDouble(5, cart.getTotalPrice());
		ps.setInt(6, cart.getQuantity());
		row=ps.executeUpdate();
		if(row>0) {
			return true;
		}
		else {
			return false;
		}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public List<Cart> showCart(String email) {
		
		List<Cart>cartlist=new ArrayList<>();
		try {
		con=DBUtility.getConnect();
		sql="select * from cart_123_afreen";
		ps=con.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()) {
		Cart crt=new Cart();
		crt.setCartID(rs.getInt("cartId"));
	     crt.setFoodId(rs.getInt("foodId"));
	     crt.setEmailId(rs.getString("emailID"));
	     crt.setFoodName(rs.getString("foodname"));
	     crt.setPrice(rs.getDouble("price"));
	     crt.setTotalPrice(rs.getDouble("totalPrice"));
	     crt.setQuantity(rs.getInt("quantity"));
	     cartlist.add(crt);
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
		return cartlist;
	}
	@Override
	public boolean deleteCart(int cartId) {
		try {
			con=DBUtility.getConnect();
		sql="delete from cart_123_afreen where cartId=?";
		ps=con.prepareStatement(sql);
		ps.setInt( 1, cartId);
		row=ps.executeUpdate();
		if(row>0) {
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
	public boolean clearCart(String emailId) {
		try {
			con=DBUtility.getConnect();
		sql="delete from cart_123_afreen where emailId=?";
		ps=con.prepareStatement(sql);
		ps.setString( 1, emailId);
		row=ps.executeUpdate();
		if(row>0) {
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