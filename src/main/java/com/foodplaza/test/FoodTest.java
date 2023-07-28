package com.foodplaza.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.foodplaza.dao.FoodDao_impl1;
import com.foodplaza.pojo.Food;

public class FoodTest {

	public static void main(String[] args) throws IOException {
		int foodId,choice=0;
		String foodname,foodtype,foodcatagory;
		double price;
		FoodDao_impl1 fdi=new FoodDao_impl1();
		boolean b;
		Scanner sc=new Scanner(System.in);
		InputStreamReader str=new InputStreamReader(System.in);
		BufferedReader rd=new BufferedReader(str);
		
		System.out.println("1.AddFood,2.update food,3.Delete food,4.GetAllFood ,5.searchFoodById");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter the name ");
			foodname=rd.readLine();
			System.out.println("enter the food type");
			foodtype=rd.readLine();
			System.out.println("enter the catagory");
			foodcatagory=rd.readLine();
			System.out.println("enter the price");
			price=sc.nextDouble();
		 Food food=new Food(foodname, foodtype, foodcatagory, price);
		 b=fdi.addFood(food);
		 if(b) {
			 System.out.println("successfuly");
		 }
		 else {
			 System.out.println("fail");
		 }
			break;
		case 2:
			System.out.println("enter the food id to existing food id");
			foodId=sc.nextInt();
			System.out.println("enter the name to update  ");
			foodname=rd.readLine();
			System.out.println("enter the food type to update ");
			foodtype=rd.readLine();
			System.out.println("enter the catagory to update ");
			foodcatagory=rd.readLine();
			System.out.println("enter the price update ");
			price=sc.nextDouble();
			Food food1=new Food(foodname, foodtype, foodcatagory, price);
			food1.setFoodId(foodId);
			b=fdi.updateFoodById(food1);
			if(b) {
				System.out.println("success");
			}
			else {
				System.out.println("fail");
			}
			break;
			
		case 3:
			System.out.println("enter the id to delete");
		foodId=sc.nextInt();
		b=fdi.deleteFoodById(foodId);
		if(b) {
			System.out.println("success");
		}
		else {
			System.out.println("fail");
		}
		
			break;
			
		case 4:
			System.out.println("all records");
			List<Food>foodList=fdi.getAllFood();
			Iterator<Food>it=foodList.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			break;
			
		case 5:
			System.out.println("enter the id to search");
			foodId=sc.nextInt();
			Food food2=fdi.searchFoodById(foodId);
			if(food2!=null) {
				System.out.println(food2);
			}
			else {
				System.out.println("not available");
			}
			break;
			
		case 6:
			break;
			
			
			
			default:System.out.println("invalid choice bhai ");
			
			
		}

	}

}
