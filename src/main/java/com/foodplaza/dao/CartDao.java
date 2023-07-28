package com.foodplaza.dao;

import java.util.List;

import com.foodplaza.pojo.Cart;

public interface CartDao {
	boolean addToCart(Cart cart);
	List<Cart>showCart(String email);
	boolean deleteCart(int cartId);
	boolean clearCart(String emailId);
		
	
		
	

}
