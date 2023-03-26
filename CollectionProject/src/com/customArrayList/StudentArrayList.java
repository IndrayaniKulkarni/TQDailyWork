package com.customArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> st = new ArrayList<>();
		
		st.add(new Student(1,"Sam",89.0f));
		st.add(new Student(2,"Lisa",95.0f));
		st.add(new Student(3,"Bart",67.0f));
		st.add(new Student(4,"Marge",89.0f));
		
		
		Iterator<Student> itr = st.iterator();// returns object type iterator
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//want to sort
		
//		Collections.sort(st); // not allowing 
		//cause - sort method extend comparable
		//but our custom class don't have comparable
		
	}

}
