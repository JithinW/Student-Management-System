package com.app.services;

import java.util.Scanner;

public abstract class LoginService {
	
	Scanner choiceScanner = new Scanner(System.in);
	LoginService emailLogin;
	LoginService phoneNoLogin;
	
	
	public void loginChoice()
	{
		 emailLogin = new EmailLogin();
		 phoneNoLogin = new PhoneNoLogin();
		 
		System.out.println("---------------Student Management System---------------"
				+ "\n\n1. Login using Email"
				+ "\n2. Login using Phone no.");
		
		int ch = choiceScanner.nextInt();
		switch(ch) {
		
		case 1:emailLogin.login();
		break;
		
		case 2:phoneNoLogin.login();
		break;
		
		default : System.out.println("Please enter a valid choice");
		loginChoice();
		break;
		}
	}
	
	public abstract void login();

}
