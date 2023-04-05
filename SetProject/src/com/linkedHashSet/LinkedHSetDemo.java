package com.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHSetDemo {

	public static void main(String [] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("blue");
		lhs.add("green");
		lhs.add("purple");
		
		System.out.println(lhs);
		
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
