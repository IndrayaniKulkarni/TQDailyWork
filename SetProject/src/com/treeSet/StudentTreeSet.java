package com.treeSet;

import java.util.TreeSet;

public class StudentTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Student> registra = new TreeSet<>();
		
		registra.add(new Student(102,"Carina",90.89f));
		registra.add(new Student(104,"Sonali",91.9f));
		registra.add(new Student(105,"Sam",89.9f));registra.add(new Student(102,"Carina",90.89f));
		registra.add(new Student(102,"Carina",90.89f));
		
		System.out.println(registra);
		
		//after id comparator
		
	}

}
