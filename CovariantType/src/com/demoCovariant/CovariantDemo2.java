package com.demoCovariant;

class Employee{
	float salary;
	Employee incrSalary() {
		salary = salary + 5000;
		return this;
	}
}
class Manager extends Employee{
	
	Manager incrSalary() {
		salary = salary + 5000;
		return this;
	}
	void perks() {
		salary = salary + 2000;
	}
}
public class CovariantDemo2 {

	public static void main(String[] args) {
	
		Manager m1 = new Manager();
		m1.salary = 9000;
		System.out.println(m1.incrSalary());
         m1 = m1.incrSalary();
         // cause its return type is Employee - higher position class in hierarchy
         // in order to this work we need to downcast
         
	}

}
