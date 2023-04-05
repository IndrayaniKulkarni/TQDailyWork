package com.arrayListPractice;

import java.util.ArrayList;

/*
 * Q.1 Create an arrayList to  remove duplicate elements.
 * 
 */
public class RemoveDuplicates {

	public static void createHashMap(ArrayList<Integer> num) {
		ArrayList<Integer> n = new ArrayList<>();
		
		for(Integer i:num) {
			if(!n.contains(i)) {
				n.add(i);
			}
		}
		num = n;
		System.out.println("After = "+num);
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(100);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(30);
		num.add(100);
		
		System.out.println("Before = "+num);
		
		createHashMap(num);
		
		
	}

}
