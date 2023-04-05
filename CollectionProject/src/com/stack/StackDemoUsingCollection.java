package com.stack;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemoUsingCollection{

	public static void main(String[] args) {
		
		Stack<String> fruits = new Stack<>();
		fruits.push("Apple");
		fruits.push("Mango");
		fruits.push("Banana");
		fruits.push("Berries");
		
		System.out.println("Current stack = "+fruits);
		
		System.out.println("Last element without removing = "+fruits.peek());
		
		System.out.println("Before pop = "+fruits);
		System.out.println("Value been poped = "+fruits.pop());
		System.out.println("After pop = "+fruits);
		
		System.out.println("Return index of \"mango\" = "+fruits.search("Mango"));
     
		System.out.println("List of elements  (enumeration) = ");
	     Enumeration<String> en = fruits.elements();
	     while(en.hasMoreElements()) {
	    	 System.out.print(en.nextElement()+" ");
	     }
	
	}

}
