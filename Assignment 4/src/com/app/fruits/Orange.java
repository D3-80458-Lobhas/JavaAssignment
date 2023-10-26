package com.app.fruits;

public class Orange extends Fruit {

	public Orange() {
		// TODO Auto-generated constructor stub
	}

	public Orange(String color, double weight, String name) {
		super(color, weight, name);
	}
	public String taste()
	{
		return "sour";
	}

	@Override
	public String toString() {
		return taste() +super.toString();
	}
}
