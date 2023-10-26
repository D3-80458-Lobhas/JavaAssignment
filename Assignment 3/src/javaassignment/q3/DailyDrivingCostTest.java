package javaassignment.q3;

import java.util.Scanner;

public class DailyDrivingCostTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DailyDrivingCost dailyCost=new DailyDrivingCost();
		System.out.println("Enter the Total Miles Driven Per Day");
		dailyCost.setTotalMiles(sc.nextInt());
		System.out.println("Enter the cost per gallon");
		dailyCost.setCostPerGallon(sc.nextInt());
		System.out.println("Enter the Average Miles per gallon");
		dailyCost.setAverageMilesPerGallon(sc.nextInt());
		System.out.println("Enter the Parking Fees");
		dailyCost.setParkingFees(sc.nextInt());
		System.out.println("Enter the Toll Fees");
		dailyCost.setTollsPerDay(sc.nextInt());
		dailyCost.calculateDailyDrivingCost();
	}

}
