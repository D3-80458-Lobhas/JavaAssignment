package com.sunbeam;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Tester {
	public static Student acceptData(Scanner sc,Student s)
	{
		System.out.println("Enter the Roll No");
		s.setRoll(sc.nextInt());
		System.out.println("Enter the Name");
		s.setName(sc.next());
		System.out.println("Enter the marks");
		s.setMarks(sc.nextInt());
		return s;
	}

	public static int menu(Scanner sc)
	{
		int choice;
		System.out.println("1.Insert in Map");
		System.out.println("2.Find in map");
		System.out.println("3.Print Student from user");
		choice=sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Map<Integer, Student> map = new HashMap<>();
		Map<Integer, Student> map = new LinkedHashMap<>();
		int choice;
		while(true)
			{
			choice=menu(sc);
			switch (choice) {
			case 1:Student s = new Student();
				acceptData(sc,s);
				map.put(s.getRoll(),s);				
				break;
			case 2:
				System.out.println("Enter the Roll No");
				int roll;
				roll = sc.nextInt();
				s = map.get(roll);	
				System.out.println(s);
				break;
			case 3:
				Set< Entry<Integer,Student> > entries = map.entrySet();
				for(Entry<Integer,Student> en : entries) {
					System.out.println(en.getKey() + " -- " + en.getValue());
				}
				break;
			default:
				break;
			}
			}
	}

}
