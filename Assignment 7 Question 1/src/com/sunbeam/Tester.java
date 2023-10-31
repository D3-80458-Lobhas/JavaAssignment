package com.sunbeam;

import java.util.Scanner;

public class Tester {

	public static int Menu(Scanner sc)
	{
		System.out.println("0.EXIT");
		System.out.println("1.CACULATE AREA OF TRIANGLE");
		System.out.println("2.CACULATE AREA OF RECTANGLE");
		System.out.println("3.CACULATE AREA OF SQUARE");
		System.out.print("ENTER YOUR CHOICE:");
		int choice=sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		BoundedShape ref;
		Scanner sc=new Scanner(System.in);
		int choice;
		while((choice=Menu(sc))!=0)
		{
			switch (choice) {
			case 1:
				System.out.println("Enter Details of Triangle");
				System.out.print("Enter Side-1:");
				int a=sc.nextInt();
				System.out.print("Enter Side-2:");
				int b=sc.nextInt();
				System.out.print("Enter Side-3:");
				int c=sc.nextInt();
				ref=new Triangle(a,b,c);
				System.out.println("Area Of Tringle:"+ref.calcArea());
				break;
			case 2:
				System.out.println("Enter Details of Rectangle");
				System.out.print("Enter Length:");
				int l=sc.nextInt();
				System.out.print("Enter Breadth:");
				int br=sc.nextInt();
				ref=new Rectangle(l,br);
				System.out.println("Area Of Rectangle:"+ref.calcArea());
				break;
			case 3:
				System.out.println("Enter Details of Square");
				System.out.print("Enter Side:");
				int d=sc.nextInt();
				ref=new Square(d);
				System.out.println("Area Of Square:"+ref.calcArea());
				break;
			default:
				System.out.println("INVALID CHOICE ENTER AGAIN");
				break;
			}
		}
		System.out.println("Thank You..!");
		sc.close();
	}

	}