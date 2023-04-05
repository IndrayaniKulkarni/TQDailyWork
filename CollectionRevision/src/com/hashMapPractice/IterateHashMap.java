package com.hashMapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Q.5 Write all ways to iterate through hash map
 */
public class IterateHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> book = new HashMap<>();
		
		book.put(10,"TheSandman");
		book.put(20, "Emma");
		book.put(23, "A tale of two cities");
		book.put(24, "And there were none");
		
		//Iterator 
		System.out.println("\niterator = ");
		Iterator<Map.Entry<Integer,String>> itr = book.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getKey()+" : "+itr.next().getValue());
		}
		
		//forEach
		System.out.println("\nforEach = ");
		book.forEach((key, value) ->{
			System.out.println(key+ " : "+value);
		});
		
		
		System.out.println("printing with keyset  = ");
		Set<Integer> id = book.keySet();
		for(Integer key:id){
			System.out.println(key);
		}

		System.out.println("printing with collection values = ");
		Collection<String> title = book.values();
		for(String val:title){
			System.out.println(val);
		}

		//iterator method
		
		//iterator can work on single type collection so first create set of keys and create iterator over it
		System.out.println("Iterator = ");
		Set<Integer> k = book.keySet();
		Iterator<Integer> itr2 = k.iterator();
		while(itr2.hasNext()){
			Integer key = itr2.next();
			System.out.println(key+" : "+book.get(key));
		}

		System.out.println("Map entry = ");
		for(Map.Entry<Integer,String> en: book.entrySet()){
			System.out.println(en.getKey()+"  : "+en.getValue());
		}
	}

}
