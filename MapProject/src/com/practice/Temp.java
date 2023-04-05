package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book1 implements Comparable<Book1> {
    private int id;
    private String bookName;
    private double price;
    private Author1 author;

    public Book1(int id, String bookName, double price, Author1 author) {
        this.id = id;
        this.bookName = bookName;
        this.price = price;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    public Author1 getAuthor() {
        return author;
    }

    @Override
    public int compareTo(Book1 other) {
        return (int) Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", author=" + author +
                '}';
    }
}

class Author1 {
    private int id;
    private String authorName;
    private List<Book> books;

    public Author1(int id, String authorName, List<Book> books) {
        this.id = id;
        this.authorName = authorName;
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", books=" + books +
                '}';
    }
}

public class Temp {
    public static void main(String[] args) {
        ArrayList<Book1> books = new ArrayList<>();
        Author1 author1 = new Author1(1, "Jane Austen", new ArrayList<>());
        Author1 author2 = new Author1(2, "Charles Dickens", new ArrayList<>());

        books.add(new Book1(1, "Pride and Prejudice", 12.99, author1));
        books.add(new Book1(2, "Emma", 9.99, author1));
        books.add(new Book1(3, "Oliver Twist", 8.99, author2));
        books.add(new Book1(4, "David Copperfield", 10.99, author2));
        books.add(new Book1(5, "Sense and Sensibility", 11.99, author1));

     
        System.out.println("Unsorted Books:");
        for (Book1 b : books) {
            System.out.println(b);
        }

        Collections.sort((List<Book1>) books);

        System.out.println("Sorted Books by Price:");
        for (Book1 book : books) {
            System.out.println(book);
        }
    }
}
