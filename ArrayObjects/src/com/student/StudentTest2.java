package com.student;

import java.util.Scanner;

public class StudentTest2 {
static Scanner sc = new Scanner(System.in);
public static void input(Student s) {
	System.out.println("Id = ");
	s.setId(sc.nextInt());
	System.out.println("Name = ");
	s.setName(sc.next());
	System.out.println("Marks = ");
	s.setMarks(sc.nextFloat());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("No. of students = ");
		int n= sc.nextInt();
		
		Student st[] = new Student[n];
		
		for(int i =0; i<n; i++) {
			st[i] = new Student();
			input(st[i]);
		}
		System.out.println("Entered details = ");
		for(Student x : st) {
			System.out.println(x.toString()+"\n");
		}
	}

}
