/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5.ex;

import java.util.logging.Logger;

/**
 * TODO: is-a Vehicle and Conditioning
 */
public class Car extends Vehicle implements Conditioning {
	private static final Logger log = Logger.getGlobal();
	private String condition;
	private int temp;

	/**
	 * No-arg constructor
	 */
	public Car() {
		log.info("Car created");
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

	@Override
	public void seTemperature(int temp) {
		this.temp = temp;
		System.out.println("Temperature Car" + temp);
	}

}
