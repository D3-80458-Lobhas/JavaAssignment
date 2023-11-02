package com.subeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;



public class Tester {

	public static int menu(Scanner sc)
	{
		int choice;
		System.out.println("1.Add Employee");
		System.out.println("2.Delete Employee");
		System.out.println("3.Find Employee");
		System.out.println("4.Sort Employee");
		System.out.println("5.Edit Employee");
		System.out.println("6.Print Employee");
		choice=sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Employee> emp=new LinkedList<>();
		int choice;
		while(true)
		{
			choice=menu(sc);
			switch (choice) {
			case 1:
				Employee e=new Employee();
				e.acceptData(sc);
				emp.add(e);
				break;
			case 2:
				System.out.println("Enter the ID");
				  int key = sc.nextInt();
				  e=new Employee();
				  e.setId(key);
				  int index=emp.indexOf(e);
				  emp.remove(index);
					break;
			case 3:
				System.out.println("Enter the ID");
				 key = sc.nextInt();
				 e=new Employee();
				 e.setId(key);
				 index=emp.indexOf(e);
				 if(index==-1)
					 System.out.println("Employee not Found");
				 else
				 {
					 index=emp.indexOf(e);
					 Employee a=emp.get(index);
					 System.out.println(a);
				 }
				break;
			case 4:
				Collections.sort(emp);
				break;
			case 5:
				System.out.println("Enter emp id to be modified: ");
				int id = sc.nextInt();
				e = new Employee();
				e.setId(id);
				index = emp.indexOf(e);
				if(index == -1)
				System.out.println("Employee not found.");
				else {
				Employee oldEmp = emp.get(index);
				System.out.println("Employee Found: " + oldEmp);
				System.out.println("Enter new information for the Employee");
				Employee newEmp = new Employee();
				newEmp.acceptData(sc);
				emp.set(index, newEmp);
				}
				break;
			case 6:
				System.out.println(emp);
			default:
				break;
			}
			
		}
	}

}
