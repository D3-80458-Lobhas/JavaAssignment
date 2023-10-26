package com.app.fruits;

public class Mango extends Fruit {

	public Mango() {
		
	}

	public Mango(String color, double weight, String name) {
		super(color, weight, name);
		
	}
	public String taste()
	{
		return "sweet";
	}

	@Override
	public String toString() {
		return taste() +super.toString();
	}
}
