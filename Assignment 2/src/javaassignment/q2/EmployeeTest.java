package javaassignment.q2;

import java.util.Scanner;

public class EmployeeTest {

	Employee e1= new Employee();
	Employee e2= new Employee();
	static int menu() {
		int choice;
		System.out.println("0. EXIT");
		System.out.println("1. Give Raise");
		System.out.println("2. Display Employee Salary");
		choice = new Scanner(System.in).nextInt();
		return choice;
	};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first employee details:FIRSTNAME,LASTNAME,MONTHLYSALARY");
	    Employee e1 = new Employee(sc.next(),sc.next(),sc.nextDouble());
	    
	    System.out.println("Enter second employee details:FIRSTNAME,LASTNAME,MONTHLYSALARY");
	    Employee e2 = new Employee(sc.next(),sc.next(),sc.nextDouble());
        int choice = 0;
        int employeeChoice = 0;
	    while(true) {
	    	choice = menu();
	    	if(choice == 0) {
	    		break;
	    	}
	    	switch(choice) {
	    	    case 1:{
	    	    	System.out.println("Select Employee :1.Employee01 , 2.Employee02");
	    	    	employeeChoice = sc.nextInt();
	    	    	if(employeeChoice == 1) {
	    	    		e1.giveRaise();
	    	    	}
	    	    	else {
	    	    		e2.giveRaise();
	    	    	}
	    	    	break;
	    	    }
                case 2:{
	    	    	System.out.println("Select Employee to display salary:1.Employee01 , 2.Employee02");
	    	    	employeeChoice = sc.nextInt();
	    	    	if(employeeChoice == 1) {
	    	    		e1.calculateYearlySalary();
	    	    	}
	    	    	else {
	    	    		e2.calculateYearlySalary();
	    	    	}
	    	    	break;
	    	    }
	    	}
	    	
	    }
	    
	}

}