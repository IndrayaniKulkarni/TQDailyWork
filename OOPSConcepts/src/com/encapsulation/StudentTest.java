package com.encapsulation;

import java.util.Scanner;

public class StudentTest {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println(s);
		System.out.println("\nDetails -");
		System.out.println("Name = ");
		s.setName(sc.next());
		
		System.out.println("ID = ");
		s.setId(sc.nextInt());
		
		System.out.println("Age = ");
		s.setAge(sc.nextInt());
		
		System.out.println("Marks = ");
		s.setMarks(sc.nextFloat());
		
		System.out.println("Name :"+s.getName());
		System.out.println("ID : "+s.getId());
		System.out.println("Age : "+s.getAge());
		System.out.println("Marks :"+s.getMarks());
		sc.close();
	}
}
