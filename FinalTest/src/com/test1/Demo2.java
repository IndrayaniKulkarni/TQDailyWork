package com.test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
public class Demo2 {

	public static void listOfEmpDeptWise(HashSet<Employee> empLs) {
		
		HashMap<String, ArrayList<String>> deptMap = new HashMap<>();
		ArrayList<String> empNames;
		
		for(Employee e:empLs) {
			
			String d = e.getDept().getdName();
			
			if(deptMap.containsKey(d)) {
				empNames = deptMap.get(d);
				empNames.add(e.getEmpName());
			}
			else {
				empNames = new ArrayList<>();
				empNames.add(e.getEmpName());
			}
			deptMap.put(d, empNames);
		}
		
		for(Map.Entry<String, ArrayList<String>>en: deptMap.entrySet()) {
			System.out.println(en.getKey()+" : "+en.getValue());
		}
	}
	public static void main(String[] args) {
		
// hashset of emp 
// map key : deptName, val : arraList names of emp in that dept 
		Department d1 = new Department(10,"Sales");
		Department d2 = new Department(20,"Production");
		Department d3 = new Department(30,"HR");
		Employee e1  = new Employee(101,"John",40000.0f, d1);
		Employee e2  = new Employee(103,"Jane",45000.0f, d1);
		Employee e3  = new Employee(102,"Henry",60000.0f, d3);
		Employee e4  = new Employee(104,"Pradosh",50000.0f, d2);
		Employee e5  = new Employee(104,"Pradosh",50000.0f, d2);
		
		HashSet<Employee> empList = new HashSet<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		System.out.println("HashSet  = ");
		for(Employee e:empList) {
			System.out.println(e);
		}
		System.out.println("------------------------------------------------");
		System.out.println("List of department and employees = ");
		listOfEmpDeptWise(empList);
		
	}

}
class Department{
	private int did;
	private String dName;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int did, String dName) {
		super();
		this.did = did;
		this.dName = dName;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dName=" + dName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dName, did);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(dName, other.dName) && did == other.did;
	}
	
}
class Employee{
	private int empId;
	private String empName;
	private float salary;
	private Department dept;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, float salary, Department dept) {
		super();
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
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", dept=" + dept + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId, empName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName);
	}
	
	
}