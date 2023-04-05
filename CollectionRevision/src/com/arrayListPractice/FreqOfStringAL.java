package com.arrayListPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Q.2 Find the frequency of each string object in an arrayList
 */
public class FreqOfStringAL {

	public static void freqLog(ArrayList<String> names) {
		HashMap<String,Integer> log = new HashMap<>();
		
		for(String s:names) {
			if(log.containsKey(s)) {
				log.put(s, log.get(s)+1);
			}
			else {
				log.put(s, 1);
			}
		}
		for(Map.Entry<String, Integer> en: log.entrySet()) {
			System.out.println(en.getKey()+"  : "+en.getValue());
		}
	}
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Input = ");
//		String sentence = sc.nextLine();
//		List<String> words = new ArrayList<>(new String[](sentence.split(" ")));
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Sam");
		names.add("Amy");
		names.add("Pradhosh");
		names.add("Esha");
		names.add("Esha");
		names.add("Sam");
		
		freqLog(names);
//		sc.close();
	}

}
