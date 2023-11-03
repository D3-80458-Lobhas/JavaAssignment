package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Tester {


	public static int menu(Scanner sc)
	{
		int choice;
		System.out.println("1.Insert in Map");
		System.out.println("2.Find in map");
		System.out.println("3.Print book from user");
		
		choice=sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		Map<String,Book> map = new HashMap<>();
		while(true)
		{
			choice=menu(sc);
			switch (choice) {
			case 1:
				Book b = new Book();
				b.acceptData(sc);
				map.put(b.getIsbn(),b);
				break;
			case 2:
				System.out.println("Enter the ISBN");
				String isbn = sc.next();
				Book f = map.get(isbn);
				System.out.println(f);
				break;
			case 3:
				Set< Entry<String,Book> > entries = map.entrySet();
				for(Entry<String,Book> en : entries) {
					System.out.println(en.getKey() + " -- " + en.getValue());
				}
			
			default:
				break;
			}
		}
	}

}
