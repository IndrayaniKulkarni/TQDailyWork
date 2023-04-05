package com.hashset;

import java.util.HashSet;

public class EmpHashSet {

	public static void main(String[] args) {
	
		HashSet<Employee> hs = new HashSet<>();
		
		hs.add(new Employee(121,"Sam",34234));
		hs.add(new Employee(232,"Eric",324221));
		
		for(Employee e:hs) {
			System.out.println(e);
		}
		
//		Given Question remove duplicate elements
	}

}
