package com.example.jaoo.m3.s9.ex2;

public class Employee extends Person {
	protected int salary;

	protected Employee(String firstName, String lastName, int salary) {
		super(firstName, lastName);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + "]" + "[lastName=" + lastName + "]" + "[monthly salary=" + salary
				+ "]";
	}
}