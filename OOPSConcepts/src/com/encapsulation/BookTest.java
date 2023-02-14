package com.encapsulation;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        Book b = new Book();
        System.out.println(b);// hash code
        
        System.out.println("ISBN = ");
        b.setIsbn(sc.nextInt());
        
        System.out.println("Book title = ");
        b.setBookTitle(sc.next());
        
        System.out.println("Author of the book =");
        b.setAuthor(sc.next());
        
        System.out.println("Price =Rs.");
        b.setPrice(sc.nextFloat());
        
        System.out.println("Genre =");
        b.setGenre(sc.next());
        
        System.out.println("Publication =");
        b.setPublication(sc.next());
        
        System.out.println("ISBN = "+b.getIsbn());
        
        System.out.println("Book title = "+b.getBookTitle());
        
        System.out.println("Author of the book = "+b.getAuthor());
        
        System.out.println("Price =Rs."+b.getPrice());
        
        System.out.println("Genre ="+b.getGenre());
        
        System.out.println("Publication ="+b.getPublication());
        
        //
		/*
		 * String com.encapsulation.Book.toString()
		 * 
		 * 
		 * Returns a string representation of the object.
		 * 
		 * Overrides: toString() in Object Returns:a string representation of the
		 * object.
		 */
        System.out.println(b.toString());
		sc.close();

	}

}
