package com.methodOveridding;

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
public class OverridingExample {

	public static void main(String args[]) {
		Person p1 = new Person();
		p1.display();
		
		Employee e1 = new Employee();
		e1.display();
		
		Celebrity c1 = new Celebrity();
		c1.display();
	}
}
