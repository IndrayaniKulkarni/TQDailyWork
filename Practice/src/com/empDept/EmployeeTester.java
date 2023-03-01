/**
 * sysoutSeries 
		0,3,8,15..till n

		1*1 - 1 =0
		2*2 - 1 =3
		3*3 - 1 =8

		Employee has a department 
		getter-setters
		Employee = id, name, salary, dept
		department = id, dept
 */
package com.empDept;
import java.util.Scanner;
public class EmployeeTester {

	static Scanner sc = new Scanner(System.in);
	public static void input(Employee e) {
		
		System.out.println("\n Kindly enter the details..");
		System.out.println("Emp id = ");
		e.setId(sc.nextInt());
		System.out.println("Name = ");
		e.setName(sc.next());
		System.out.println("Salary = ");
		e.setSalary(sc.nextDouble());
		System.out.println("Department details..");
		
		Department d = new Department();
		System.out.println("Dept Id = ");
        d.setDeptId(sc.nextInt());
        System.out.println("Dept Name = ");
        d.setDeptName(sc.next());
        
        e.setDept(d);
	}
	public static void main(String[] args) {
	
		System.out.println("Please enter number of employee details to be entered = ");
		
	    int n = sc.nextInt();
	    
	    for(int i =0; i<n; i++) {
	    	Employee e = new Employee();
	    	input(e);
	    	System.out.println(e);
	    	System.out.println("__________________________________");
	    }
		


	}

}
