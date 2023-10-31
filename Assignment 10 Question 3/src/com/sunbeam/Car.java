package com.sunbeam;

public class Car implements Displayable {
	private String name;
	private double price;
	public Car(String name, double price) {
		this.name = name;
		this.price = price;
	}
	// ...
	public void display() {
		System.out.printf("Name: %s, Price: %.2f\n", this.name, this.price);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [name=").append(name).append(", price=").append(price).append("]");
		return builder.toString();
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public Car get() {
		
		return this;
	}
}
