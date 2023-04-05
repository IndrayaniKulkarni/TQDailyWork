package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortKey {

	public static void keySort(HashMap<String, Double> hm) {
		ArrayList<String> keys = new ArrayList<>(hm.keySet());
		
		Collections.sort(keys);
//		System.out.println(keys);
		
		LinkedHashMap<String, Double> lhm = new LinkedHashMap<>();
		
		for(String k: keys) {
			lhm.put(k, hm.get(k));
		}
		
		for(Map.Entry<String, Double> en: lhm.entrySet()) {
			System.out.println(en.getKey()+ "  : "+en.getValue());
		}
	}
	public static void main(String[] args) {
		
		HashMap<String,Double> map = new HashMap<>();
		
		map.put("Sam", 90.4);
		map.put("Joana", 89.0);
		map.put("Ty", 89.7);
		
		keySort(map);
	}

}
