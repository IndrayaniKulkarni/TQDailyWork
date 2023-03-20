package com.exceptiondemo;

public class FirstExceptionDemo {

	public static void main(String[] args) {
		
		int x = 10;
		int y=10;
		try {
			// where exception can occur
		int sum = (x+y) / (x-y);
		System.out.println(sum);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Exception :"+e);
//			System.out.println("Java");
		}
		System.out.println("Java");
	}

}
