package com.foodplaza.dao;

import java.util.List;

import com.foodplaza.pojo.Food;

public interface FoodDao {
	boolean addFood(Food food) ;
	boolean updateFoodById(Food food);
	boolean deleteFoodById(int foodId);
	List<Food>getAllFood();
	Food searchFoodById(int foodId);		

}
