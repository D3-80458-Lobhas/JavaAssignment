package jav.assignment2;

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
		System.out.println("The yearly Salary is"+ monthlySalary*12*0.1);
	}
}
