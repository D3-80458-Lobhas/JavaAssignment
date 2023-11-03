package com.sunbeam;

import java.util.Scanner;

public class Labor implements Employee{
	private int hours;
	private double rate;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Labor [hours=").append(hours).append(", rate=").append(rate).append("]");
		return builder.toString();
	}

	public Labor() {}
	public Labor(int hours, double rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public double getSal() {
			return hours*rate;
	}
	
	public double calcIncentives(Scanner sc)
	{
		double inc;
		if(hours>300)
			inc=0.05*getSal();
		else 
			inc=0;
		return inc;
	}
}
