package com.linkedHashSet;

import java.util.LinkedHashSet;

public class EmpLinkedHashSet {

	public static void main(String[] args) {
	
		LinkedHashSet<Employee> hs = new LinkedHashSet<>();
		
		hs.add(new Employee(121,"Sam",34234));
		hs.add(new Employee(232,"Eric",324221));
		
		for(Employee e:hs) {
			System.out.println(e);
		}
		//need to override equals hashcode and equals
		
//		Given Question remove duplicate elements
	}

}
