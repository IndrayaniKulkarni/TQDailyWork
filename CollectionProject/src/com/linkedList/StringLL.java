package com.linkedList;

import java.util.LinkedList;

public class StringLL {

	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<>();
		
		//If list is empty - cases 
		
		// Case 1 : Exception
//		System.out.println("get() = "+l.get(0)); // java.lang.IndexOutOfBoundsException
//		System.out.println("remove() = "+l.remove()); //java.util.NoSuchElementException
		
		//Case 2 : NULL
		System.out.println("l.poll() (l is empty) ="+l.poll());
		System.out.println("l.peek() (l is empty) = "+l.peek());
		
		
		//Insertion
		
		// insertion at head
		l.addFirst("C++");
		System.out.println("After l.addFirst(\"C++\"); = "+l);
		l.offerFirst("Java");
		System.out.println("After l.offerFirst(\"Java\"); = "+l);
		
		// insertion in middle
		l.add(1,"Python");
		System.out.println("Afterl.add(1,\"Python\"); = "+l);
		
		//insertion at last
		l.add("COBOL");
		System.out.println("After l.add(\"COBOL\"); = "+l);
		l.offer("FORTAN");
		System.out.println("After l.offer(\"FORTAN\"); = "+l);
		l.addLast("Ruby");
		System.out.println("After l.addLast(\"Ruby\"); = "+l);
		l.offerLast("LISP");
		System.out.println("After l.offerLast(\"LISP\"); = "+l);
		l.add("Go");
		l.add("JavaScript");
		l.add("Haskell");
		l.add("C#");
		l.add("swift");
	 //Deletion
		
		//head 
		l.remove();
		System.out.println("After l.remove(); = "+l);
		System.out.println("After l.poll(); = "+l.poll());
		System.out.println(l);
		System.out.println("After l.pollFirst(); = "+l.pollFirst());
		System.out.println(l);
		System.out.println("After l.removeFirst() = "+l.removeFirst());
	    
		//mid
		System.out.println("Remove ele at 3rd index");
			
	   System.out.println(l.remove(3));
	   System.out.println(l);
	   System.out.println("Remove FORTAN");
	   System.out.println(l.remove("FORTAN"));
	   System.out.println(l);
	
	   //last
	   System.out.println("l.pollLast = "+l.pollLast());
	   System.out.println("l.removeLast  = "+l.removeLast());
	
	   //retrieve
	   
	   //head
	   System.out.println("Reterive elements at first ");
		System.out.println("getFirst = "+l.getFirst());
		System.out.println("peekFirst = "+l.peekFirst());
		System.out.println("element = "+l.element());
		System.out.println("peek = "+l.peek());
		
		//mid
		System.out.println("mid or with index access ");
		System.out.println("get(2) = "+l.get(2));
		
		//last
		System.out.println("last elements");
		System.out.println("peekLast() = "+l.peekLast());
		System.out.println("getLast() = "+l.getLast());
	}

}
