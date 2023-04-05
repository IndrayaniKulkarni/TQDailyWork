package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AuthorAndNumBooks {

	public static void createHashMapBook(ArrayList<Book> bookLog) {
		HashMap<Author,Integer> authorsBooks = new HashMap<>();
		
		for(Book b: bookLog) {
			Author a = b.getAuthor();
			if(authorsBooks.containsKey(a)) {
				authorsBooks.put(a, authorsBooks.get(a)+1);
			}
			else {
				authorsBooks.put(a, 1);
			}
		}
		for(Map.Entry<Author, Integer> en: authorsBooks.entrySet()) {
			System.out.println(en.getKey()+"  : "+en.getValue());
		}
	}
	public static void main(String[] args) {
		
		//key author
		//value no. of books
        ArrayList<Book> bookLog = new ArrayList<>();
		
		bookLog.add(new Book(1213,"Atomic habit",500.0f, new Author(10,"James Clear")));
		bookLog.add(new Book(1013,"The raven",150.0f, new Author(20,"Edgar Allan Poe")));
		bookLog.add(new Book(1012,"The tale-tale heart",150.0f, new Author(20,"Edgar Allan Poe")));
		bookLog.add(new Book(1215,"The series of unfortunate events",590.0f, new Author(50,"Lemony Snicket")));
		
		createHashMapBook(bookLog);
		
	}

}
