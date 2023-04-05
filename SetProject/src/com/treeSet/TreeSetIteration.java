package com.treeSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetIteration {

	public static void main(String[] args) {
		
		TreeSet<Integer> nums = new TreeSet<>();
	    
		nums.add(10);
		nums.add(15);
		nums.add(20);
		nums.add(25);
		nums.add(30);
		
		System.out.println("-------");
		for(Integer i:nums) {
			System.out.print(i+ " ");
		}
		System.out.println("\n-------");
		Iterator<Integer> itr = nums.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-------");
		NavigableSet<Integer> nm = nums.descendingSet();
		for(Integer i:nm) {
			System.out.println(i);
		}
	
		//can't iterate with usual for loop, can't access using index
		
		Set synchts = Collections.synchronizedSet(nums);
		
	}

}
