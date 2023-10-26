package com.sunbeam;

public class Rectangle extends Polygon {
private int length;
private int breadth;


	/**
 * @param noOfSides
 * @param length
 * @param breadth
 */
public Rectangle(int noOfSides, int length, int breadth) {
	super(noOfSides);
	this.length = length;
	this.breadth = breadth;
}


	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public double calcArea() {
		double area=length*breadth;
		return area;
	}

}
