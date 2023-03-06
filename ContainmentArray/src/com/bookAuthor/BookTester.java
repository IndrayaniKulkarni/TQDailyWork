package com.bookAuthor;

import java.util.Scanner;

public class BookTester {
	static Scanner sc = new Scanner(System.in);

	public static void input(Book b) {

		System.out.println("Book ISBN = ");
		b.setIsbn(sc.nextInt());
		System.out.println("Book Title = ");
		b.setTitle(sc.next());
		System.out.println("Book Price = ");
		b.setPrice(sc.nextFloat());

		b.setAuthor(new Author());
		System.out.println("Author id =");
		b.getAuthor().setId(sc.nextInt());
		System.out.println("Author name = ");
		b.getAuthor().setName(sc.next());
	}

	public static void sort(Book b[]) {

		Book temp = new Book();
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i].getPrice() > b[j].getPrice()) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
	}

	public static void display(Book b[]) {
		System.out.println("-----------------------------------------------------");
		for (Book x : b) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {

		System.out.println("Kindly enter number of books = ");
		int n = sc.nextInt();

		Book b[] = new Book[n];

		for (int i = 0; i < n; i++) {
			b[i] = new Book();
			input(b[i]);
		}

		display(b);
		sort(b);
		display(b);
	}

}
