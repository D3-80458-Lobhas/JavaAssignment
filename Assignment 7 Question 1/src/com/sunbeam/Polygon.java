package com.sunbeam;

public abstract class Polygon extends BoundedShape {
	private int noOfSides;




	/**
	 * 
	 */
	public Polygon() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param noOfSides
	 */
	public Polygon(int noOfSides) {
		super();
		this.noOfSides = noOfSides;
	}


	/**
	 * @param x
	 * @param y
	 */
	public Polygon(int x, int y) {
		super(x, y);
			}


	@Override
	public abstract double calcArea();


	public int getNoOfSides() {
		return noOfSides;
	}


	public void setNoOfSides(int noOfSides) {
		this.noOfSides = noOfSides;
	}

		
	

}
