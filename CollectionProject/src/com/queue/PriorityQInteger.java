package com.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class DescendingOrderComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		return i2-i1;
	}
	
}
public class PriorityQInteger {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> num = new PriorityQueue<>(new DescendingOrderComparator());
		num.add(10);
		num.add(34);
		num.add(20);
		num.add(100);
		System.out.println(num);
	}

}
