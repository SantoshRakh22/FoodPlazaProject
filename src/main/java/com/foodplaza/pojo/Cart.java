package com.foodplaza.pojo;

public class Cart {
	private int cartID;
	private int foodId;
	private String emailId;
	private String foodName;
	private double price;
	private double totalPrice;
	private int quantity;
	public Cart() {
		super();
	}
	public Cart(int foodId, String emailId, String foodName, double price, double totalPrice,
			int quantity) {
		super();

		this.foodId = foodId;
		this.emailId = emailId;
		this.foodName = foodName;
		this.price = price;
		this.totalPrice = totalPrice;
		this.quantity = quantity;
	}
	public int getCartID() {
		return cartID;
	}
	public void setCartID(int cartID) {
		this.cartID = cartID;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Cart [cartID=" + cartID + ", foodId=" + foodId + ", emailId=" + emailId + ", foodName=" + foodName
				+ ", price=" + price + ", totalPrice=" + totalPrice + ", quantity=" + quantity + "]";
	}
	
}
