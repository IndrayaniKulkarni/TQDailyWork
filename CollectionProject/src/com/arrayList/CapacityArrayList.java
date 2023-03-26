package com.arrayList;

import java.util.ArrayList;

public class CapacityArrayList {

	public static void main(String[] args) {
		
		//arrayList with capacity20
		ArrayList<Integer> ls1 = new ArrayList<>(20);
	 
		
		//or add capacity after list creation
		ArrayList<Integer> ls2 = new ArrayList<>();
		ls2.ensureCapacity(20);
		
		ls2.add(100);
		ls2.add(123);
		
		System.out.println("Capacity ="+ls2.size());
		//avoid memory wastage
		
		ls2.trimToSize();
		System.out.println("Capactiy after trim = "+ls2.size());
	
	}

}
