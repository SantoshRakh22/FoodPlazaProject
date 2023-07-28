package com.foodplaza.pojo;

public class Order {
	private int orderId;
	private String emailId;
	private double totalPrice;
	private String  date;
	public Order() {
		super();
	}
	public Order( String emailId, double totalPrice, String date) {
		super();
		
		this.emailId = emailId;
		this.totalPrice = totalPrice;
		this.date = date;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", emailId=" + emailId + ", totalPrice=" + totalPrice + ", date=" + date
				+ "]";
	}
	

}
