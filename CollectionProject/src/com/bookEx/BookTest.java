package com.bookEx;

import java.util.ArrayList;
import java.util.Collections;

class Book implements Comparable<Book>{
	private int id;
	private String title;
	private float price;
	
	Book(){}
	Book(int id, String title, float price){
		this.id = id;
		this.title = title;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Book [id=" + id + ", title=" + title + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Book b) {
		if(this.id == b.id) {
	        return 0;
	    } else if(this.id > b.id) {
	        return 1;
	    } else {
	        return -1;
	    }
	}
	
}
public class BookTest {

	public static void main(String[] args) {
	
		ArrayList<Book> tbr = new ArrayList<>();
		
		tbr.add(new Book(101,"Hamlet",300.0f));
		tbr.add(new Book(104,"Ramayan",900.0f));
		tbr.add(new Book(103,"The secret history",700.0f));
		tbr.add(new Book(102,"And there were none",350.0f));
		
		for(Book b:tbr) {
			System.out.println(b);
		}
		
		// not allowing
		Collections.sort(tbr);
		
		System.out.println("---------------------------------------------");
		for(Book b:tbr) {
			System.out.println(b);
		}
	}

}
