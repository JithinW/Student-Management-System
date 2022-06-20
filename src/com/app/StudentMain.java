package com.app;

import com.app.services.LoginService;
import com.app.services.StudentFactory;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentFactory studentFactory = new StudentFactory();
		
		LoginService loginService = studentFactory.getObject("old");
		loginService.login();
		
	}

}
