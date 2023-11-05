package com.sunbeam;

import java.util.Scanner;

public class Tester  {

	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		}
	
	public static int menu(Scanner sc)
	{
		int choice;
		System.out.println("0.Exit");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		choice=sc.nextInt();
		return choice;
		
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice;
		while(true)
		{
			choice=menu(sc);
			System.out.println("Enter First Number");
			double x=sc.nextDouble();
			System.out.println("Enter Second Number");
			double y=sc.nextDouble();
			
			switch (choice) {
			case 1:
				calculate(x,y,(a,b)->a+b);
				break;
			case 2:
				calculate(x,y,(a,b)->a-b);
			case 3:
				calculate(x,y,(a,b)->a*b);
			case 4:
				calculate(x,y,(a,b)->a/b);
			
			default:
				break;
			}
		}
	}

	}


