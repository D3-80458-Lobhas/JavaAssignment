package javaassignment.q1;

import java.util.Scanner;

public class InvoiceTest {
	static int menu() {
		int choice;
		System.out.println("1.Add Part");
		System.out.println("2.Generate Bill");
		choice = new Scanner(System.in).nextInt();
		return choice;
	};
	
	public static void main(String[] args) {
		Invoice invoice = new Invoice();
		Scanner sc = new Scanner(System.in);
		int choice;
		double amount=0;
		while (true)
			
		{
			choice=menu();
			switch(choice)
			{
			case 1: System.out.println("Enter Part Qty");
			   		invoice.setQty(sc.nextInt());
			   		System.out.println("Enter Part Amount");
			   		invoice.setPrice(sc.nextInt());
			   		amount=invoice.calculateAmount();
			   		break;
			
			case 2: System.out.println("The Amount is"+ amount);
					break;
			
			default:System.out.println("Invalid Choice");
					break;
			}
			sc.close();
			
		}
	}

}