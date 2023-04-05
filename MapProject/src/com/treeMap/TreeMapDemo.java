package com.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tmap = new TreeMap<>();
		
		tmap.put(2, "Java");
		tmap.put(1, "HTML");
		tmap.put(3,"C++");
		
		for(Map.Entry<Integer, String> en: tmap.entrySet())
		{
			System.out.println(en.getKey()+"  : "+en.getValue());
		}
		
	}

}
