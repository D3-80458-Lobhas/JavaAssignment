package com.sunbeam;

public class Tester {


	public static void main(String[] args) {
		Employee[] arr = {
				new Manager(4000, 2000),
				new Labor(400,5),
				new Clerk(900),
				};
			double totalIncome = Employee.calcTotalIncome(arr);
			System.out.println("Total Income : " + totalIncome);
	}

}
