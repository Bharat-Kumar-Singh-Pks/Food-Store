package com.project.demo.controller;

import java.util.Scanner;

import com.project.demo.entity.Customer;
import com.project.demo.service.CustomerService;
import com.project.demo.service.impl.CustomerServiceImpl;

public class CustomerController {
	
	
	private CustomerService customerService = new CustomerServiceImpl();
	
	//instance block 
	{
		addCustomer();
	}
	
	private void addCustomer() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter FirstName");
		String firstName = s.next();
		System.out.println("Enter LastName");
		String lastName = s.next();					
		System.out.println("Enter Username");
		String email2 = s.next();
		System.out.println("Enter Password");
		String password2 = s.next();
		Customer customer = new Customer(firstName, lastName, email2, password2);
		System.out.println(customer);
		
		boolean isCutomerAdded = customerService.addCustomer(customer);
		if(isCutomerAdded) {
			System.out.println("Customer has been added successfully..");
		}else {
			System.out.println("Something went wrong to add customer...");
		}
		
	}

}
