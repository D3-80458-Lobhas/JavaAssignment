//If any book with duplicate isbn is added, what will happen?
//It returns False
//Books are stored in which order? Solve duplicate ISBN problem.
//Books are stored in Ascending Order.They are solved by Comparator; 

package com.sunbeam;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tester {
	public static void main(String[] args) {
		Set<Book> b=new TreeSet<Book>();
		System.out.println(b.add(new Book("123",50,"gojo",5)));
		System.out.println(b.add(new Book("456",540,"zoro",6)));
		System.out.println(b.add(new Book("789",587,"luffy",7)));
		System.out.println(b.add(new Book("963",570,"sanji",8)));
		System.out.println(b.add(new Book("741",870,"kaneki",9)));
		System.out.println(b.add(new Book("754",580,"denji",5)));
		System.out.println(b.add(new Book("754",590,"sukuna",6)));//Returns false
		Iterator<Book> itr1 = b.iterator();
		while(itr1.hasNext()) {
			Book ele = itr1.next();
			System.out.println(ele);
		}

	}

}
