/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s9.ex2;

/**
 * Exercise: create a hierarchy of classes
 * <p>
 * Abstract base class
 */
public abstract class Person {
	/**
	 * Canonical constructor
	 * 
	 * @param firstName person first name
	 * @param lastName  person last name
	 */
	protected String firstName, lastName;

	protected Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + "]" + "[lastName=" + lastName + "]";
	}
}
