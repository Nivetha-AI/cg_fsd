package com.colletions;

import java.util.*;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

class Book {
	private String author;
	private double price;

	public Book(String author, double price) {
		super();
		this.author = author;
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", price=" + price + "]";
	}

}

class BookStore {
	private SortedMap<String, Book> bookMap;

	public BookStore() {
		super();
		bookMap = new TreeMap<String, Book>();
	}

	public void addBook(String title, String author, double price) {
		Book book = new Book(author, price);
		bookMap.put(title, book);
	}

	public void display() {
		for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
			System.out.println("Title: " + entry.getKey() + " " + entry.getValue());
		}
	}

	public void displayBooksInRange(String fromTitle, String toTitle) {
		SortedMap<String, Book> subMap = bookMap.subMap(fromTitle, toTitle);
		System.out.println("Book in the Range: ");
		for (Map.Entry<String, Book> entry : subMap.entrySet()) {
			System.out.println("Title: " + entry.getKey() + " " + entry.getValue());
		}
	}

	public void getFirstBook() {

		
		System.out.println("First Book: Title: " + ((TreeMap<String, Book>) bookMap).firstEntry());

	}

	public void getLastBook() {

		System.out.println("Last Book: Title: " + ((TreeMap<String, Book>) bookMap).lastEntry());
	}

}

public class TreeMap_sortedMap {
	public static void main(String[] args) {
		BookStore store = new BookStore();
		
		store.addBook("Java", "James", 4500.0);
        store.addBook("Data Structure", "Jhon", 2990.0);
        store.addBook("Advance Java", "SMith", 4000.0);
        store.addBook("C++", "Paul", 3500.0);
        store.addBook("React", "Sam", 3700.0);
        store.addBook("AI ", "Rozar", 4900.0);
        store.addBook("ML", "Martha", 9800.0);
        store.addBook("Python", "David", 5600.0);
        
        store.display();
        store.displayBooksInRange("Data Structure", "React");
        store.getFirstBook();
        store.getLastBook();
	}
}
