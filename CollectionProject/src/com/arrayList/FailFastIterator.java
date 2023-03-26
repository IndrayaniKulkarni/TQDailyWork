package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator {

	public static void main(String[] args) {

		ArrayList<String> al1= new ArrayList<>();
		al1.add("Java");
		al1.add("Python");
		al1.add("Angular");
		al1.add("Spring");
		al1.add("Html");
		
		Iterator<String> itr= al1.iterator();
		
		while(itr.hasNext())
		{
			if(itr.next().equals("Angular"))
			{
				//al1.remove("Angular");
				// ConcurrentMofification
				itr.remove();
			}
		}
		
		System.out.println(al1);
		

	}

}
