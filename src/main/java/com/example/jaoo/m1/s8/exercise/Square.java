/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s8.exercise;

/**
 * Complete the code
 * 
 * @see Main the user class
 */
public class Square {
	// TODO: every square should have its own side length
	private double side;
	private double area;
	private double perimeter;

	/**
	 * Constructor
	 * 
	 * @param side the square side
	 */
	public Square(double side) {
		// TODO: initialize the current side length
		this.side = side;
	}

	/**
	 * The square area is side ^ 2
	 * 
	 * @return the square area
	 */
	public double area() {
		area = Math.pow(side, 2);

		return area;

		// throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * The square perimeter is 4 * side
	 * 
	 * @return the square perimeter
	 */
	public double perimeter() {
		perimeter = side * 4;
		return perimeter;

		// throw new UnsupportedOperationException("Not yet implemented");
	}
}
