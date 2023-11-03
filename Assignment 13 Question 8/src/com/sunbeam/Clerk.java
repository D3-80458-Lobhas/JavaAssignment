/*Create another class Clerk (with ﬁeld salary) inherited from Emp interface. In this class override getSal() method (salary). Do
not override, calcIncentives() in Clerk class. 
*/
package com.sunbeam;

public class Clerk implements Employee {
	private double salary;
	
	public Clerk() {
		// TODO Auto-generated constructor stub
	}

	public Clerk(double salary) {
		super();
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Clerk [salary=").append(salary).append("]");
		return builder.toString();
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double getSal() {
		return salary;
	}

}
