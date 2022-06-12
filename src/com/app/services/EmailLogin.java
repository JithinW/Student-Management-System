package com.app.services;

import java.util.Scanner;

public class EmailLogin extends LoginService{
	
	AdminHomeService adminHomeService;
	Scanner loginScanner = new Scanner(System.in);

	@Override
	public void login() {
		
		adminHomeService = new AdminHomeService();
		
		System.out.println("Enter Email Id :");
		String email = loginScanner.nextLine();
		
		System.out.println("Enter Password :");
		String password = loginScanner.nextLine();
		
		if (email.equals("admin@gmail.com") && password.equals("admin")) {
			adminHomeService.menu();
			
		}
		else {
			System.out.println("login failed, please make sure your entered email and password is correct. Please try again");
			login();
		}
		
	}

}
