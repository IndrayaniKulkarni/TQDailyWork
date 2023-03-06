package com.empDept;

public class Employee {

	private int eid;
	private String name;
	private float salary;
	private Department dept;
	
	Employee(){
		
	}
	Employee(int eid, String name, float salary, Department dept){
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return ("Employee = "+eid+", "+name+", "+salary+", "+dept);
	}
}
