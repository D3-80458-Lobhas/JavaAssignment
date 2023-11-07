package com.sunbeam;

import java.util.Comparator;

public class IsbnDescComparator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		int diff=b1.getIsbn().compareTo(b2.getIsbn());
		return -diff;
	}
	
}
