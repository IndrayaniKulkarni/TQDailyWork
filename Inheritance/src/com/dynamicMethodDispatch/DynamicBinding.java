package com.dynamicMethodDispatch;

class Person{
	void display() {
		System.out.println("I'm a person...");
	}
	
}
class Employee extends Person{
	void display() {
		System.out.println("I'm a employee...");
	}
	
}
class Celebrity extends Person{
	void display() {
		System.out.println("I'm a Celebrity...");
	}
	
}
public class DynamicBinding {

	public static void main(String args[]) {
		Person p1 = new Person();
		p1.display();
		p1 = new Employee();
		p1.display();
		
		
	}
}
