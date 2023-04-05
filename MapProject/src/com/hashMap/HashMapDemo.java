package com.hashMap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		HashMap<String, Integer> students = new HashMap<>();
		
		students.put("Sam",89);
		students.put("billy", 90);
		students.put(null, 90);
		
		System.out.println(students);
	}

}
