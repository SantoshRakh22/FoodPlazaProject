package com.foodplaza.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.foodplaza.dao.CustomerDao_impl;
import com.foodplaza.pojo.Customer;
import com.foodplaza.pojo.Food;

public class CustomerTest {

	public static void main(String[] args) throws IOException {
		int choice;
		String cContactNo;
		String customerName,cEmailId,cPassword,cAddress;
		CustomerDao_impl cti=new CustomerDao_impl();
		boolean b;
		Scanner sc=new Scanner(System.in);
		InputStreamReader str=new InputStreamReader(System.in);
		BufferedReader rd=new BufferedReader(str);
		System.out.println("1.addCustomer,2.update customer ,3.Delete customer,4.Get customer ,5.searchcustomerByemailId");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter the customer name ");
			customerName=rd.readLine();
			System.out.println("enter the customer email id");
			cEmailId=rd.readLine();
			System.out.println("enter the passord");
			cPassword=rd.readLine();
			System.out.println("enter the address");
			cAddress=sc.next();
			System.out.println("enter the customer  contactNo");
			cContactNo=sc.next();
				
		 Customer customer=new Customer(customerName, cEmailId, cPassword, cAddress, cContactNo);
		 b=cti.addCustomer(customer);
		 if(b) {
			 System.out.println("successfuly");
		 }
		 else {
			 System.out.println("fail");
		 }
			break;
		case 2:
			System.out.println("enter the existing emailid");
			cEmailId=rd.readLine();
			System.out.println("enter the customer name ");
			customerName=rd.readLine();
			System.out.println("enter the passord");
			cPassword=rd.readLine();
			System.out.println("enter the address");
			cAddress=sc.next();
			System.out.println("enter the customer  contactNo");
			cContactNo=sc.next();
			Customer customer1=new Customer(customerName, cEmailId, cPassword, cAddress, cContactNo);
			
			 b=cti.updateCustomerById(customer1);
			 if(b) {
				 System.out.println("successfuly");
			 }
			 else {
				 System.out.println("fail");
			 }
				
			
			break;
		case 3:
			System.out.println("enter the email id");
			cEmailId=rd.readLine();
			b=cti.deleteCustomerById(cEmailId);
			if(b) {
				System.out.println("success");
			}
			else {
				System.out.println("fail");
			}
			
			break;
		case 4:
			System.out.println("all records");
			List<Customer> customerList=cti.getAllCustomer();
			Iterator<Customer>it=customerList.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			break;
		case 5:
			System.out.println("enter the existing emailid");
			cEmailId=rd.readLine();
			Customer cn=cti.searchCustomerByEmailId(cEmailId);
			if(cn!=null) {
				System.out.println(cn);
			}
			else {
				System.out.println("not availabel");
			}
			break;
		
			
	}

	}
}
