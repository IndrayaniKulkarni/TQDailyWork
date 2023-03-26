package com.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> ls = new LinkedList<>();
	//return type boolean
		ls.add(100);
		ls.add(23);
		ls.add(null);
		ls.add(null);
		ls.add(100);
		
		System.out.println(ls);
	// return type void
		ls.addFirst(1);
		ls.addLast(10);
		
		System.out.println(ls);
	// offer() - boolean return type - adds elements at tail of ls (similar to add)
	ls.offer(20);
	//offerFirst - boolean return type - similar to addFirst except for its return type
	ls.offerFirst(101);
	
	//get()
	System.out.println(ls.get(3));
	
	//getFirst and Last
	// if list empty - NoSuchElementExistException
	System.out.println(ls.getFirst());
    System.out.println(ls.getLast());	
    
    //lastPeek, firstPeerk - return int
    System.out.println(ls.peekFirst());
    System.out.println(ls.peekLast());
    System.out.println(ls.peek());
    
    //remove and poll - to remove 1st ele
    System.out.println(ls.remove(2));
    //IndexOutOfBoundsException - if the index is out of range(index < 0 || index >= size())
    
    //poll - retrives and removes element 1st pos
    System.out.println(ls.poll());
    //null if this list is empty
    
    //
    
    
    
    
	}

}
