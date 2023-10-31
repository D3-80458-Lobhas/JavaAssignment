package com.sunbeam;

public abstract class BoundedShape {
	int x;
	int y;
	double PI=3.1415;
	
	public BoundedShape() {
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	public BoundedShape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract double calcArea();
}
