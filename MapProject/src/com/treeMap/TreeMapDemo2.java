package com.treeMap;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		
		HashMap<String,Double> map= new HashMap<>();
		map.put("Suraj", 89.5);
		map.put("Sahili", 90.0);
		map.put("Vaibhav", 78.6);
		map.put("Snehal", 92.0);
		map.put("Kishor", 78.9);
		
		TreeMap<String,Double> tmap= new TreeMap<>(map);
		
		// tmap.putAll(map);
			
		for(Map.Entry<String, Double> en:tmap.entrySet())
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
		


	}

}
