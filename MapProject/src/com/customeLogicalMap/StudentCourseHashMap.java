package com.customeLogicalMap;

import java.util.ArrayList;

public class StudentCourseHashMap {

	public static void courseCount(ArrayList<Student> st) {
		
	}
	public static void main(String[] args) {
	
		ArrayList<Student> sem1 = new ArrayList<>();
		
		Course c1 = new Course(1013,"Formal Language And Automata Theory");
		Course c2 = new Course(1012,"Artifical Intelligence");
		Course c3 = new Course(2201,"Mathematics3");
		
		sem1.add(new Student(1021,"Sonali",80f,c3));
		sem1.add(new Student(132,"Suman",90f,c2));
		sem1.add(new Student(101,"Sonam",80f,c3));
		sem1.add(new Student(102,"Ruchita",90f,c1));
		
		
	}

}
