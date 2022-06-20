package com.app.services;

public class StudentFactory {
	
	
	public LoginService getObject(String word) {
			
			if (word.equals("old")) {
				return new EmailLogin();
			}
			else {
				return new PhoneNoLogin();
			}	
		
	}

}
