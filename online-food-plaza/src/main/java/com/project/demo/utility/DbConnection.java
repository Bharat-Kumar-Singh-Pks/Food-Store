package com.project.demo.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	private static Connection con;
	
	public static Connection establishConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db6534", "root", "j0j0p@ssw0rd");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void main(String[] args) {
		if(DbConnection.establishConnection() != null) {
			System.out.println("Connected...");
		}else {
			System.out.println("Not connected...");
		}
	}

}
