package com.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionToArrayConversion {

	public static void main(String[] args) {
	
		
		String colours[] = {"Red","Blue","Black","Green"};
		System.out.println(colours);
		
		//1. array to List
		List<String> s1 = Arrays.asList(colours);
		System.out.println(s1);
		
		//2. array to arrayList
		ArrayList<String> s2 = new ArrayList<>(Arrays.asList(colours));
		System.out.println(s2);
		
		//3. (faster)
		ArrayList<String> al3 = new ArrayList<>();
		Collections.addAll(al3,colours);
		System.out.println(al3);
		
		//ArrayList to Array
		//with and without type safe
		
		//without type safe
		Object[] col = s2.toArray();
		System.out.println(Arrays.toString(col));
		//need explicit type conversion
		for(int i=0; i<col.length; i++) {
			col[i] =((String)col[i]).concat(" colour");
		}
		System.out.println(Arrays.toString(col));
		
		//with type safe
		String[] cols = new String[s2.size()];
		s2.toArray(cols);
		//no need of explicit type conversion
		for(int i =0; i<cols.length; i++) {
			cols[i] = cols[i].concat(" name");
		}
		System.out.println(Arrays.toString(cols));
	}

}
