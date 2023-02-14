package com.encapsulation;

public class Book {

	private int isbn;
	private String bookTitle;
	private String author;
	private float price;
	private String genre;
	private String publication;

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public int getIsbn() {
		return isbn;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
     //Multiple markers at this line
//	- This method must return a result of type String
//	- overrides java.lang.Object.toString
	public String toString()
	{
		return (isbn+" "+bookTitle+" "+author+" "+price+" "+genre+" "+publication+" ");
	}
	
}
