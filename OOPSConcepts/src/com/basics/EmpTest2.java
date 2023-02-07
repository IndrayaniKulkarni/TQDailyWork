package com.basics;

import java.util.Scanner;

public class EmpTest2 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		Employee e = new Employee();
		System.out.println("\nEmployee details");
		System.out.println("\nId=");
		int id = sc.nextInt();
		System.out.println("\nName=");
		String n = sc.next();
		System.out.println("\nDept=");
		String dept = sc.next();
		System.out.println("\nSalary=");
		double sal = sc.nextDouble();
		System.out.println("\nExperience=");
		float yr = sc.nextFloat();
		e.acceptDetails(id, n,  dept,sal, yr);
        e.display();
       
        System.out.println("\nWith Increment :"+e.bonus());
        
        sc.close();
	}

}
