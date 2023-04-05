package com.queue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class PriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		return (int) (b1.getPrice() - b2.getPrice());
	}
	/*
	 * @Override
	public int compare(Book b1, Book b2) {
     
		if(b1.getPrice()==b2.getPrice())
			return 0;
		else
			if(b1.getPrice()<b2.getPrice())
				return 1;
			else
				return -1;
		

	}*/
	 

}

class PriceNameComparator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		if (b1.getPrice() == b2.getPrice()) {
			return b1.getTitle().compareTo(b2.getTitle());
		} else {
			if (b1.getPrice() < b2.getPrice()) {
				return 1;
			} else {
				return -1;
			}
		}
	}

}

public class PriorityQueueBook {

	public static void main(String[] args) {

//		PriorityQueue<Book> pqb = new PriorityQueue<>();
//		pqb.add(new Book(101,""))
		PriorityQueue<Book> pqb = new PriorityQueue<>(new PriceComparator());

		pqb.add(new Book(101, "Harry Potter", 764f));
		pqb.add(new Book(100, "Ramayan", 764f));
		pqb.add(new Book(105, "Hamlet", 764f));
		pqb.add(new Book(104, "The Secret", 900f));
		pqb.add(new Book(103, "Life", 890f));

		Iterator<Book> itr = pqb.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
