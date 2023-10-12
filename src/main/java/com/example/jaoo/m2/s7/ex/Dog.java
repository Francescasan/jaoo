/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s7.ex;

/**
 * Override exercise
 * 
 * Any class derives from Object, implicitly or explicitly
 */

public class Dog {
	private String name;
	private String owner;
	private int age;

	// TODO: override toString()
	public Dog(String name, String owner, int age) {
		this.name = name;
		this.owner = owner;
		this.age = age;
	}

	@Override
	public String toString() {
		return "The name of the dog is " + this.name + ". The age of the dog is " + this.age
				+ ". The owner of the dog is " + this.owner;
	}

}
