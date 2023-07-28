package com.foodplaza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.foodplaza.pojo.Customer;
import com.foodplaza.utility.DBUtility;

public class CustomerDao_impl implements CustomerDao{
Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int row;


	

	@Override
	public boolean addCustomer(Customer customer) {
		try {
		con=DBUtility.getConnect();
		sql="insert into customer_123_afreen (cName,cEmailId,cPassword,cAddress,cContactNo) values(?,?,?,?,?)";
		ps=con.prepareStatement(sql);
		ps.setString(1, customer.getCustomerName());
		ps.setString(2, customer.getcEmailId());
		ps.setString(3, customer.getcPassword());
		ps.setString(4, customer.getcAddress());
		ps.setString(5, customer.getcContactNo());
		row=ps.executeUpdate();
		if(row>0) {
			return true;
		}
		else {
			return false;
		}
		
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateCustomerById(Customer customer) {
		try {
		con=DBUtility.getConnect();
		sql="update  customer_123_afreen set  cName=?,cPassword=?,cAddress=?,cContactNo=? where cEmailId=?";
		ps=con.prepareStatement(sql);
		
		ps.setString(1, customer.getCustomerName());
		ps.setString(2, customer.getcPassword());
		ps.setString(3, customer.getcAddress());
		ps.setString(4, customer.getcContactNo());
		ps.setString(5, customer.getcEmailId());
		row=ps.executeUpdate();


		if(row>0) {
			return true;
		}
		else {
			return false;
		} 
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteCustomerById(String cEmailId) {
		try {
			con=DBUtility.getConnect();
		sql="delete from customer_123_afreen where cEmailId=?";
		ps=con.prepareStatement(sql);
		ps.setString( 1, cEmailId);
		row=ps.executeUpdate();
		if(row>0) {
			return true;
		}
		else {
			return false;
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}
		
		return false;
	}

	@Override
	public List<Customer> getAllCustomer() {
		List<Customer>customerList=new ArrayList<>();
		try {
		con=DBUtility.getConnect();
		sql="select * from customer_123_afreen";
		ps=con.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()) {
			Customer customer=new Customer();
			customer.setCustomerName(rs.getString("cName"));
			customer.setcAddress(rs.getString("cAddress"));
			customer.setcPassword(rs.getString("cPassword"));
			customer.setcContactNo(rs.getString("cContactNo"));
			customer.setcEmailId(rs.getString("cEmailId"));
			customerList .add(customer);
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return customerList;
	}

	@Override
	public Customer searchCustomerByEmailId(String cEmailId) {
		Customer customerList1=null;
		try {
		con=DBUtility.getConnect();
		sql="select * from customer_123_afreen where cEmailId=?";
		ps=con.prepareStatement(sql);
		ps.setString(1, cEmailId);
		rs=ps.executeQuery();
		if(rs.next()) {
			customerList1=new Customer();
			customerList1.setCustomerName(rs.getString("cName"));
			customerList1.setcAddress(rs.getString("cAddress"));
			customerList1.setcPassword(rs.getString("cPassword"));
			customerList1.setcContactNo(rs.getString("cContactNo"));
			customerList1.setcEmailId(rs.getString("cEmailId"));
			
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return customerList1;
	}

}
