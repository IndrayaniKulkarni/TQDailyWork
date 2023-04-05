package com.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHSetDemoStudent {

	public static void main(String [] args) {
		
		LinkedHashSet<Student> lhs = new LinkedHashSet<>();
		
		lhs.add(new Student(10,"Sam"));
		lhs.add(new Student(20,"Eric"));
		lhs.add(new Student(10,"Sam"));
		
		System.out.println(lhs);
		
		Iterator<Student> itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
