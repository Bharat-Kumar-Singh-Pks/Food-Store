package com.project.demo.service.impl;

import java.util.List;

import com.project.demo.dao.CustomerDao;
import com.project.demo.dao.impl.CustomerDaoImpl;
import com.project.demo.entity.Customer;
import com.project.demo.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	
	
	private CustomerDao customerDao = new CustomerDaoImpl();

	@Override
	public boolean addCustomer(Customer customer) {
		System.out.println("From CustomerServiceImpl class: "+customer);
		return customerDao.addCustomer(customer);
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomer(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer searchCustomer(String emai) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
