/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s3.ex;

import java.util.Arrays;

/**
 * Exercise: create a few cats and let them meow accordingly to requests
 */
public class Main {
	/**
	 * Follow the instructions in the "to do" comments.
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		String[] names = { "Tom", "Bob", "Kit", "Zip", "Kit" };
		String[] colors = { "blue", "green", "yellow", "black", "blue" };

		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(colors));

		// TODO: (1) create an array of cats, same size of the arrays above
		Cat[] cats = new Cat[names.length];
		for (int i = 0; i < names.length; i++) {
			Cat cat = new Cat(names[i], colors[i]);
			cats[i] = cat;
		}

		System.out.printf("The array of cats has %d length%n", cats.length);

		// TODO: (2) initialize the cats array
		// each cat should have name and color from the arrays above

		System.out.printf("Currently there are %d cats in the program%n", Cat.getCount());

		// TODO: (3) each cat should meow
		for (int i = 0; i < cats.length; i++) {

			cats[i].meow();
		}

		// TODO: (4) each cat named Kit should meow
		for (int i = 0; i < cats.length; i++) {

			if (cats[i].getName().equals("Kit")) {
				cats[i].meow();
			}
		}

		// TODO: (5) only the first cat named Kit should meow
		for (int i = 0; i < cats.length; i++) {

			if (cats[i].getName().equals("Kit")) {
				cats[i].meow();
				break;
			}
		}
		// TODO: (6) only the cats in even position should meow
		for (int i = 0; i < cats.length; i += 2) {

			cats[i].meow();

		}
	}
}
