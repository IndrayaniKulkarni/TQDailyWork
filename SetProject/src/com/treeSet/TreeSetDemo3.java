package com.treeSet;

import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(100);
		ts.add(45);
		ts.add(60);
		ts.add(56);

		System.out.println("---------------");
		System.out.println(ts);
		// lower
		System.out.println("Lowest(60) = " + ts.lower(60));

		// higher
		System.out.println("higher(80) = " + ts.higher(80));

		// headset
		System.out.println("headset(80) = " + ts.headSet(80));

		// headset with include element
		System.out.println("headset(60,true) = " + ts.headSet(60, true));

		// tailset
		System.out.println("tailset(80) = " + ts.tailSet(80));

		// tailset with include element
		System.out.println("tailset(60,true) = " + ts.tailSet(60, true));

		//first
		System.out.println("first = "+ts.first());
		
		//last
		System.out.println("last = "+ts.last());
		
		//pollfirst
		System.out.println("poll first =" +ts.pollFirst());
		System.out.println(ts);
		
		//pollLast
		System.out.println("poll last =" +ts.pollLast());
		System.out.println(ts);
		
		ts.add(45);
		ts.add(100);
		//ceiling
		System.out.println("Ceiling(50) (greater than or equal tothe given element) = "+ts.ceiling(50));
		
		//floor
		System.out.println("floor(40) ( less than or equal tothe given element) = "+ts.floor(40));
		
		
		
	}

}
