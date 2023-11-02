package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Tester {

	public static int menu(Scanner sc)
		{
			int choice;
			System.out.println("0.Exit");
			System.out.println("1.Add new book in List");
			System.out.println("2.Display all books in forward order");
			System.out.println("3.Search a Book with given ISBN");
			System.out.println("4.Delete a Book at given Index");
			System.out.println("5.Delete a Book with given ISBN");
			System.out.println("6.Delete a Book with given Name");
			System.out.println("7.Sort books by isbn in asc order");
			System.out.println("8.Sort books by price in desc order");
			System.out.println("9.Reverse the list");
			System.out.println("Enter the Choice");
			choice=sc.nextInt();
			return choice;
		}
	
	public static void main(String[] args) {
		List<Book> library=new ArrayList<Book>();
		Scanner sc=new Scanner(System.in);
		int choice;
		while(true)
		{
			choice=menu(sc);
			switch (choice) {
			case 1:
				Book b=new Book();
				b.acceptData(sc);
				if(!library.contains(b))
				library.add(b);
				else
					{
						Book ele=library.get(library.indexOf(b));
						ele.setQuantity(ele.getQuantity() +b.getQuantity());
					}
				break;
			case 2:if(library.size()!=0)
				for(int i=0; i<library.size(); i++) {
					Book ele = library.get(i);
					System.out.println(ele);
				}
			else
				System.out.println("Library is empty");
				break;
			case 3:
				 System.out.println("Enter the ISBN");
				 String key = sc.next();
				 b=new Book();
				 b.setIsbn(key);
				 int index=library.indexOf(b);
				 if(index==-1)
				 System.out.println("Book Not Found");
				 else
					 System.out.println("Book found at "+index + "with ISBN" + key);
				break;
			case 4:
				System.out.println("Enter the index");
				index=sc.nextInt();
				library.remove(index);
				break;
			case 5:
				System.out.println("Enter the ISBN");
				  key = sc.next();
				  b=new Book();
				  b.setIsbn(key);
				  index=library.indexOf(b);
				  library.remove(index);
				break;
			case 6:
				System.out.println("Enter the name");
				Book b1=new Book();
				  key = sc.next();
				  for(Book ele:library) {
					  if(ele.getAuthorName().equalsIgnoreCase(key))
						b1 = library.remove(library.indexOf(ele));
				  System.out.println("Book with author name "+ b1.getAuthorName()+" deleted");
				  break;}
				break;
			case 7:
				Collections.sort(library, new IsbnAscComparator());
				System.out.println("Elements: " + library.toString());
				break;
			case 8:
				Collections.sort(library, new IsbnDescComparator());
				System.out.println("Elements: " + library.toString());
				break;
			case 9:
				Collections.reverse(library);
				System.out.println("Elements: " + library.toString());
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
