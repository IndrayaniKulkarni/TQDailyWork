package com.logicalQHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NumberHashMap {

	public static String convertWord(int num) {
		String word = null;
		
		switch(num) {
		case 1: word = "one"; break;
		case 2: word = "two"; break;
		case 3: word = "three"; break;
		case 4: word = "four"; break;
		case 5: word = "five"; break;
		case 6: word = "six"; break;
		case 7: word = "seven"; break;
		case 8: word = "eight"; break;
		case 9: word = "nine"; break;
		default : System.out.println("Error");
		}
		return word;
	}
	
	public static void createMap(ArrayList<Integer> list) {
		HashMap<String,Integer> map = new HashMap<>();
		
		for(Integer n: list) {
			String word = convertWord(n);
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}
			else {
				map.put(word, 1);
			}
		}
		for(Map.Entry<String,Integer> m : map.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(3);
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(1);
		al.add(3);
		
		createMap(al);
	}

}
