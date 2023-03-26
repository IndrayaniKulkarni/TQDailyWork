package com.practice16Mar;
class Department{
	
	private int deptId;
	private String deptName;
	
	Department(){
		
	}
	Department(int deptId, String deptName){
		this.deptId = deptId;
		this.deptName = deptName;
	}
}
class Employee{
	
	private int empId;
	private String empName;
	private float salary;
	private Department dept;
	
	Employee(){
		
	}
	Employee(int empId, String empName, float salary, Department dept){
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.dept = dept;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}

public class EmployeeDeptTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
