package com.logicalQHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OccurenceOfLetters {

	public static void createMap(ArrayList<String> al) {
		HashMap<String,Integer> map = new HashMap<>();
		
		for(String s:al) {
			if(!map.containsKey(s)) {
				map.put(s,1);
			}
			else {
				map.put(s, map.get(s)+1);
			}
		}
		
		for(Map.Entry<String, Integer> en : map.entrySet()) {
			System.out.println(en.getKey()+" : "+en.getValue());
		}
	}
	public static void main(String[] args) {
	
		
		ArrayList<String> ls = new ArrayList<>();
		
		ls.add("A");
		ls.add("B");
		ls.add("C");
		ls.add("A");
		ls.add("A");
		ls.add("B");
		createMap(ls);
	}

}
