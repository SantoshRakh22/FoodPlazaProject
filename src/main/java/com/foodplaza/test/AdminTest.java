package com.foodplaza.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.foodplaza.dao.AdminDao_Impl;

public class AdminTest {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
        int choice=0;
        String aemailID,apassword,uemailid,upassword;
        AdminDao_Impl adl=new AdminDao_Impl();
        System.out.println("1.userLogin, 2.userChangePassword,3.adminLogin,4.adminChangePassword");
        InputStreamReader str=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(str);
        System.out.println("enter choice");
        choice=sc.nextInt();
        switch(choice) {
        case 1:
        	System.out.println("enter customer  emialid");
        	uemailid=br.readLine();
        	System.out.println("enter the password");
        	upassword=br.readLine();
        	boolean b=adl.userLogin(uemailid, upassword);
        	if(b) {
        		System.out.println("successfully");
        	}
        	else {
        		System.out.println("Failed");
        	}
        	
        	
        	break;
        case 2:
        	System.out.println("enter the existing emailid");
        	uemailid=br.readLine();
        	System.out.println("enrter the new password");
        	upassword=br.readLine();
        	 b=adl.userChangePassword(uemailid, upassword);
        	if(b) {
        		System.out.println("successfully..............");
        	}
        	else {
        		System.out.println("failed.............");
        	}
        	
        	
        	break;
        	
        case 3:
        	System.out.println("enter the emailid");
        	aemailID=br.readLine();
        	System.out.println("enter the password");
        	apassword=br.readLine();
        	b=adl.adminLogin(aemailID, apassword);
        	if(b) {
        		System.out.println("successfully");
        	}
        	else {
        		System.out.println("Failed.");
        	}
        	break;
        case 4:
        	System.out.println("enter the existing emailid");
        	aemailID=br.readLine();
        	System.out.println("enrter the new password");
        	apassword=br.readLine();
        	 b=adl.adminChangePassword(aemailID, apassword);
        	if(b) {
        		System.out.println("successfully..............");
        	}
        	else {
        		System.out.println("failed.............");
        	}
        	
        	
        	
        	break;
        }
        
	}

}
