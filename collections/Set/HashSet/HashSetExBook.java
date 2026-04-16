package com.collections.Set.HashSet;

import java.util.HashSet;

import com.operators.NewOperator;

public class HashSetExBook {
	public static void main(String[] args) {
		HashSet<Book> hs = new HashSet<Book>();
		// Creating Books
		Book b1 = new Book(101, "You can win", "Shiv Khera", "BPB", 2);
		Book b2 = new Book(102, "5 Am Club", "Robin Sharma", "RedBooks", 1);
		Book b3 = new Book(103, "Think Like A Monk", "Jay Shetty", "GardenGrass", 2);

		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		 for(Book b:hs){  
			    System.out.println(b.Bookid+" "+b.BookName+" "+b.AutherName+" "+b.Publisher+" "+b.quantity);  
			    }  
		
	}
}
