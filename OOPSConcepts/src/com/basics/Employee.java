package com.basics;

public class Employee {

	int empId;
	String name;
	String dept;
	double salary;
	float exper;
	
	void acceptDetails(int id, String n, String d, double s, float ex)
	{
		empId = id;
		name = n;
		dept = d;
		salary = s;
		exper =ex;
	}
	double bonus()
	{
		return(salary+(salary*0.2));
	}
	void display()
	{
		System.out.println("EmpId :"+empId);
		System.out.println("Name :"+name);
		System.out.println("Dept :"+dept);
		System.out.println("Salary :"+salary);
		System.out.println("Experience :"+exper);
	}
	

}
