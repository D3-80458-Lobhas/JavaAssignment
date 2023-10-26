package com.sunbeam;

public class Triangle extends Polygon {

	private int side1;
	private int side2;
	private int side3;

	
	@Override
	public double calcArea() {
		double s;
		double area;
		s=(side1+side2+side3)/2;
		
		area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}

}
