package com.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorIterator {

	public static void main(String[] args) {
		Vector<String> colours = new Vector<>();
		colours.add("blue");
		colours.add("green");
		colours.add("red");
		colours.add("brown");
		colours.add("white");

		System.out.println(colours);
		
		//for loop
		System.out.println("for loop");
		for(int i=0; i<colours.size(); i++) {
			System.out.println(colours.elementAt(i));
		}
		//enhanced for loop
		System.out.println("enhanced for loop");
		for(String s:colours) {
			System.out.println(s);
		}
		//Iterator
		System.out.println("Iterator");
		Iterator<String> it = colours.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		//ListIterator
		System.out.println("ListIterator");
		ListIterator<String> liter = colours.listIterator();
		
		while(liter.hasNext()) {
			System.out.println(liter.next());
		}
		//listIterator - backward
		ListIterator<String> pre = colours.listIterator(colours.size());
		while(pre.hasPrevious()) {
			System.out.println(pre.previous());
		}
		
		System.out.println("enumeration");
		//Enumeration 
		Enumeration<String> en = colours.elements();
	 
		//ref....
	
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
