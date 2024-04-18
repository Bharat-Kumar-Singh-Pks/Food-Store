package com.project.demo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.project.demo.dao.CustomerDao;
import com.project.demo.entity.Customer;
import com.project.demo.utility.DbConnection;

public class CustomerDaoImpl implements CustomerDao {
	
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	@Override
	public boolean addCustomer(Customer customer) {
		System.out.println("From CustomerDaoImpl class: "+customer);
		try {
			con = DbConnection.establishConnection();
			ps = con.prepareStatement("insert into customer(first_name, last_name, email, password) values(?,?,?,?)");
			ps.setString(1, customer.getFirstName());
			ps.setString(3, customer.getEmail());
			ps.setString(2, customer.getLastName());
			ps.setString(4, customer.getPassword());
			
			int rows = ps.executeUpdate();
			if(rows>0) {
				return true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null && con != null) {
					ps.close();
					con.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return false;
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
