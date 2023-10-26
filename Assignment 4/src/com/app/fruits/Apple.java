package com.app.fruits;

public class Apple extends Fruit {

	public Apple() {
		
	}

	@Override
	public String toString() {
		return  taste() +super.toString();
	}

	public Apple(String color, double weight, String name) {
		super(color, weight, name);
	}

	public String taste()
	{
		return "sweet n sour";
	}
}
