package com.sunbeam;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book>{
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	public Book() {
				   }
	public Book(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [isbn=").append(isbn).append(", price=").append(price).append(", authorName=")
				.append(authorName).append(", quantity=").append(quantity).append("]");
		return builder.toString();
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(authorName, isbn, price, quantity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
				
	}
	public void acceptData(Scanner sc)
	{
		System.out.println("Enter the ISBN");
		this.isbn = sc.next();
		System.out.println("Enter the Price");
		this.price = sc.nextDouble();
		System.out.println("Enter Author Name");
		this.authorName = sc.next() ;
		System.out.println("Enter the Quantity");
		this.quantity = sc.nextInt();
	}
	@Override
	public int compareTo(Book b) {
		int diff=this.getIsbn().compareTo(b.getIsbn());
		return diff;
	}
}
