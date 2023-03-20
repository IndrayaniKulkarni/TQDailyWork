package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args) {

		List<String> l2 = new ArrayList<>();

		l2.add("Java");
		l2.add("VBNet");
		l2.add("FORTRAN");
		l2.add("HTML");
		l2.add("LISP");
		l2.add("Python");
		
		// toString
		System.out.println("toString - ");
		System.out.println(l2);
		System.out.println("-------------------------------");
		
		// for loop
		System.out.println("Iteration for loop - ");
		for (int i = 0; i < l2.size(); i++) {
			System.out.print(l2.get(i) + " ");
		}
		System.out.println("\n-------------------------------");
		
		// Enhanced for
		System.out.println("Enhanced for loop - ");
		for (String s : l2) {
			System.out.print(s + " ");
		}
		System.out.println("\n-------------------------------");
	
		// Using Iterator
		System.out.println("Iterator - ");
		Iterator<String> itr = l2.iterator();
		
		// firstly, cursor position is set to before first element i.e-1
		// hasNext,
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("-------------------------------");
		
		// list iterator (work forward and backwards)
		System.out.println("ListIterator list forward traversing - ");
		ListIterator<String> litr = l2.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("-------------------------------");
		System.out.println("ListIterator reverse list with backword traversing - ");
		ListIterator<String> litr2 = l2.listIterator(l2.size());
		while(litr2.hasPrevious()) {
			System.out.println(litr2.previous());
		}
		

	}

}
