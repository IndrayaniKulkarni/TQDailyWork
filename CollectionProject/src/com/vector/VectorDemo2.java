package com.vector;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {

		Vector<String> name = new Vector<>();

		// size
		System.out.println("Size = " + name.size());
		// capacity
		System.out.println("Capacity =" + name.capacity());

		// if we want to create vector with some capacity itself
		Vector<String> v = new Vector<>(20);
		// size
		System.out.println("Size = " + v.size());
		// capacity
		System.out.println("Capacity =" + v.capacity());
        v.add("Bunsen");
        v.add("Bily");
        // want to specify minimal capacity
		v.ensureCapacity(30);
		// size
		System.out.println("Size = " + v.size());
		// capacity
		System.out.println("Capacity =" + v.capacity());

		//way to add values to vector
		//1.
		name.add("John");
		//2.
		name.addElement("Mycroft"); //legacy method
		//3.
		name.addAll(v);
		//4.
//		name.addAll(5, v);
		
		name.add("Emma");
		name.add("Bob");
		
		System.out.println(name);
		
	   //Iterating vector
		//Iterator
		Iterator<String> itr = name.iterator();
		System.out.println("\nWith iterator (forward)= ");
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		ListIterator<String> itr2 = name.listIterator();
		System.out.println("\nWith ListIterator (forward)= ");
		while(itr2.hasNext()) {
			System.out.print(itr2.next()+" ");
		}
		
		ListIterator<String> itr3 = name.listIterator(name.size());
		System.out.println("\nWith ListIterator (Backward)= ");
		while(itr3.hasPrevious()) {
			System.out.print(itr3.previous()+" ");
		}
	}

}
