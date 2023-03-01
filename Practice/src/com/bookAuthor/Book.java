package com.bookAuthor;

public class Book {
	
	private int isbn;
	private String title;
	private float price;
	private Author author;
	
	Book(){
		
	}
	Book(int isbn, String title, float price, Author author){
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public String toString() {
		return ("Book [ isbn = "+isbn+", title = "+title+", price"+price+" "+author);
	}
	

}
