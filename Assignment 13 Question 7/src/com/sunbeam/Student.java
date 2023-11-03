package com.sunbeam;

import java.util.Scanner;

public class Student {
	private int roll;
	private String name;
	private int marks;
	Student(){}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [roll=").append(roll).append(", name=").append(name).append(", marks=").append(marks)
				.append("]");
		return builder.toString();
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + roll;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (roll != other.roll)
			return false;
		return true;
	}
	
}
