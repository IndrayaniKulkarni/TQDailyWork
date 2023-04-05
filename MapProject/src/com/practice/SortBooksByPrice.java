package com.practice;

import java.util.ArrayList;
import java.util.Collections;

public class SortBooksByPrice {

	public static void main(String[] args) {

		ArrayList<Book> bookLog = new ArrayList<>();
		Author author1 = new Author(1, "Jane Austen");
		Author author2 = new Author(2, "Charles Dickens");
		bookLog.add(new Book(1213, "Atomic habit", 500.0f, new Author(10, "James Clear")));
		bookLog.add(new Book(1013, "The raven", 150.0f, new Author(20, "Edgar Allan Poe")));
		bookLog.add(new Book(1215, "The series of unfortunate events", 590.0f, new Author(50, "Lemony Snicket")));
		bookLog.add(new Book(1343, "Pride and Prejudice", 912.99f, author1));
		bookLog.add(new Book(3242, "Emma", 900.99f, author1));
		bookLog.add(new Book(393, "Oliver Twist", 800.99f, author2));
		bookLog.add(new Book(432, "David Copperfield", 1000.99f, author2));
		bookLog.add(new Book(523, "Sense and Sensibility", 1011.99f, author1));
		System.out.println("Before sorting = ");
		for (Book b : bookLog) {
			System.out.println(b);
		}

		Collections.sort(bookLog, new PriceComparator());
		System.out.println();
		System.out.println("After sorting = ");
		for (Book b : bookLog) {
			System.out.println(b);
		}

	}

}
