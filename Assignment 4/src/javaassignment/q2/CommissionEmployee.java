package javaassignment.q2;

public class CommissionEmployee extends Employee {
	private int grossSales;
	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName, int sSN, int grossSales, double commissionRate) {
		super(firstName, lastName, sSN);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public int getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	@Override
	double earnings() {
		double earning=0;
		earning=commissionRate+grossSales;
		return earning;
	}

	@Override
	public String toString() {
		return "ComissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", earnings()="
				+ earnings() + "]";
	}

}
