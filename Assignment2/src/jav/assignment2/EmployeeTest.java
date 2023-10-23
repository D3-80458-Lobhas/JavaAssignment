package jav.assignment2;

import java.util.Scanner;

public class EmployeeTest {

	Employee e1= new Employee();
	Employee e2= new Employee();
	static int menu() {
		int choice;
		System.out.println("1.Add Monthly Salary");
		System.out.println("2.Calculate Yearly Salary");
		choice = new Scanner(System.in).nextInt();
		return choice;
	};
	
		public static void main(String[] args) {
			Employee e1= new Employee();
			Employee e2= new Employee();
			Scanner sc = new Scanner(System.in);
			int choice;
			double amount=0;
			while (true)
				
			{
				choice=menu();
				switch(choice)
				{
				case 1: System.out.println("Enter Salary of First Employee");
				   		e1.setMonthlySalary(sc.nextDouble());
				   		System.out.println("Enter Salary of Second Employee");
				   		e2.setMonthlySalary(sc.nextDouble());
				   		break;
				
				case 2: e1.calculateYearlySalary();
						e2.calculateYearlySalary();
						break;
				
				default:System.out.println("Invalid Choice");
						break;
				}
			}
					
		}
		
	}


