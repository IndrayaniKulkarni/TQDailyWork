package com.empDept;

import java.util.Scanner;

public class EmpTester2 {
static Scanner sc = new Scanner(System.in);
	public static void highestSalary(Employee emp[]) {
		
	  //Employee temp = new Employee();
		
		float max = Float.MIN_VALUE;
		
		for(int i=0; i<emp.length; i++) {
			if(emp[i].getSalary()>max) {
				max = emp[i].getSalary();
			}
		}
		System.out.println("Highest salary = "+max);
	}
	
	public static void sort(Employee emp[]) {
		
		Employee temp = new Employee();
		
		for(int i=0; i<emp.length; i++) {
			for(int j=i+1; j<emp.length; j++) {
				if(emp[i].getSalary()>emp[j].getSalary()) {
					temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
			}
		}
	}
	/*public static void empDepartmemtwise(Employee e[], Department d[]) {
		int count=0;
		
		for(Department x:d) {
			System.out.println("Dept:"+x.getName());
			System.out.println("__________________");
			count=0;
			for(Employee y:e) {
				if(y.getDept().equals(x)) {
					count++;
					System.out.println(y.getName());
				}
				
			}System.out.println("__________________");
			System.out.println("Dept "+x.getName()+" number of employees = "+count);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		}
	}*/
	public static void empDepartmemtwise(Employee e[], Department d[]) {
	    int count = 0;
	    for (Department x : d) {
	        System.out.println("Dept: " + x.getName());
	        System.out.println("__________________");
	        count = 0;
	        for (Employee y : e) {
	            if (y.getDept().getName().equals(x.getName())) {
	                count++;
	                System.out.println(y.getName());
	            }
	        }
	        System.out.println("__________________");
	        System.out.println("Dept " + x.getName() + " number of employees = " + count);
	        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
	    }
	}

	public static void print(Employee e[]) {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		for(Employee x:e) {
			System.out.println(x);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	public static void input(Employee e) {
		System.out.println("Emp id =");
		e.setEid(sc.nextInt());
		System.out.println("Emp name =");
		e.setName(sc.next());
		System.out.println("Salary = ");
		e.setSalary(sc.nextFloat());
		System.out.println();
		e.setDept(new Department());
		System.out.println("Department Id =");
		e.getDept().setId(sc.nextInt());
		System.out.println("Department name =");
		e.getDept().setName(sc.next());
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println();
	}
	public static void inputDept(Department d) {
	
		System.out.println("Department Id =");
	    d.setId(sc.nextInt());
		System.out.println("Department name =");
		d.setName(sc.next());
		System.out.println("----------------------------------------");
	}
	public static void main(String[] args) {
	
	
		System.out.println("No. of departments  = ");
		int ndept = sc.nextInt();
		
		Department d[] = new Department[ndept];
		
		for(int i=0; i<ndept; i++) {
			d[i] = new Department();
			inputDept(d[i]);
		}
		
		System.out.println("No. of employees  = ");
		int n = sc.nextInt();
		
		Employee e[] = new Employee[n];
		
		for(int i=0; i<n; i++) {
			e[i] = new Employee();
			input(e[i]);
		}
		
		System.out.println("Details entered = ");
		
		print(e);
		
		System.out.println("");
		
		
//		highestSalary(e);
//		sort(e);
		print(e);
		empDepartmemtwise(e,d);
	}

}
