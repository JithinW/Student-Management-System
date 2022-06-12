package com.app;

import com.app.services.EmailLogin;
import com.app.services.LoginService;

public class StudentMain {

	public static void main(String[] args) {
		
		LoginService loginService = new EmailLogin();
		loginService.loginChoice();
	}

}
