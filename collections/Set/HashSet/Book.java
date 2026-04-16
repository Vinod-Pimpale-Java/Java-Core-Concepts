package com.collections.Set.HashSet;

//Java HashSet Example: SetBook
public class Book {
	int Bookid;
	String BookName;
	String AutherName;
	String Publisher;
	int quantity;

	public int getBookid() {
		return Bookid;
	}

	public void setBookid(int bookid) {
		Bookid = bookid;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getAutherName() {
		return AutherName;
	}

	public void setAutherName(String autherName) {
		AutherName = autherName;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Book(int bookid, String bookName, String autherName, String publisher, int quantity) {

		this.Bookid = bookid;
		this.BookName = bookName;
		this.AutherName = autherName;
		this.Publisher = publisher;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "SetBook [Bookid=" + Bookid + ", BookName=" + BookName + ", AutherName=" + AutherName + ", Publisher="
				+ Publisher + ", quantity=" + quantity + "]";
	}

}