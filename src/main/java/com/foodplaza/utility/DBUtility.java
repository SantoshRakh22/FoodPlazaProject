package com.foodplaza.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
	public static Connection getConnect() {
		Connection con=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BasicDB","dbuser","Squ@d123");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}  catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
