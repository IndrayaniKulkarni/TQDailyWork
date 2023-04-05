package com.arrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

// import com.studentComparableCompartor.Student;

public class StudentTester {


	public static void main(String [] args){
		ArrayList<Student> stu = new ArrayList<Student>();

		stu.add(new Student(101,"Mark",78.0f));
		stu.add(new Student(141,"Mitali",88.0f));
		stu.add(new Student(110,"Manoj",89.0f));
		stu.add(new Student(161,"Alice",89.0f));
	
		System.out.println("Before sorting with comparable (id) = ");
		for(Student s:stu){
			System.out.println(s);
		}
		Collections.sort(stu);
		System.out.println("After sorting = ");
		for(Student s:stu){
			System.out.println(s);
		}
       System.out.println("------------------------------------------");
		System.out.println("Before sorting with comparator(name) = ");
		for(Student s:stu){
			System.out.println(s);
		}
		Collections.sort(stu, new NameComparator());
		System.out.println("After sorting = ");
		for(Student s:stu){
			System.out.println(s);
		}
		System.out.println("------------------------------------------");
		System.out.println("Before sorting with comparator(marks) = ");
		for(Student s:stu){
			System.out.println(s);
		}
		Collections.sort(stu, new MarksComparator());
		System.out.println("After sorting = ");
		for(Student s:stu){
			System.out.println(s);
		}

	}
}
