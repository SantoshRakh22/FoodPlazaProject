package com.foodplaza.dao;

import java.util.List;

import com.foodplaza.pojo.Customer;

public interface CustomerDao {
	boolean addCustomer(Customer customer);
	boolean updateCustomerById(Customer customer);
	boolean deleteCustomerById(String cEmailId);
	List<Customer>getAllCustomer();
	Customer searchCustomerByEmailId(String cEmailId);

}
