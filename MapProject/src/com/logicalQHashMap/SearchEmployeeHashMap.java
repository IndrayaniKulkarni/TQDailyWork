package com.logicalQHashMap;

import java.util.HashMap;
import java.util.Map;

public class SearchEmployeeHashMap {
//incomplete
//	public static void searchName()
	public static void main(String[] args) {
	
		
		HashMap<Employee,String> emp = new HashMap<>();
		
		emp.put(new Employee(101,"Sam",60000f),"tech");
		emp.put(new Employee(102,"Bina",60000f),"tech");
		emp.put(new Employee(101,"Sam",65000f),"sales");
		
		for(Map.Entry<Employee,String> e: emp.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
	}

}
