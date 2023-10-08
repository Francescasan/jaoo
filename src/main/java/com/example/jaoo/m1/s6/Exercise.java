/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s6;

/**
 * This exercise should be solved using a method in a primitive wrapper
 */
public class Exercise {
	/**
	 * See requests in the "to do" comments
	 * 
	 * @param args used to test the code
	 */
	public static void main(String[] args) {
		int count = 0;
		if (args.length != 1) {
			System.out.println("Pass me one argument!");
		} else {

			for (int i = 0; i < args[0].length(); i++) {
				Character character = Character.valueOf(args[0].charAt(i));
				if (Character.isDigit(character)) {
					count++;
				}
			}
			// TODO (2) check if the argument contains at least one digit
			if (count >= 1) {
				System.out.println("the argument contains at least one digit");
			}

			// TODO (1) check if the argument contains only digits
			if (count == args[0].length()) {
				System.out.println("the topic contains only digits");
			}

			System.out.println("Done");
		}
	}
}
