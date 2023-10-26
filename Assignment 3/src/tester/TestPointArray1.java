package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static int menu(Scanner sc)
	{
		int choice;
		System.out.println("1.Display Details ");
		System.out.println("2.Display x,y Coordinates of all points");
		System.out.println("3.Display distance between 2 points");
		System.out.println("4.Exit");
		System.out.println("Enter Your Choice");
		choice=sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size of Basket");
		int size=sc.nextInt();
		Point2D[] points =new Point2D[size];
		for(int i=0;i<size ; i++)
		{
			points[i] = new Point2D();
			
		}
		for(int i=0;i<size ; i++)
		{
			System.out.println("Enter Point-"+ (i+1) +" : ");
			points[i].setX(sc.nextInt());
			points[i].setY(sc.nextInt());
		}
		
		while(true)
		{
			int choice = menu(sc);
			
			switch (choice) {
			case 1:
				System.out.print("Enter the Point no. to display point : ");
				int index= sc.nextInt();
				System.out.println("-------------------------------");
				if(index<=size)
					System.out.println(points[index-1].toString());
				else
					System.out.println("Invalid Input, plz retry!!");
				System.out.println("-------------------------------");
				break;
				
			case 2:
				System.out.println("-------------------------------");
				for(int i=0; i<size; i++)
				{	
					
					System.out.println("Point-"+(i+1)+" : "+points[i].toString());
				}
				System.out.println("-------------------------------");
				break;
				
			case 3:
				System.out.println("Enter two index to find distance : ");
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				System.out.println("-------------------------------");
				if((a>=0 && a<=size ) && (b>=0 && b<=size )) 
				{
					if(points[a].isEqual(points[b]))
					{
						System.out.println("The given points are equal, distance is zero.");
					}
					else
					{
						System.out.println("Distance betwneen Point-"+ a + " and Point-"+ b+ " = " + points[a].calculateDistance(points[b]));
						
					}
				}
				else
				{
					System.out.println("Enter valid Index !!!!");
				}
				System.out.println("-------------------------------");
				break;
				
			case 4:
				System.out.println("Thank you !!!");
				System.exit(0);
				break;

			default:
				break;
			}
		}
		
	}

}
