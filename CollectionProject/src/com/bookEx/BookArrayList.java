package com.bookEx;


import java.util.ArrayList;
import java.util.Collections;

public class BookArrayList {

	public static void main(String[] args) {

       ArrayList<BookCopy> blist= new ArrayList<>();
       blist.add(new BookCopy(101,"Hamlet",780f));
       blist.add(new BookCopy(107,"Ramayan",800f));
       blist.add(new BookCopy(107,"Geeta",760f));
       blist.add(new BookCopy(108,"HarryPotter",1050f));
       blist.add(new BookCopy(105,"The Secret",960f));
       
       for(BookCopy b:blist)
       {
    	   System.out.println(b);
       }
       
       Collections.sort(blist);
       
       System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
       
       for(BookCopy b:blist)
       {
    	   System.out.println(b);
       }

	}

}
