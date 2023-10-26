package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	
	public static int menu(Scanner sc)
	{
		int choice;
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display Names of all Fruits in Basket");
		System.out.println("5.Display name,color,weight , taste of all fresh fruits in the basket");
		System.out.println("6.Display Taste of all Stale Fruits in the Basket");
		System.out.println("7.Mark a Fruit as Stale");
		System.out.println("8.Mark all sour Fruits as Stale");
		System.out.println("0.Exit");
		choice=sc.nextInt();
		return choice;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Basket");
		int size=sc.nextInt();
		Fruit basket[]= new Fruit[size];
		int counter=0;	
		while(true)
		{
			int choice;
			choice=menu(sc);
			switch (choice) {
			case 1:if(counter<size)
				basket[counter++]=new Mango("Yellow",0.5,"Rt");
			else
				System.out.println("The Basket is Full");
				break;
			case 2:if(counter<size)
				basket[counter++]=new Orange("Orange",0.5,"Np");
			else
				System.out.println("The Basket is Full");
				break;
			case 3:if(counter<size)
				basket[counter++]=new Apple("Red",0.5,"jk");
			else
				System.out.println("The Basket is Full");
				break;
			case 4:
				for (Fruit element:basket)
					if(element!=null)
					System.out.println(element.getName());
				break;
			case 5:for (Fruit element:basket)
				if(element!=null)
				if(element.isFresh()==true)
				System.out.println(element);
			break;
			case 6:for (Fruit element:basket)
				if(element!=null)
				if(element.isFresh()==false)
				System.out.println(element.taste());
			break;
			case 7:
				int index=0;
				System.out.println("Enter the index");
				index=sc.nextInt();
				if(index>0 && index<size)
					basket[index-1].setFresh(false);
				break;
			case 8:for (Fruit element:basket)
				if(element!=null)
				if(element.taste()=="sour")
				element.setFresh(false);
				break;
			default:
				break;
			}
		}
	}

}
