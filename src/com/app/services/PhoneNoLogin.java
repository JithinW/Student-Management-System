package com.app.services;

import java.util.Scanner;

public class PhoneNoLogin extends LoginService {
	AdminHomeService adminHomeService;
	Scanner loginScanner = new Scanner(System.in);

	@Override
	public void login() {
		
		adminHomeService = new AdminHomeService();
		
		System.out.println("Enter Phone no. :");
		String phone = loginScanner.nextLine();
		
		System.out.println("Enter Password :");
		String password = loginScanner.nextLine();
		
		if (phone.equals("1234567890") && password.equals("admin")) {
			
			adminHomeService.menu();
			
		}
		else {
			System.out.println("login failed, please make sure your entered phone no and password is correct. Please try again");
			login();
		}
		
	}

}
