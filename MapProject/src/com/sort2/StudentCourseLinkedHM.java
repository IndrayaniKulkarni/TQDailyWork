package com.sort2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentCourseLinkedHM {
	//incomplete
	public static void listByCourse(HashMap<Student,Course> stLs) {
		
		ArrayList<Course> c = new ArrayList<>(stLs.values());
		Collections.sort(c);
	}
	public static void sortByKey(HashMap<Student, Course> stLs) {
		
		ArrayList<Student> stu = new ArrayList<>(stLs.keySet());	
		Collections.sort(stu, new MarksComparator());
//		System.out.println(stu);
		LinkedHashMap<Student, Course> marksList = new LinkedHashMap<>();
		
		for(Student s: stu) {
			marksList.put(s, stLs.get(s));
		}
		
		for(Map.Entry<Student, Course> en: marksList.entrySet()) {
			System.out.println(en.getKey()+ " : "+en.getValue());
		}
		
		
	}
	public static void main(String[] args) {
		
		HashMap<Student, Course> stLs = new HashMap<>();
		
		Course c1 = new Course(101,"CS50");
		Course c2 = new Course(102,"M3");
		Course c3 = new Course(103,"DBMS");
		
		stLs.put(new Student(1942,"Jake",80.0f), c3);
		stLs.put(new Student(2312,"Usha",89.0f), c2);
		stLs.put(new Student(4332,"Sonali",86.0f), c1);
		
		System.out.println("List of student (Marks in descending order) =");
		sortByKey(stLs);
		
		listByCourse(stLs);
		
	}

	

}
