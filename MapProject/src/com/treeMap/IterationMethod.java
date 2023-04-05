package com.treeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class IterationMethod {

	public static void main(String[] args) {
		
TreeMap<Integer, String> tmap = new TreeMap<>();
		
		tmap.put(2, "Java");
		tmap.put(1, "HTML");
		tmap.put(3,"C++");
		
		Set<Integer> keystmap = tmap.keySet();
		Iterator<Integer> itr = keystmap.iterator();
		while(itr.hasNext()) {
			int key = itr.next();
			System.out.println(key+" : "+tmap.get(key));
		}
		
		System.out.println("-----------");
		
		for(Map.Entry<Integer,String> en: tmap.entrySet()) {
			System.out.println(en.getKey()+"  : "+en.getValue());
		}
		
		System.out.println("-----------");

		Set<Entry<Integer,String>> entries = tmap.entrySet();
		for(Entry<Integer,String> e : entries) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
		System.out.println("-----------");

		NavigableMap<Integer,String> nmap = tmap.descendingMap();
		
		for(Map.Entry<Integer, String> n : nmap.entrySet()) {
			System.out.println(n.getKey()+"  : "+n.getValue());
		}
		
		//Nav descending keyset
		
	}

}
