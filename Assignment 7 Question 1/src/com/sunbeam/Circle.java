package com.sunbeam;

public class Circle extends BoundedShape {

	private int radius;
	public Circle() {
	}
	
	@Override
	public double calcArea() {
		double area;
		area=PI*radius*radius;
		return area;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	
}
