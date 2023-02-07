package com.basics;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.enterDetails(101, "Sarah", 20, 79);
		char grade = s.getGrade();
		s.displayDetails();
		System.out.println("Grade :"+grade);
	}

}
