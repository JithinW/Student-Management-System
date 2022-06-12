package com.app.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.app.entity.Student;
import com.app.services.AdminHomeService;
import com.app.services.ValidationService;

public class StudentDaoImplementation implements IStudentDao {
	
	public static ArrayList<Student> studList=new ArrayList<Student>();
	Student student;
	ValidationService validationService;
	AdminHomeService adminHomeService;
	Scanner studDetail = new Scanner(System.in);

	@Override
	public void addStudent() {
    student = new Student();
    adminHomeService = new AdminHomeService();
    validationService = new ValidationService();
		
		System.out.println("------------------------Add Student Details-------------------------\n\nEnter roll number :");
		student.setRollno(studDetail.next());
		validationService.validateRollNo(student.getRollno());
		
		System.out.println("Enter student name :");
		student.setStudName(studDetail.next());
		validationService.validateStudName(student.getStudName());
		
		System.out.println("Enter gender :");
		student.setGender(studDetail.next());
		validationService.validateGender(student.getGender());
		
		System.out.println("Enter Dob (eg format:06-06-1999) :");
		student.setDob(studDetail.next());
		validationService.validateDob(student.getDob());
		
		System.out.println("Enter course name :");
		student.setCourse(studDetail.next());
		validationService.validateCourse(student.getCourse());
		
		System.out.println("Enter Place :");
		student.setPlace(studDetail.next());
		validationService.validatePlace(student.getPlace());
		
		System.out.println("Enter phone no. :");
		student.setPhone(studDetail.next());
		validationService.validatePhone(student.getPhone());
		
		System.out.println("Enter email id :");
		student.setEmail(studDetail.next());
		
		studList.add(new Student(student.getRollno(),student.getStudName(),student.getGender(),student.getDob(),student.getCourse(),student.getPlace(),student.getPhone(),student.getEmail()));
		
		adminHomeService.menu();

	}
	
	public void viewAllStudent() {
		student = new Student();
		adminHomeService = new AdminHomeService();
	    System.out.print("\n-------------------Student Details--------------------\n\n");
	    if(studList.size()>0) {
		for (Student stud: studList){
			System.out.println("\n"+ stud);
		}
	    }
	    else {
	    	System.out.println("No details added yet!\n");
	    }
		
		adminHomeService.menu();
	    
	}
    

}
