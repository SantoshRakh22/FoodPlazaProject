package com.foodplaza.pojo;

public class Food {
	private int foodId;
	private String foodName;
    private String foodtType;
    private String foodCatagory;
    private double price;
    
	public Food() {
		super();
	}

	public Food( String foodName, String foodtType, String foodCatagory, double price) {
		super();
		
		this.foodName = foodName;
		this.foodtType = foodtType;
		this.foodCatagory = foodCatagory;
		this.price = price;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodtType() {
		return foodtType;
	}

	public void setFoodtType(String foodtType) {
		this.foodtType = foodtType;
	}

	public String getFoodCatagory() {
		return foodCatagory;
	}

	public void setFoodCatagory(String foodCatagory) {
		this.foodCatagory = foodCatagory;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", foodName=" + foodName + ", foodtType=" + foodtType + ", foodCatagory="
				+ foodCatagory + ", price=" + price + "]";
	} 
	
}
