package com.encapsulation;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		
		System.out.println("Employee ID:");
		e1.setEmpId(sc.nextInt());
		System.out.println("Name of employee :");
		e1.setName(sc.next());
		System.out.println("Department :");
		e1.setDept(sc.next());
		System.out.println("Experience (in years):");
		e1.setExperi(sc.nextFloat());
		System.out.println("Salary :");
		e1.setSalary(sc.nextDouble());
		
		System.out.println("Employee ID:");
		System.out.println(e1.getEmpId());
		System.out.println("Name of employee :");
		System.out.println(e1.getName());
		System.out.println("Department :");
		System.out.println(e1.getDept());
		System.out.println("Experience (in years):");
		System.out.println(e1.getExperi());
		System.out.println("Salary :");
		System.out.println(e1.getSalary());
		sc.close();
		
	}

}
