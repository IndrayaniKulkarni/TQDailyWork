package com.hashMapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Q.7 Write a logic to convert arraylist to hashmap as [A,B,C,A,B,A]
 * {(A,3),(B,2),(C,1)}
 */
public class ArrayListToHashMap {
	public static void freqChart(ArrayList<String> letters) {
		HashMap<String,Integer> freq = new HashMap<>();
		
		for(String s:letters) {
			if(freq.containsKey(s)) {
				freq.put(s, freq.get(s)+1);
			}
			else {
				freq.put(s, 1);
			}
		}
		
		System.out.println("Hash map freq = ");
		for(Map.Entry<String, Integer> en:freq.entrySet()) {
			System.out.println(en.getKey()+" : "+en.getValue());
		}
	}
	public static void main(String[] args) {
		
		ArrayList<String> letters = new ArrayList<>();
		letters.add("A");
		letters.add("B");
		letters.add("C");
		letters.add("B");
		letters.add("A");
		
		System.out.println("Given = "+letters);
		freqChart(letters);
	}

}
