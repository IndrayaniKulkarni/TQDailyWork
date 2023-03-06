package com.stringlogical;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // equals compares value
		// == compare references
		String s1 = "Java";
		String s2 = new String("Java");

		System.out.println("== :" + (s1 == s2));
		System.out.println("equals :" + (s1.equals(s2)));

		String s3 = "Java";

		System.out.println("== :" + (s1 == s3));
		System.out.println("equals :" + (s1.equals(s3)));

//		String s3 = "Java";

		System.out.println("== :" + (s2 == s3));
		System.out.println("equals :" + (s2.equals(s3)));
	}

}
