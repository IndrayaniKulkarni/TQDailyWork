package com.propagation;

public class UncheckedExceptionPropagation {

	static void method1() {
		int data = 50/0;
	}
	static void method2() {
		method1();
	}
	static void method3() {
		method2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			method3();
		}
		catch(ArithmeticException e) {
			System.out.println("method3:"+e);
		}
	}

}
