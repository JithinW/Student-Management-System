package com.app.services;

import com.app.dao.StudentDaoImplementation;
import com.app.entity.Student;

public class ValidationService {
	
	Student student = new Student();
	static ValidationService validationService;
	StudentDaoImplementation dao = new StudentDaoImplementation();
	
	private ValidationService() {
		
	}
	
	public static ValidationService getInstance() {
		if (validationService == null)
		{
			synchronized(ValidationService.class) {
				if (validationService == null) {
					validationService = new ValidationService();
					return validationService;
				}
			}
		}
		return validationService;
	}
	
	
	public void validateRollNo(String rollNo){
		if (rollNo.matches("[A-Za-z]+") == true)
		{
			System.out.println("Roll number must be only digits");
			//System.exit(0);
			dao.addStudent();
		}
		else if(rollNo.length()==0) {
			System.out.println("Roll number cannot be empty, please enter your Roll number");
			dao.addStudent();
		}
		else {
			student.setRollno(rollNo);
		}
		}
	
	public void validateStudName(String studName){
		if (studName.matches("[0-9]+") == true )
		{
			System.out.println("Name should not contain digits");
			dao.addStudent();
		}
		else if(studName.length()==0) {
			System.out.println("Name cannot be a empty value, please enter your name");
			dao.addStudent();
		}
		else {
			student.setStudName(studName);
		}
		}
	
	public void validateGender(String gender){
		if (gender.matches("[0-9]+") == true )
		{
			System.out.println("Please enter a valid gender");
			dao.addStudent();
		}
		else if(gender.length()==0) {
			System.out.println("Gender cannot be a empty value, please enter your gender");
			dao.addStudent();
		}
		else {
			student.setGender(gender);
		}
		}
	
	public void validateDob(String dob){
		if (dob.matches("^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)\\d\\d$") == false )
		{
			System.out.println("Please enter Date of birth in the given format");
			dao.addStudent();
		}
		else if(dob.length()==0) {
			System.out.println("please input your Date of birth");
			dao.addStudent();
		}
		else {
			student.setGender(dob);
		}
		}
	
	public void validateCourse(String course){
		if (course.matches("[0-9]+") == true )
		{
			System.out.println("Course name should not contain digits, please input a valid course name");
			dao.addStudent();
		}
		else if(course.length()==0) {
			System.out.println("course name cannot be a null value, please enter your course name");
			dao.addStudent();
		}
		else {
			student.setCourse(course);
		}
		}
	
	public void validatePhone(String phone){
		if (phone.matches("[0-9]+") == false )
		{
			System.out.println("Please input valid phone number");
			dao.addStudent();
		}
		else if(phone.length()<10) {
			System.out.println("phone number must be atleast 10 digits, please enter your valid phone number");
			dao.addStudent();
		}
		else {
			student.setCourse(phone);
		}
		}
	
	public void validatePlace(String place){
		if (place.matches("[0-9]+") == true )
		{
			System.out.println("Please enter valid place name");
			dao.addStudent();
		}
		else {
			student.setCourse(place);
		}
		}
	
	}

