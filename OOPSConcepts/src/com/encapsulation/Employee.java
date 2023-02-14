package com.encapsulation;

public class Employee {
	// data members
	private int empId;
	private String name;
	private float experi;
	private String dept;
	private double salary;

	// getters and setters
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setExperi(float experi) {
		this.experi = experi;
	}

	public float getExperi() {
		return experi;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
