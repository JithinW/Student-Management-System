package com.app.services;

import java.util.Scanner;
import com.app.dao.IStudentDao;
import com.app.dao.StudentDaoImplementation;

public class AdminHomeService {
	
	IStudentDao Dao;
	LoginChoices loginChoices;
	
	static AdminHomeService adminHomeService;
	
	
	private AdminHomeService(){
		
	}
	
	public static AdminHomeService getInstance() {
		if (adminHomeService == null)
		{
			synchronized(AdminHomeService.class) {
				if (adminHomeService == null) {
					return adminHomeService = new AdminHomeService();
				}
			}
		}
		return adminHomeService;
	}
	
	
	
	
	
	public void menu() {
		Dao = new StudentDaoImplementation();
		loginChoices = new LoginChoices();
		System.out.println("-----------Welcome To Student Management System--------------\n"
				+ "\n1.Add Student"
				+ "\n2.View all Student"
				+ "\n3.Log out");
		
		Scanner choiceScanner = new Scanner(System.in);
		int ch = choiceScanner.nextInt();
		switch(ch)
		{
			case 1:Dao.addStudent();
			break;
			
			case 2:Dao.viewAllStudent();
			break;
			
			case 3:loginChoices.choice();
			break;
			
			default:System.out.println("Invalid input, please enter a valid choice");
			choiceScanner.close();
			menu();
			break;
		}
	}
}
