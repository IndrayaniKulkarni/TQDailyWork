package com.logicalArrayList;

import java.util.ArrayList;

public class ReverseArrayList {

	public static void reverseLs(ArrayList<String> arr) {
		//Iterator<String> itr = arr.iterator();
		//ListIterator<String> litr = arr.listIterator(arr.size());
		
		String temp;
		for(int i=0, j=arr.size()-1; i<arr.size()/2; i++,j--) {
			temp = arr.get(i);
			arr.set(i, arr.get(j));
			arr.set(j, temp);
		}
		System.out.println(arr);
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<>();
		
		a1.add("Java");
		a1.add("Python");
		a1.add("COBOL");
		System.out.println(a1);
		
//		Collections.reverse(a1);
		reverseLs(a1);
	}

}
