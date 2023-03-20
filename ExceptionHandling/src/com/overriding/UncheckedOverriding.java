package com.overriding;

public class UncheckedOverriding {
class Parent{
	int data =50;
	void print() {
		System.out.println(data);
	}
}
class Child extends Parent{
	
	void print() throws ArithmeticException{
		System.out.println(data/0);
		throw new ArithmeticException("by zero");
	}
}
	public static void main(String[] args) {
		
//		Child c = new Child();
//		c.print();
	}

}
