package com.app.services;

import java.util.Scanner;

public class LoginChoices {

	StudentFactory studentFactory; 
	Scanner choiceScanner = new Scanner(System.in);
	
	public void choice()
	{
		studentFactory = new StudentFactory();
		 
		System.out.println("---------------Student Management System---------------"
				+ "\n\n1. Login using Email"
				+ "\n2. Login using Phone no.");
		
		int ch = choiceScanner.nextInt();
		switch(ch) {
		
		case 1:studentFactory.getObject("old").login();
		break;
		
		case 2:studentFactory.getObject("new").login();
		break;
		
		default : System.out.println("Please enter a valid choice");
		choice();
		break;
		}
	}
}
