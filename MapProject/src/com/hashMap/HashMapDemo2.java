package com.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> emp = new HashMap<>();
		
		emp.put(101, "Emily");
		emp.put(102, "Rudy");
		emp.put(104, "Terry");
		
		for(Map.Entry<Integer,String> e : emp.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
