package com.logicalQHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LetterHashMap {

	public static void logOccuranceOfLetters(ArrayList<String> l) {
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String s: l) {
			if(!map.containsKey(s)) {
				map.put(s, 1);
			}
			else {
				map.put(s, map.get(s)+1);
			}
		}
	System.out.println("Occurance");
	for(Map.Entry<String, Integer> e: map.entrySet()) {
		System.out.println(e.getKey()+" : "+e.getValue());
	}
	}
	
	public static void main(String[] args) {
		
		
		ArrayList<String> letters = new ArrayList<>();
		letters.add("A");
		letters.add("B");
		letters.add("C");
		letters.add("A");
		letters.add("A");
		letters.add("B");
		
		logOccuranceOfLetters(letters);
	}

}
