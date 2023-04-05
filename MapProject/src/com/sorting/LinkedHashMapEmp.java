package com.sorting;

import java.util.HashMap;

public class LinkedHashMapEmp {

	public static void sortByKey(HashMap<Employee,Department> emp) {
		
	}
	public static void main(String[] args) {
		
		HashMap<Employee,Department> emp = new HashMap<>();
		
		Department d1 = new Department(101,"Sales");
		Department d2 = new Department(102,"Production");
		
		emp.put(new Employee(101,"Tapesh",42343.0f), d2);
		emp.put(new Employee(104,"Remy",42343.0f), d1);
		emp.put(new Employee(102,"John",42343.0f), d1);
		emp.put(new Employee(103,"Amy",42343.0f), d2);
		emp.put(new Employee(105,"Saee",42343.0f), d2);
		
		sortByKey(emp);
		
	}

}
