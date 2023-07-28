package com.foodplaza.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.foodplaza.dao.OrderDao_Impl;
import com.foodplaza.pojo.Cart;
import com.foodplaza.pojo.Order;

public class OrderTest {

	public static void main(String[] args) throws IOException {
		String emailID;
		int choice;
		boolean b;
		OrderDao_Impl odl=new OrderDao_Impl();
		Scanner sc=new Scanner(System.in);
		InputStreamReader str=new InputStreamReader(System.in);
		BufferedReader rd=new BufferedReader(str);
		
		
		System.out.println("1.PLACE ORDER, 2.SHOW ORDER");

		System.out.println("enter choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter the emailid");
			emailID=rd.readLine();
          Order order=odl.placeOrder(emailID);	
          if(order!=null) {
        	  System.out.println(order);
          }
          else {
        	  System.out.println("fail");
          }
			break;
		case 2:
			System.out.println("show orders");
        List<Order>ot1=odl.showorder();
        Iterator<Order>it=ot1.iterator();
        
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        break;
        	}
			
			
			
		}
		

	}


