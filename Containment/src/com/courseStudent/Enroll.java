package com.courseStudent;

public class Enroll {

	public static void main(String[] args) {
		
		Course c1 = new Course(121,"Python",20000.0f);
		Course c2 = new Course(130,"Java",20000.0f);
		
		
		Student s1 = new Student(232,"Joanthan",19,c1);
		Student s2 = new Student(342,"Gwendoline",18);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		s2.setCourse(c2);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
	}

}
