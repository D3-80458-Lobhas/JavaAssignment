package javaassignment.q1;

import java.util.Scanner;

public class CreditLimitTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CreditLimit CreditLimit = new CreditLimit();
		
		System.out.print("Enter the account No : ");
		CreditLimit.setAccno(sc.nextInt());
		System.out.print("Enter the pending balance at the beginning of the month : ");
		CreditLimit.setPendingBal(sc.nextInt());
		System.out.print("Enter Total of all items charged by the customer this month : ");
		CreditLimit.setItemsCharged(sc.nextInt());
		System.out.print("Enter total of all credits applied to the customer's account this month : ");
		CreditLimit.setCreditApplied(sc.nextInt());
		System.out.print("Enter allowed credit Limit : ");
		CreditLimit.setCreditAllowed(sc.nextInt());
		CreditLimit.displayBalance();
		
	}
}
