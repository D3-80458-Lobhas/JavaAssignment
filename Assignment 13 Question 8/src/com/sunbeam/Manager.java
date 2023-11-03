//Create a class Manager (with ﬁelds basicSalary and dearanceAllowance) inherited from Emp.
//In this class override getSal() method
//(basicSalary + dearanceAllowance) as well as calcIncentives() method (20% of basicSalary). 
package com.sunbeam;

public class Manager implements Employee{
	private double basicSalary;
	private double dearanceAllowance;
	public Manager() {
	}
	
	public Manager(double basicSalary, double dearanceAllowance) {
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}
	@Override
	public double getSal() {
		
		return basicSalary+dearanceAllowance;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getDearanceAllowance() {
		return dearanceAllowance;
	}

	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Manager [basicSalary=").append(basicSalary).append(", dearanceAllowance=")
				.append(dearanceAllowance).append("]");
		return builder.toString();
	}
	public double calcIncentives()
		{
			return 0.2*basicSalary;
		}
		
	}


