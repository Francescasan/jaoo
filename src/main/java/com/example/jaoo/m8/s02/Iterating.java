/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m8.s02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Iterable - Iterator
 */
public class Iterating {
	/**
	 * List, ArrayList, Iterable, Iterator
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		/*-
		 * create an immutable list of integers
		 * use it to create a mutable list of integer
		 * store the reference to the latter as an iterable
		 */
		var x = List.of(3, 6, 1, 9, 2);
		Iterable<Integer> iterable = new ArrayList<>(x);

		// Each concrete collection has a nice toString() override
		System.out.println("The iterable: " + iterable);

		// remove even values
		Iterator<Integer> it = iterable.iterator();
		while (it.hasNext()) {
			Integer current = it.next();
			if (current % 2 == 0) {
				it.remove();
			}
		}

		System.out.println("Only odd values survived: " + iterable);
	}
}
