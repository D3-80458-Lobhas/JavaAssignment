package com.sunbeam;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
		TreeSet<Book> b=new TreeSet<Book>(new DescPriceComparator());
		System.out.println(b.add(new Book("123",50,"gojo",5)));
		System.out.println(b.add(new Book("456",540,"zoro",6)));
		System.out.println(b.add(new Book("789",587,"luffy",7)));
		System.out.println(b.add(new Book("963",570,"sanji",8)));
		System.out.println(b.add(new Book("741",870,"kaneki",9)));
		System.out.println(b.add(new Book("754",580,"denji",5)));
		System.out.println(b.add(new Book("754",590,"sukuna",6)));//Returns false
		Iterator<Book> itr1 = b.iterator();
		System.out.println("The List of Book in order of price Descending");
		while(itr1.hasNext()) {
			Book ele = itr1.next();
			System.out.println(ele);
		}
		System.out.println("The List of Book using Descending Iterator");

		Iterator<Book> itr2 = b.descendingIterator() ;
		while(itr2.hasNext()) {
			Book ele = itr2.next();
			System.out.println(ele);
		}
		
	}

}
