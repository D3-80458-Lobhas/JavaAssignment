package com.subeam;

import java.util.Objects;
import java.util.Scanner;

//Perform add, delete, ﬁnd, sort, edit functionality in a menu driven program.
public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private double salary;
	
	public Employee() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return id == other.id;// && Objects.equals(name, other.name)
		//		&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
		}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=").append(id).append(", name=").append(name).append(", salary=").append(salary)
				.append("]");
		return builder.toString();
	}

	public void acceptData(Scanner sc)
	{
		System.out.println("Enter the ID");
		this.id = sc.nextInt();
		System.out.println("Enter the Name");
		this.name = sc.next();
		System.out.println("Enter the Salary");
		this.salary = sc.nextDouble() ;
		
	}

	@Override
	public int compareTo(Employee e) {
		return this.id-e.id;
		
	}
}
