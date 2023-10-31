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


	public int getSide1() {
		return side1;
	}


	public void setSide1(int side1) {
		this.side1 = side1;
	}


	public int getSide2() {
		return side2;
	}


	public void setSide2(int side2) {
		this.side2 = side2;
	}


	public int getSide3() {
		return side3;
	}


	public void setSide3(int side3) {
		this.side3 = side3;
	}


	/**
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Triangle(int side1, int side2, int side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

}
