package com.basics;

import java.util.Scanner;

public class Book {

	// data members
	long ISBN;// book id;
	String author;
	String title;
	String genre;
	float price = 0.0f;

	void setISBN(long id) {
		ISBN = id;
	}

	void setAuthor(String a) {
		author = a;
	}

	void setTitle(String t) {
		title = t;
	}

	void setGenre(String g) {
		genre = g;
	}

	void setPrice(float p) {
		price = p;
	}

	long getISBN() {
		return ISBN;
	}

	String getAuthor() {
		return author;
	}

	String getTitle() {
		return title;
	}

	String getGenre() {
		return genre;
	}

	float getPrice() {
		return price;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Book b1 = new Book();

		System.out.println("\nBook ISBN no.:");
		long id = sc.nextLong();
		b1.setISBN(id);
		System.out.println("\nAuthor of the book:");
		String name = sc.next();
		b1.setAuthor(name);
		System.out.println("\nBook Title:");
		String title = sc.next();
		b1.setTitle(title);
		System.out.println("\nBook Genre:");
		String ge = sc.next();
		b1.setGenre(ge);
		System.out.println("\nBook Price:");
		float cost = sc.nextLong();
		b1.setPrice(cost);

		System.out.println("ISBN\t\tAuthor\t\tTitle\t\tGenre\t\tPrice(Rs)");
		System.out.println(b1.getISBN() + "\t" + b1.getAuthor() + "\t" + b1.getTitle() + "\t" + b1.getGenre() + "\t"
				+ b1.getPrice());
		sc.close();
	}

}
