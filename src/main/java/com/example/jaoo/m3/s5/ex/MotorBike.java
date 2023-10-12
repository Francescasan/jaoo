/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.logging.Logger;

/**
 * TODO: MotorBike is-a Vehicle
 */
public class MotorBike extends Vehicle {
	private static final Logger log = Logger.getGlobal();
	private String condition;
	private int temp;

	/**
	 * No-arg constructor
	 */
	public MotorBike() {
		log.info("MotorBike created");
	}

	@Override
	public void steer(String condition) {
		this.condition = condition;
		System.out.println("steer busss" + condition);
	}

	@Override
	public void brake() {

		System.out.print("brake bussss");
	}

}
