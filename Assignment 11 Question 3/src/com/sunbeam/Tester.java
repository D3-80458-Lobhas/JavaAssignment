package com.sunbeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tester {

	public static int menu(Scanner sc)
	{
		int choice=0;
		System.out.println("0.Exit");
		System.out.println("1.Add New Books in List");
		System.out.println("2.Display all Books in Forward Order");
		System.out.println("3.Delete book of given id");
		System.out.println("4.Check if book with given isbn is in list or not");
		System.out.println("5.Delete all books in list");
		System.out.println("6.Display No of books in list");
		System.out.println("Enter the choice");
		choice=sc.nextInt();
		return choice;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Book> library=new ArrayList<Book>();
		int choice=0;
		while(true)
		{
			choice=menu(sc);
			switch (choice) {
			case 1:
				Book b=new Book();
				b.acceptData(sc);
				library.add(b);
				break;
			case 2:
				Collections.sort(library);
				System.out.println("Elements: " + library.toString());
				break;
			case 3:
				System.out.println("Enter the ISBN");
				String id = sc.next();
				Book key = new Book();
				key.setIsbn(id);
				library.remove(key);
				break;
			case 4:
				System.out.println("Enter the ISBN");
				 id = sc.next();
				 key = new Book();
				 key.setIsbn(id);
				if(library.contains(key))
					System.out.println("Book found.");
				else
					System.out.println("Book not found.");
				break;
			case 5:
				library.clear();
				break;
			case 6:
				System.out.println("The No of books is : "+library.size());
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Choice Entered");
				break;
			}
			
		}
	}
}
