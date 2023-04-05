package com.treeSet;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	//homework	
		TreeSet<String> colours = new TreeSet<>();
		
		// boolean add
		colours.add("red");
		colours.add("magenta");
	    colours.add("black");
	    colours.add("brown");
	    // boolean addAll
	    TreeSet<String> colours2 = new TreeSet<>();
	    colours2.add("orange");
		colours2.add("yellow");
	    colours2.add("black");
	    
	    colours.addAll(colours2);
	    
	    //iterator - returns cursor
	    System.out.println("colours = ");
	    Iterator<String> itr = colours.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    //iterator descending iterator - returns cursor
	    System.out.println("Desc order colours = ");
	    Iterator<String> desc = colours.descendingIterator();
	    while(desc.hasNext()) {
	    	System.out.println(desc.next());
	    }
	    //navigable set descending set
	    System.out.println("Naviable set desc set = ");
	    NavigableSet<String> nav = colours.descendingSet();
	    System.out.println(nav);
	    System.out.println(colours);
	    
	    System.out.println("Size = "+colours.size());
	    System.out.println("isEmpty = "+colours.isEmpty());
	    System.out.println("Does contains brown = "+colours.contains("brown"));
	    
	    //remove
	    System.out.println("Remove red= "+colours.remove("red"));
	    System.out.println("after deletion = "+colours);
	  
	    //clear
	    colours2.clear();
	    System.out.println("Clear colours 2 = "+colours2);
	   //subset, clone, tree
	  
	    //subset - with navigable
//	    NavigableSet<String> subColours = subSet(colours,"black","yellow");
	    
	    //subset with sorted set
	    
	    //headset - sortedset
	    //headset - sortedset
	    
	    //tailset - sorted
	    //tailset - navigable
	    
	    //navigable api
	    //lower - greatest element obj <  given
	    //floor 
	    //ceiling
	    //higher - least element
	    //pollFirst -retrive and remove else null
	    //pollLast - retrive and remove else null
	    
	    //first, last
	    
	    //comparator type ref
	}

}
