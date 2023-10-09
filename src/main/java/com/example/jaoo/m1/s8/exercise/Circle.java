/*
 * Introduction to OOP with Java

 * 
 * https://github.com/egalli64/jaoo
 */

package com.example.jaoo.m1.s8.exercise;

//import java.lang.Math; da me
/**
 * Complete the code
 * 
 * @see Main the user class
 */
public class Circle {
	// TODO: every circle should have its own radius
	private double radius;
	private double area;
	private double paramiter;

	/**
	 * Constructor
	 * 
	 * @param radius the circle radius
	 */
	public Circle(double radius) {
		// TODO: initialize the current circle radius
		this.radius = radius;
	}

	/**
	 * The circle area is π * radius ^ 2
	 * 
	 * @return the circle area
	 */
	public double area() {
		double power = 2;
		area = Math.PI * radius;
		area = Math.pow(area, power);
		return area;

		// throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * The circle area is 2 * π * radius
	 * 
	 * @return the circle perimeter
	 */
	public double perimeter() {
		paramiter = Math.PI * radius * 2;
		return paramiter;
		// throw new UnsupportedOperationException("Not yet implemented");
	}
}
