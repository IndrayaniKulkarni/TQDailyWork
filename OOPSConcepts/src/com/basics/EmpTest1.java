package com.basics;

public class EmpTest1 {

	public static void main(String[] args) {

		Employee e = new Employee();

		e.acceptDetails(120, "Sam", "HR", 1400000.0, 2.1f);
		e.display();
		System.out.println("\nWith Increment :" + e.bonus());
	}

}
