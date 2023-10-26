package javaassignment.q2;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;

	public double getBaseSalary() {
		return baseSalary;
	}

	public BasePlusCommissionEmployee(String firstName, String lastName, int sSN, int grossSales, double commissionRate,
			int baseSalary) {
		super(firstName, lastName, sSN, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "BasePlusComissionEmployee [baseSalary=" + baseSalary + ", earnings()=" + earnings() + "]";
	}

	@Override
	double earnings() {
		return super.earnings()+baseSalary;
	}
	
	

}
