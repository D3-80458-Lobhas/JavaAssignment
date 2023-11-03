package com.sunbeam;

public interface Employee {
	public double getSal();
	default double calcIncentives()
	{
		return 0.0;
	}
	static double calcTotalIncome(Employee arr[])
	{
		double total = 0.0;
		for (Employee sh : arr)
			total += sh.getSal()+sh.calcIncentives();
		return total;
	}
}
