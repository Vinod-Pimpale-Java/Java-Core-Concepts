package com.collections.Set.TreeSet;

//Let's see a TreeSet example where we are adding books to the set and printing all the books
public class SetBook implements Comparable<SetBook> {
	int id;
	String name, author, publisher;
	int quantity;

	public SetBook(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	// implementing the abstract method
	public int compareTo(SetBook b) {
		if (id > b.id) {
			return 1;
		} else if (id < b.id) {
			return -1;
		} else {
			return 0;
		}
	}
}
