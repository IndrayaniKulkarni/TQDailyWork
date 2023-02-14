package com.bookAuthor;

import java.util.Scanner;

public class TestBookAuthor {

	static Scanner sc = new Scanner(System.in);

	public static void enterBookDetails(Book b) {

		System.out.println("\nKindly enter details = ");

		System.out.println("Book ISBN = ");
		b.setISBN(sc.nextInt());

		System.out.println("Book title = ");
		b.setTitle(sc.next());

		System.out.println("Book price = ");
		b.setPrice(sc.nextFloat());
		
		Author a = new Author();
		enterAuthorDetails(a);
		b.setAuthor(a);
	}

	public static void enterAuthorDetails(Author a) {

		System.out.println("\nKindly enter details = ");

		System.out.println("Author id = ");
		a.setAuthorId(sc.nextInt());

		System.out.println("Name = ");
		a.setName(sc.next());

		System.out.println("Age = ");
		a.setAge(sc.nextInt());
	}

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in); Book b1 = new Book();
		 * 
		 * System.out.println("\nKindly enter details = ");
		 * 
		 * System.out.println("Book ISBN = "); b1.setISBN(sc.nextInt());
		 * 
		 * System.out.println("Book title = "); b1.setTitle(sc.next());
		 * 
		 * System.out.println("Book price = "); b1.setPrice(sc.nextFloat());
		 * 
		 * // Enter details in some var. // then pass them to to author obj // pass that
		 * obj to book
		 * 
		 * System.out.println("Author details as id, name and age = "); Author a1 = new
		 * Author(sc.nextInt(), sc.next(), sc.nextInt()); b1.setAuthor(a1);
		 * 
		 * System.out.println(b1.toString()); sc.close();
		 */

		
		Book b1 = new Book();
//		enter
	}

	
}
