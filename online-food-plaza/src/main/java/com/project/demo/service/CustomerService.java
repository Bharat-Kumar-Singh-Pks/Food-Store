package com.project.demo.service;

import java.util.List;

import com.project.demo.entity.Customer;

public interface CustomerService {
	
	//To add new customer
	boolean addCustomer(Customer customer);
	
	//To modify any customer details
	boolean updateCustomer(Customer customer);
	
	//To delete any customer record
	boolean deleteCustomer(String email);
	
	//To search any existing customer
	Customer searchCustomer(String emai);
	
	//To show all the customer records
	List<Customer> getAllCustomers();

}
