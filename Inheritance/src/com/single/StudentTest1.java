package com.single;

import java.util.Scanner;

public class StudentTest1 {

	static Scanner sc = new Scanner(System.in);
	
	static void input(Student obj) {
		
		System.out.println("id = ");
		obj.setId(sc.nextInt());
		System.out.println("name = ");
		obj.setName(sc.next());
		System.out.println("age = ");
		obj.setAge(sc.nextInt());
		System.out.println("address = ");
		obj.setAddress(sc.next());
		
	}
	
	public static void main(String[] args) {

		Student s = new Student();
		input(s);
		System.out.println(s.toString());
	}

}
