/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.logging.Logger;

/**
 * Base of a class hierarchy
 * <P>
 * TODO: it should steer left/right, it should brake
 */
public class Vehicle {
	private static final Logger log = Logger.getGlobal();
	private String condition;

	/**
	 * No-arg constructor
	 */
	public Vehicle() {
		log.info("Vehicle created");
	}

	public void steer(String condition) {
		this.condition = condition;
		System.out.println("steer Vehicle" + condition);
	}

	public void brake() {

		System.out.print("brake Vehicle");
	}
}
