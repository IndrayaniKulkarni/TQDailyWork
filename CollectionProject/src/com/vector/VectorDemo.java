package com.vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<String> colours = new Vector<>();

		System.out.println("Size =" + colours.size());

		System.out.println("Capacity =" + colours.capacity());

		colours.add("blue");
		colours.add("green");
		colours.add("red");
		colours.add("brown");
		colours.add("white");

		colours.add("beige");
		colours.add("purple");
		colours.addElement("violet");
		// this is legacy method - something which was used before, but no more in use
		
		colours.add("white");
		colours.add("brown");
		System.out.println("Size =" + colours.size());

		System.out.println("Capacity =" + colours.capacity());

		colours.add("white");
		colours.add("brown");

		colours.add("white");
//		colours.ensureCapacity(20); //maintain min this much capacity
		
		System.out.println("Size =" + colours.size());

		System.out.println("Capacity =" + colours.capacity());

		System.out.println("Value at 4th index"+colours.get(4));
	
	    //legacy method elementAt
		System.out.println("Value at 4th index with elementAt"+colours.elementAt(4));
	
		//return string
		System.out.println(colours.set(4, "grey"));
		System.out.println("After colours.set(4, \"grey\") "+colours);
		
		//return void
		colours.setElementAt("magenta", 0);
//		System.out.println(colours.setElementAt("magenta", 0));
		System.out.println("After colours.setElementAt(\"magenta\", 0) ="+colours);
		
	//remove
		System.out.println(colours.remove("purple"));
		System.out.println(colours.removeElement("grey"));
	
		
		
	}

}
