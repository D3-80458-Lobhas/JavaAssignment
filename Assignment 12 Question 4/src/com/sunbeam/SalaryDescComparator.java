package com.sunbeam;

import java.util.Comparator;

public class SalaryDescComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		int diff;
		diff= Double.compare(e1.getSalary(), e2.getSalary());
		return -diff;
	}

	
}
