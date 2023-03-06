package com.studentArray;

import java.util.Scanner;

public class StudentTester {

	static Scanner sc = new Scanner(System.in);

	public static void input(Student s) {
		System.out.println("id = ");
		s.setId(sc.nextInt());
		System.out.println("name = ");
		s.setName(sc.next());
		System.out.println("marks(of 3 subjects) = ");
		float marks[]= new float [3];
		for(int i = 0; i<4; i++) {
			marks[i]=sc.nextFloat();
		}
		s.setMarks(marks);
	}
	public static void main(String[] args) {
		

	}

}
