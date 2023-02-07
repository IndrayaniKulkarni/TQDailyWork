package com.basics;

import java.util.Scanner;

public class BookImplementation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book b = new Book();

		System.out.println("\nBook ISBN no.:");
		long id = sc.nextLong();
		b.setISBN(id);

		System.out.println("\nAuthor of the book:");
		String name = sc.next();
		b.setAuthor(name);

		System.out.println("\nBook Title:");
		String title = sc.next();
		b.setTitle(title);

		System.out.println("\nBook Genre:");
		String ge = sc.next();
		b.setGenre(ge);

		System.out.println("\nBook Price:");
		float cost = sc.nextLong();
		b.setPrice(cost);

		System.out.println("ISBN\t\tAuthor\t\tTitle\t\tGenre\t\tPrice(Rs)");
		System.out.println(b.getISBN() + "\t" + b.getAuthor() + "\t" + b.getTitle() + "\t" + b.getGenre() + "\t" + b.getPrice());
		sc.close();

	}

}
