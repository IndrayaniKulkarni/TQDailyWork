package com.logicalArrayList;

import java.util.ArrayList;

public class FindUniqueElements {

	public static void calFreq(ArrayList<String> l) {
		int count = 0;
		int dcount =0;
		for(int i=0; i<l.size(); i++) {
			count = 1;
			if(l.get(i).equals("visited")) {
				continue;
			}
			for(int j=i+1; j<l.size(); j++) {
				if(l.get(i).equals(l.get(j))) {
					count++;
					l.set(j,"visited");
				}
			}
			if(count==1) {
				dcount++;
				System.out.println(l.get(i)+":"+count);
			}
		}
		System.out.println("Number of unique = "+dcount);
	}
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("B");
		list.add("C");
		list.add("B");

		calFreq(list);
		
	}

}
