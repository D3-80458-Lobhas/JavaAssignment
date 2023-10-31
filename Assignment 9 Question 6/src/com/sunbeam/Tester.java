package com.sunbeam;

import java.util.Scanner;

import com.sunbeam.Tester.menus;

public class Tester {
	enum menus {
		EXIT,
		ADD_PERSON,
		DISPLAY_PEOPLE,
		FIND_PERSON
	} 
	
	public static menus menu(Scanner sc)
	{
		menus Choice[]=menus.values() ;
		System.out.println("0.Exit");
		System.out.println("1.Add Person");
		System.out.println("2.Display All People");
		System.out.println("3.Find Person by name");
		int val=sc.nextInt();
		menus ch= Choice[val];
		return ch;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		Person person[]=new Person[size];
		int count=0;
		menus choice;
		while(true) {
		choice=menu(sc);
		switch (choice)
		{
			case ADD_PERSON:
				if(count<size)
				{
					person[count]= new Person();
					person[count].accept();
					count++;
					System.out.println("Person added successfully.");
				}
				else
					System.out.println("Size full !!!");
		        break;
		
		    case DISPLAY_PEOPLE:
		        System.out.println("List of People:");
		        for (int i = 0; i < count; i++) {
		            System.out.println(person[i]);
		        }
		        break;
		
		    case FIND_PERSON:
		    	System.out.println("Enter name to search : ");
				String s = sc.next();
				for(Person ele : person)
					if(ele != null)
						if( s.compareTo(ele.getName())==0)
							System.out.println(ele.toString());
				break;
		
		    case EXIT:
		        System.out.println("Exiting program. Goodbye!");
		        System.exit(0);
		
		    default:
		        System.out.println("Invalid choice. Please try again.");
		        break;	
		        }
				
			
		
	}

	}
}
