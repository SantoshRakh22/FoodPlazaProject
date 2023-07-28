package com.foodplaza.test;

import java.sql.Connection;

import com.foodplaza.utility.DBUtility;

public class ConnectionTest {

	public static void main(String[] args) {
Connection con=DBUtility.getConnect();
if(con!=null) {
	System.out.println("connect success");
}
else {
System.out.println("fail");
}
	}

}
