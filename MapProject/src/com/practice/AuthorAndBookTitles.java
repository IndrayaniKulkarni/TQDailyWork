package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AuthorAndBookTitles {

	public static void createHashMapBook(ArrayList<Book> bookLog) {
		HashMap<Author,ArrayList<String>> authorsBooks = new HashMap<>();
		ArrayList<String> titles;
		
		for(Book b: bookLog) {
			Author a = b.getAuthor();
			if(authorsBooks.containsKey(a)) {
				titles = authorsBooks.get(a);
				titles.add(b.getTitle());
			}
			else {
				titles = new ArrayList<>();
				titles.add(b.getTitle());
			}
			authorsBooks.put(a, titles);
		}
		for(Map.Entry<Author, ArrayList<String>> en: authorsBooks.entrySet()) {
			System.out.println(en.getKey().getName()+"  : "+en.getValue());
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
