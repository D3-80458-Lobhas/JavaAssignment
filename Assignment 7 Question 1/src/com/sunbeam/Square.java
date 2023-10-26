package com.sunbeam;

public class Square extends Polygon {
	private int side;

	@Override
	public String toString() {
		return "Square [side=" + side + ", calcArea()=" + calcArea() + "]";
	}

	/**
	 * @param side
	 */
	public Square(int side) {
		super();
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public double calcArea() {
		double area=side*side;
		return area;
	}

}
