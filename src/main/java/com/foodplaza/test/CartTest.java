package com.foodplaza.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.foodplaza.dao.CartDao_Impl;
import com.foodplaza.pojo.Cart;

public class CartTest {

	public static void main(String[] args) throws IOException {
		int choice,cartId,quantity,foodId;
		double price,totalPrice;
		String emailId,foodname;
		CartDao_Impl cdim=new CartDao_Impl();
		boolean b;
		Scanner sc=new Scanner(System.in);
		InputStreamReader str=new InputStreamReader(System.in);
		BufferedReader rd=new BufferedReader(str);
		System.out.println("1.addTocart,2.showCart,3.DeletCart,4.clearcart");
		choice=sc.nextInt();
        switch(choice) {
        case 1:
        	System.out.println("enter the food id");
        	foodId=sc.nextInt();
        	System.out.println("enter the emailid");
        	emailId=rd.readLine();
        	System.out.println("enter the foodname ");
        	foodname=rd.readLine();
        	
        	System.out.println("enter the price ");
        	price=sc.nextDouble();
        	System.out.println("enter the quantity");
        	quantity=sc.nextInt();
        	totalPrice=price*quantity;
        	Cart cart1=new Cart(foodId, emailId, foodname, price, totalPrice, quantity);
        	b=cdim.addToCart(cart1);
        	 if(b) {
    			 System.out.println("successfuly");
    		 }
    		 else {
    			 System.out.println("fail");
    		 }
        	break;
        case 2:
        	System.out.println("enter emailid");
        	emailId=rd.readLine();
        	List<Cart>cartlist=cdim.showCart(emailId);
        	Iterator<Cart>it=cartlist.iterator();
        	while(it.hasNext()) {
        		System.out.println(it.next());
        	}
        	break;
        case 3:
    System.out.println("enter the id");
    cartId=sc.nextInt();
    b=cdim.deleteCart(cartId);
    if(b) {
		 System.out.println("successfuly");
	 }
	 else {
		 System.out.println("fail");
	 }



        	break;
        	
        case 4:
            System.out.println("enter the email id you want to delete");
           emailId=rd.readLine();
            b=cdim.clearCart(emailId);
            if(b) {
        		 System.out.println("successfuly");
        	 }
        	 else {
        		 System.out.println("fail");
        	 }
            break;
        }    
	
	}

}
