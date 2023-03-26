package com.logicalArrayList;

import java.util.ArrayList;

public class SortIntValues {

	public static void sortArrayLs(ArrayList<Integer> arr) {
		for(int i=0; i<arr.size(); i++) {
			for(int j=i+1; j<arr.size(); j++) {
				if(arr.get(i)>arr.get(j)) {
					int temp = arr.get(i);
					arr.set(i,arr.get(j));
					arr.set(j,temp);
				}
			}
		}
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(34);
		a1.add(13);
		a1.add(89);
		a1.add(50);
		
		System.out.println(a1);
		//built in 
//		Collections.sort(a1);
		//built in reverse
//		Collections.sort(a1,Collections.reverseOrder())
		
		sortArrayLs(a1);
		System.out.println(a1);
	}

}
