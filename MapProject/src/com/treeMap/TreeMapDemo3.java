package com.treeMap;

import java.util.TreeMap;

public class TreeMapDemo3 {
//incomplete 03/04
	public static void main(String[] args) {

		TreeMap<Integer, String> tmap = new TreeMap<>();

		tmap.put(2, "Java");
		tmap.put(1, "HTML");
		tmap.put(3, "C++");

		
		System.out.println("First key = " + tmap.firstKey());
		System.out.println("Second key = " + tmap.lastKey());

		
//		System.out.println(s1);

	}

}
