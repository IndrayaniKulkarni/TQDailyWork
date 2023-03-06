package com.stringlogical;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = "Java is fun";
		// length
		System.out.println("Length = " + s1.length());
		
		// charAt
		System.out.println(s1.charAt(2));
		
		// last char
		System.out.println(s1.charAt(s1.length() - 1));
		
		// substring i, n-1
		System.out.println(s1.substring(1, 4));
		
		// contains
		System.out.println(s1.contains("fun"));
		
		// equals
		String s2 = "Java";
		String s3 = "java";
		System.out.println("compare");
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		
		//case conversion
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
	
		//index of
		System.out.println(s1.indexOf("is"));
		System.out.println(s1.lastIndexOf('s'));
		
		//is empty
		System.out.println(s1.isEmpty());
		
		//replace
		String name = "Jo";
		System.out.println(name.replace('o', 'k'));
		
		// trim
		String s4 = " this is sentence with spaces ";
		System.out.println(s4);
		System.out.println(s4.trim());
	}
}
