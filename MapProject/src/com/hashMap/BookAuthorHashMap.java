package com.hashMap;

import java.util.HashMap;
import java.util.Map.Entry;

class Book{
	private int isbn;
	private String title;
	private float price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int isbn, String title, float price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
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
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}
	
}
class Author{
	private int id;
	private String name;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class BookAuthorHashMap {

	public static void main(String[] args) {
		
		
		HashMap<Author,Book> publish = new HashMap<>();
		
		publish.put(new Author(111,"EdgarAlanPoe"), new Book(1021,"Tell-TaleHeart",300.0f));
		publish.put(new Author(123,"NeilGaiman"), new Book(1022,"Caroline",560.0f));
		
		for(Entry<Author, Book> b: publish.entrySet()) {
			System.out.println(b.getKey()+" "+b.getValue());
		}
		
	}

}
