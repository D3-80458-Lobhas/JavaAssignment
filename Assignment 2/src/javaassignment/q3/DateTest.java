package javaassignment.q3;

import java.util.Scanner;

public class DateTest {

	static int menu() {
		int choice;
		System.out.println("0. EXIT");
		System.out.println("1. Enter Date");
		System.out.println("2. Display Date");
		choice = new Scanner(System.in).nextInt();
		return choice;
	};	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d1 = new Date();
		
	    int choice = 0;
        while(true) {	
	    	choice = menu();
	    	if(choice == 0) {
	    		break;
	    	}
	    	switch(choice) {
	    	    case 1:
	    	    	System.out.println("Enter Day ,Month,Year");
	    	    	d1.setDay(sc.nextInt());
	    	    	d1.setMonth(sc.nextInt());
	    	    	d1.setYear(sc.nextInt());
	    	    break;
	    	    case 2:
	    	    	d1.displayDate();
	    	    	break;
	    	    	
	    	    	
	}

}
	}
}
