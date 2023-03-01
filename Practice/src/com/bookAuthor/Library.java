package com.bookAuthor;

import java.util.Scanner;

public class Library {

	static Scanner sc = new Scanner(System.in);
	public static void newBookInLib(Book b) {
		System.out.println("Book ISBN = ");
		b.setIsbn(sc.nextInt());
		System.out.println("Title = ");
		b.setTitle(sc.next());
		System.out.println("Price = ");
		b.setPrice(sc.nextFloat());
		System.out.println("Author id=");
		Author a = new Author();
		a.setAuthorId(sc.nextInt());
		System.out.println("Name = ");
		a.setAuthorName(sc.next());
		System.out.println("Email = ");
		a.setEmail(sc.next());
		System.out.println("Contact no = ");
		a.setContactNo(sc.nextInt());
		System.out.println("-------------------------------");
	}
	public static void main(String[] args) {
		
		int numberOfBooks;
		
		System.out.println("Please enter number of new books need to be added to the library = ");
		numberOfBooks = sc.nextInt();
		
		Book b[] = new Book[numberOfBooks];
		
		for(int i=0; i<numberOfBooks; i++) {
			b = new Book[i];
			newBookInLib(b[i]);
		}
		
		System.out.println("\n Newly added books are");
		
		for(int i=0; i<numberOfBooks; i++) {
			System.out.println(b[i].toString());
		}
   
	}

}
