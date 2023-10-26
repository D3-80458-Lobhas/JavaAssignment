package javaassignment.q2;

import java.util.Scanner;
public class Tester {


		public static int menu(Scanner sc) {
			int choice = 0;
			System.out.println("0. EXIT");
			System.out.println("1. CREATE EMPLOYEE ");
			System.out.println("2. DISPLAY EARNINGS");
			System.out.println("3. REWARD SALARIED COMMISSION EMPLOYEES");
			choice = sc.nextInt();
			return choice;
		}

		public static int employeeChoice(Scanner sc) {
			int choice = 0;
			System.out.println("Enter the employee to be created ");
			System.out.println("1. SALARIED EMPLOYEE");
			System.out.println("2. HOURLY EMPLOYEE");
			System.out.println("3. COMMISSION EMPLOYEE");
			System.out.println("4. BASEPLUS COMMISSION EMPLOYEE");
			choice = sc.nextInt();
			return choice;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of the organisation :- ");
			int organizationSize = sc.nextInt();
			Employee[] employees = new Employee[organizationSize];
			int counter = 0;
			boolean flag = true;
			int menuValue = 0;
			int empChoice = 0;
			while(flag) {
				menuValue = menu(sc);
				switch(menuValue) {
				case 0:{
					flag = false;
					break;
				}
				case 1:{
					empChoice = employeeChoice(sc);
					if(counter < employees.length) {
						if(empChoice == 1) {
							System.out.println("Enter FIRSTNAME,LASTNAME,SSN,WEEKLY SALARY");
							employees[counter++] = new SalariedEmployee(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());
						}
						else if(empChoice == 2) {
							System.out.println("Enter FIRSTNAME,LASTNAME,SSN,HOURLYWAGE,HOURSWORKED");
							employees[counter++] = new HourlyEmployee(sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
						}
						else if(empChoice == 3) {
							System.out.println("Enter FIRSTNAME,LASTNAME,SSN,GROSS SALES ,COMMISSION RATE");
							employees[counter++] = new CommissionEmployee(sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
						}
						else if(empChoice == 4) {
							System.out.println("Enter FIRSTNAME,LASTNAME,SSN,GROSS SALES ,COMMISSION RATE,BASE SALARY");
							employees[counter++] = new BasePlusCommissionEmployee(sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextDouble(),sc.nextInt());
						}
						else {
							System.out.println("Invalid choice ... :(");
						}
					}
					else {
						System.out.println("Organisation size full ");
					}
					break;
				}
				case 2:
					System.out.println("Enter SSN NUMBER OF THE EMPLOYEE");
					int ssnNUmber = sc.nextInt();
					for(int i = 0 ; i < counter ; i++) {
						if(employees[i].getSSN() == ssnNUmber) {
							if(employees[i] instanceof SalariedEmployee) {
								System.out.println(((SalariedEmployee)employees[i]).earnings());
							}
							else if(employees[i] instanceof HourlyEmployee) {
								System.out.println(((HourlyEmployee)employees[i]).earnings());
							}
							else if(employees[i] instanceof CommissionEmployee) {
								System.out.println(((CommissionEmployee)employees[i]).earnings());
							}
							else{
								System.out.println(((BasePlusCommissionEmployee)employees[i]).earnings());
							}
						} 
					}
					break;
				
				case 3:{
					for(int i = 0 ; i < counter ; i++) {
						if(employees[i] instanceof BasePlusCommissionEmployee) {
							((BasePlusCommissionEmployee)employees[i]).setBaseSalary(((BasePlusCommissionEmployee)employees[i]).getBaseSalary() + (0.1 * ((BasePlusCommissionEmployee)employees[i]).getBaseSalary()));
						}
					}
					System.out.println("Rewarded successfully ...");
					break;
				}
				}
				sc.nextLine();
			}
			sc.close();
		}
}
