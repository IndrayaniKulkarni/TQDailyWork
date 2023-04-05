package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortValues {

	public static void keySort(HashMap<String, Double> hm) {
		ArrayList<Double> vals = new ArrayList<>(hm.values());
		
		Collections.sort(vals);
//		System.out.println(keys);
		
		LinkedHashMap<String, Double> lhm = new LinkedHashMap<>();
		
		for(Double d: vals) {
			for(Map.Entry<String,Double> en : lhm.entrySet()) {
				if(en.getValue()==d) {
					String key = en.getKey();
					if(!lhm.containsKey(key)) {
						lhm.put(key, d);
					}
				}
			}
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
		map.put("Sumitra", 80.4);
		keySort(map);
	}

}
