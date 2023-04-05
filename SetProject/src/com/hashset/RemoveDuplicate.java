package com.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
	ArrayList<String> a1 = new ArrayList<>();
		
		a1.add("Java");
		a1.add("Python");
		a1.add("COBOL");

		a1.add("Java");
		a1.add("Python");
		a1.add("COBOL");
		
		a1.add("HTML");
		a1.add("Haskell");
		System.out.println(a1);
		
		HashSet<String> hs1 = new HashSet<>(a1);
		System.out.println(hs1);
	}

}
