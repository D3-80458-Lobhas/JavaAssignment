package javaassignment.q2;

public class Employee {
	String firstName;
	String lastName;
	double monthlySalary;
	public Employee() {
		this("","",0);
	}
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	public void calculateYearlySalary()
	{
		if(monthlySalary<0)
			System.exit(0);
		System.out.println("The yearly Salary is"+ monthlySalary*12);
	}
	
	public void giveRaise() {
		System.out.println("The Previous yearly Salary is"+ monthlySalary*12);
		double monthlySalary = this.getMonthlySalary();
		this.setMonthlySalary((0.1 * monthlySalary) + monthlySalary);
		System.out.println("Given 10% raise successfully");
		System.out.println("The Raised yearly Salary is"+ monthlySalary*12);
	}
	
	}