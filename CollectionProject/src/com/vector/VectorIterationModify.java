package com.vector;


import java.util.Enumeration;
import java.util.Vector;

public class VectorIterationModify {

	public static void main(String[] args) {

		Vector<String> colours= new Vector<>(9,5);
		
		colours.add("Blue");
		colours.add("Green");
		colours.addElement("Yellow"); // legacy method
		colours.add("Black");
		colours.add("Pink");
		
		Enumeration<String> en = colours.elements();
		
		while(en.hasMoreElements())
		{
			String s= en.nextElement();
			if(s.equals("Blue"))
				colours.remove("Blue");
		}
		
		
		System.out.println(colours);
		

	}

}
