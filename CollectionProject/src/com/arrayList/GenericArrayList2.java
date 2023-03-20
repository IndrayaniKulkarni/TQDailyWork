package com.arrayList;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> language = new ArrayList<>();
		
		language.add("Java");
		language.add("Python");
		language.add("COBOL");
		language.add("LISP");
		language.add("C#");
		language.add("Java");
		
		for(String l: language) {
			System.out.println(l);
		}
		//find element
		System.out.println("\nDoes 'Java' present in list = "+language.contains("Java"));
		
		// find java replace with core java
		for(int i=0; i<language.size(); i++) {
			if(language.get(i).equals("Java")) {
				language.set(i, "Core Java");
			}
		}
		System.out.println(language);
	}

}
