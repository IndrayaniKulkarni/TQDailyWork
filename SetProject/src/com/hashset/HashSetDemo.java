package com.hashset;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//
		HashSet<String> hs = new HashSet<>();
		hs.add("Java");
		hs.add("Python");
		
		HashSet<String> hs2 = new HashSet<>();
		hs2.add("C#");
		hs2.add("Haskwell");
		hs2.add("Python");
		
		//union
//		hs.addAll(hs2);
//		System.out.println(hs);
		
		//Intersection
//		hs.retainAll(hs2);
//		System.out.println(hs);
		
		//Difference
		//elements from a but not in b
		hs.remove(hs2);
		System.out.println(hs);
	}

}
