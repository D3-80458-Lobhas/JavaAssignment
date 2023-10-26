package javaassignment.q2;

public class SalariedEmployee extends Employee {
	private double weeklysalary;


	public SalariedEmployee(String firstName, String lastName, int sSN, double weeklysalary) {
		super(firstName, lastName, sSN);
		this.weeklysalary = weeklysalary;
	}


	public double getWeeklysalary() {
		return weeklysalary;
	}


	public void setWeeklysalary(double weeklysalary) {
		this.weeklysalary = weeklysalary;
	}


	@Override
	public double earnings() {
		
	}

}
