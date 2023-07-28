package com.foodplaza.dao;

import java.util.List;

import com.foodplaza.pojo.Order;

public interface OderDao {
	Order placeOrder(String emailId);
	List<Order>showorder();
	

}
