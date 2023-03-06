package com.hierarchical;

public class StudentTest {

	public static void main(String[] args) {
		
		SchoolStudent s1 = new SchoolStudent(123,"molly", 90.4f, 21242.0, "MSSSchool", 10);
		CollegeStudent c1 = new CollegeStudent(121,"jeff",90.0f,5000000,"MCA",3);
		
		System.out.println(s1);
		System.out.println(c1);

	}

}
