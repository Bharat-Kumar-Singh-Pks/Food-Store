package com.project.demo.view;

import java.util.Scanner;

import com.project.demo.controller.AuthenticationController;
import com.project.demo.controller.CustomerController;
import com.project.demo.entity.Customer;

public class Dashboard {
	
	
	public static void main(String[] args) {
		
		int option = 0;
		
		do {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter 1 to Login\nEnter 2 to Create Account\nEnter 6 to exit");
			option = s.nextInt();
			switch(option) {
				case 1:
					new AuthenticationController();
					break;
				case 2:
					new CustomerController();
					break;
				case 6:
					System.out.println("Exited....");
					break;
			}
			
		}while(option != 6);
	}

}
