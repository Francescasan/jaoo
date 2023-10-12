package com.example.jaoo.m3.s9.ex2;

public class Consultant extends Person {
	protected int fee;

	protected Consultant(String firstName, String lastName, int fee) {
		super(firstName, lastName);
		this.fee = fee;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Consultant [firstName=" + firstName + "]" + "[lastName=" + lastName + "]" + "[daily fee=" + fee + "]";
	}
}