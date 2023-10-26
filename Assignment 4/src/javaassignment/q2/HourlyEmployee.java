package javaassignment.q2;

public class HourlyEmployee extends Employee {
	private int wage;
	private int hours;
	public HourlyEmployee(String firstName, String lastName, int sSN) {
		super(firstName, lastName, sSN);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hours=" + hours + ", earnings()=" + earnings() + "]";
	}

	public HourlyEmployee(String firstName, String lastName, int sSN, int wage, int hours) {
		super(firstName, lastName, sSN);
		this.wage = wage;
		this.hours = hours;
	}

	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	double earnings() {
		double earnings=0;
		if (hours<=40)
			earnings=wage*hours;
		else if(hours>40)
		{
			earnings=40*wage +(hours-40)*wage*1.5;
		}
		return earnings;
	}

}
