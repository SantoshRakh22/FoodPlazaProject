package com.foodplaza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.foodplaza.pojo.Food;
import com.foodplaza.utility.DBUtility;

public class FoodDao_impl1 implements FoodDao{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int row;

	@Override
	public boolean addFood(Food food) {
try {
	con=DBUtility.getConnect();
	sql="insert into food_123_afreen(foodname,foodtype, foodcatagory,price)values(?,?,?,?)";
	ps=con.prepareStatement(sql);
	ps.setString(1, food.getFoodName());
	ps.setString(2, food.getFoodtType());
	ps.setString(3, food.getFoodCatagory());
	ps.setDouble(4, food.getPrice());
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
	public boolean updateFoodById(Food food) {
		try {
			con=DBUtility.getConnect();
		sql="update  food_123_afreen set  foodname=?,foodtype=?,foodcatagory=?,price=? where foodId=?;";
		ps=con.prepareStatement(sql);
		ps.setString(1, food.getFoodName());
		ps.setString(2, food.getFoodtType());
		ps.setString(3, food.getFoodCatagory());
		ps.setDouble(4, food.getPrice());
		ps.setInt(5, food.getFoodId());
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
	public boolean deleteFoodById(int foodId) {
		try {
			con=DBUtility.getConnect();
		sql="delete from food_123_afreen where foodId=?";
		ps=con.prepareStatement(sql);
		ps.setInt( 1, foodId);
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
	public List<Food> getAllFood() {
		List<Food>foodList=new ArrayList<>();
		try {
		con=DBUtility.getConnect();
		sql="select * from food_123_afreen";
		ps=con.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()){
			Food food=new Food();
			food.setFoodId(rs.getInt("foodId"));
			food.setFoodName(rs.getString("foodName"));
			food.setFoodCatagory(rs.getString("foodcatagory"));
			food.setFoodtType(rs.getString("foodtype"));
			food.setPrice(rs.getDouble("price"));
			foodList.add(food);
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return foodList;
	}

	@Override
	public Food searchFoodById(int foodId) {
		Food foodList=null;
		try {
		con=DBUtility.getConnect();
		sql="select * from food_123_afreen where foodId=? ";
		ps=con.prepareStatement(sql);
		ps.setInt(1, foodId);
		rs=ps.executeQuery();
		if(rs.next()) {
			foodList=new Food();
			foodList.setFoodId(rs.getInt("foodId"));
			foodList.setFoodName(rs.getString("foodName"));
			foodList.setFoodCatagory(rs.getString("foodcatagory"));
			foodList.setFoodtType(rs.getString("foodtype"));
			foodList.setPrice(rs.getDouble("price"));
			
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return foodList;
	}

}
