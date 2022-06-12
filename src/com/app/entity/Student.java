package com.app.entity;

public class Student {
	
	private String rollno;
	private String studName;
	private String gender;
	private String dob;
	private String course;
	private String place;
	private String phone;
	private String email;
	
	public Student() {
		
	}
	public Student(String rollno, String studName, String gender, String dob, String course, String place,
			String phone, String email) {
		super();
		this.rollno = rollno;
		this.studName = studName;
		this.gender = gender;
		this.dob = dob;
		this.course = course;
		this.place = place;
		this.phone = phone;
		this.email = email;
	}
	
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String address) {
		this.place = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	@Override
	public String toString() {
		return "Rollno : " + rollno + "\nStudent Name :" + studName + "\nGender :" + gender + "\nDob :" + dob
				+ "\nCourse :" + course + "\nPlace :" + place + "\nPhone :" + phone + "\nEmail :" + email+"\n";
	}
}
