package com.arrayList;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(12);
//		list1.add("java");
//		list1.add(89.5f);
//		list1.add('a');
		list1.add(13);
		list1.add(14);
		
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		for(int i=0; i<list1.size(); i++) {
			int data = (int)list1.get(i)+10; //this operation not possible with not all data type even with typecasting
			//class cast exception
			//to overcome this we use generic arraylist - homogenous array list
			list1.set(i,data); 
		}
		
		//can use enhanced for loop
		for(Integer i:list1) {
			System.out.println(i);
		}
		
	}

}
