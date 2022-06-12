package com.app.services;

import com.app.entity.Student;

public class ValidationService {
	
	Student student = new Student();
	
	public void validateRollNo(String rollNo){
		if (rollNo.matches("[A-Za-z]+") == true)
		{
			System.out.println("Roll number must be only digits");
		}
		else {
			student.setRollno(rollNo);
		}
		}
	
	public void validateStudName(String studName){
		if (studName.matches("[0-9]+") == true )
		{
			System.out.println("Name should not contain digits");
		}
		else {
			student.setStudName(studName);
		}
		}
	
	public void validateGender(String gender){
		if (gender.matches("[0-9]+") == true )
		{
			System.out.println("Please enter a valid gender");
		}
		else {
			student.setGender(gender);
		}
		}
	
	public void validateDob(String dob){
		if (dob.matches("^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)\\d\\d$") == false )
		{
			System.out.println("Please enter Date of birth in the given format");
		}
		else {
			student.setGender(dob);
		}
		}
	
	public void validateCourse(String course){
		if (course.matches("[0-9]+") == true )
		{
			System.out.println("Course name should not contain digits, please input a valid course name");
		}
		else {
			student.setCourse(course);
		}
		}
	
	public void validatePhone(String phone){
		if (phone.matches("[0-9]+") == false )
		{
			System.out.println("Please input valid phone number");
		}
		else {
			student.setCourse(phone);
		}
		}
	
	public void validatePlace(String place){
		if (place.matches("[0-9]+") == true )
		{
			System.out.println("Please input proper place name");
		}
		else {
			student.setCourse(place);
		}
		}
	
	}

