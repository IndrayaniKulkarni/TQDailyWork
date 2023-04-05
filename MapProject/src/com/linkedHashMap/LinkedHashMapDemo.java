package com.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
	
		
		LinkedHashMap<String,Double> lmap = new LinkedHashMap<>(16,0.75f,true);
		
		lmap.put("Rupa",90.4);
		lmap.put("Dan",89.0);
		lmap.put("Uday",78.5);
		lmap.put("Vivek", 85.4);
		
		for(Map.Entry<String,Double> en : lmap.entrySet()) {
			System.out.println(en.getKey()+ " "+ en.getValue());
		}
		System.out.println("Access = ");
		System.out.println("Marks of Dan = "+lmap.get("Dan"));
		
System.out.println("After access = ");
		for(Map.Entry<String,Double> en : lmap.entrySet()) {
			System.out.println(en.getKey()+ " "+ en.getValue());
		}
	}

}
