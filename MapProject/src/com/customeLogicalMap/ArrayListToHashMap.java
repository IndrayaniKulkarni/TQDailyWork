package com.customeLogicalMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListToHashMap {

	public static void countMap(ArrayList<Employee> e) {
		HashMap<Department, Integer> dmap = new HashMap<>();
		
		for(Employee emp: e) {
			if(dmap.containsKey(emp.getDept())) {
				dmap.put(emp.getDept(), dmap.get(emp.getDept())+1);
			}
			else {
				dmap.put(emp.getDept(), 1);
			}
			
			
		}
		
		for(Map.Entry<Department,Integer> en : dmap.entrySet()) {
			System.out.println(en.getKey().getName()+": "+en.getValue() );
		}
	}
	public static void listOfEmpDept(ArrayList<Employee> emp) {
		HashMap<Department, ArrayList<String>> empDept = new HashMap<>();
		ArrayList<String> eName;
		
		for(Employee e: emp) {
			if(empDept.containsKey(e.getDept())) {
				eName = empDept.get(e.getDept()) ;
//				eName.add(e.getName());
//				empDept.put(e.getDept(), eName);
			}
			else {
//				eName = empDept.get(e.getDept()) ;
				eName = new ArrayList<>();
			}
			eName.add(e.getName());
			empDept.put(e.getDept(),eName);
		}
		for(Map.Entry<Department,ArrayList<String>> en : empDept.entrySet()) {
			System.out.println(en.getKey().getName()+": "+en.getValue() );
		}
	}
	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<>();
		
		Department d1 =  new Department(10,"Sales");
		Department d2 =  new Department(20,"HR");
		Department d3 =  new Department(30,"Tech");
		
		
		emp.add(new Employee(101,"Milind",50000f,d1));
		emp.add(new Employee(102,"Mark",70000f,d2));
		emp.add(new Employee(103,"Shradha",60000f,d1));
		emp.add(new Employee(104,"Krutika",40000f,d3));
		emp.add(new Employee(105,"Snheal",60000f,d2));
		emp.add(new Employee(106,"Sahili",70000f,d1));
		emp.add(new Employee(107,"Sonali",60000f,d3));
		emp.add(new Employee(108,"Usha",50000f,d2));
		
		countMap(emp);
	
		listOfEmpDept(emp);
	
	}

}
