package com.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class IteratingHashMap {

	public static void main(String[] args) {
		
		
		HashMap<String,Double> student = new HashMap<>();
		
		student.put("Sam", 89.9);
		student.put("sahili", 90.0);
		student.put("snehal",93.0);
		
		//toString
		System.out.println(student);
		
		//to print keys -with set and enhanced for loop
		
		Set<String> keySet = student.keySet();
		for(String s:keySet) {
			System.out.println(s);
		}
		
		
		//to print values - with collection 
		Collection<Double> marks = student.values();
		for(Double d:marks) {
			System.out.println(marks);
		}
		
		//Iterator
//		Iterator<String,Double> itr = student.entrySet();
		
		
		//with obj
		//map.entry
		
	}

}
