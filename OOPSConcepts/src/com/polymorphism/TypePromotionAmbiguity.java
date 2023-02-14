package com.polymorphism;

// conversion to next big immediate type

public class TypePromotionAmbiguity {

//	static void display(int a) {
//		System.out.println((a));
//	}

//	static void display(float a) {
//		System.out.println((a));
//	}
//	static void display(double a) {
//		System.out.println((a));
//	}
	
	// to demonstrate ambiguity
	static void display(int a,double d) {
		System.out.println("method 1:");
		System.out.println(a+d);
	}
	static void display(long a,float d) {
		System.out.println("method 2:");
		System.out.println(a+d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		display(10,7.8f));
		//here there are 2 posibilities in which 
		//type casting can be done
		//1st, float cane be converted to double 
		//and the first function can be called
		//or 2nd int can be converted to long 
		//so the second function can be called
		//Here it's unable to decide which one 
		//to select
		// Hence, this is type promotion ambiguity
	}

}
