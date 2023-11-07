package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
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
			System.out.println("10.Save Books In File");
			System.out.println("11.Load Books In File");
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
			case 10:
				try(FileOutputStream fout=new FileOutputStream("library.bin"))
						{
						try(DataOutputStream dout= new DataOutputStream(fout))
								{
							for (Book book : library) {
								dout.writeUTF(book.getIsbn());
								dout.writeDouble(book.getPrice());
								dout.writeUTF(book.getAuthorName());
								dout.writeInt(book.getQuantity());
							}
							
								}
						}catch (Exception e) {
							e.printStackTrace();
						}
				break;
			case 11:
				try(FileInputStream fin = new FileInputStream("library.bin")) {
					try(DataInputStream din = new DataInputStream(fin)) {
						while(true) {
							Book d= new Book();
							d.setIsbn(din.readUTF());
							d.setPrice(din.readDouble());
							d.setAuthorName(din.readUTF());
							d.setQuantity(din.readInt());
							library.add(d);
						}
					} // din.close();
				} // fin.close();
				catch (EOFException e) {
					// do nothing -- close() is done auto -- AutoCloseable
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				library.forEach(e -> System.out.println(e));
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
