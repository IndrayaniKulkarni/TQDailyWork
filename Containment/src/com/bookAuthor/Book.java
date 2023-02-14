package com.bookAuthor;

public class Book {

	private int ISBN;
	private String title;
	private float price;
	//pay attention
	// we are creating variable or ref of type Author
	
	private Author author;
	
	Book(){
		
	}
	
	Book(int ISBN, String title, float price, Author author){
		this.ISBN = ISBN;
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Author getAuthor() {
		return author;
	}
	
	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}
	public int getISBN() {
		return ISBN;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return price;
	}
	public String toString() {
		return ("Book {"+ISBN+" , "+title+" , "+price+" , "+author+" }");
	}
}
