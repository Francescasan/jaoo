/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s9.ex1;

/**
 * Exercise: create a hierarchy of classes based on Actor
 * <p>
 * Warrior: could fight, can't do any magic
 * <p>
 * Wizard: can't fight, could do magic
 */
public class Main {
	/**
	 * Create a bunch of actors
	 * <p>
	 * Let them fight against each others
	 * <p>
	 * Peer-to-peer fight, the most skilled one wins
	 * <p>
	 * Wizards always beat warriors
	 * <p>
	 * In the end, let the user knows who survived
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		int i = 0;
		// TODO: create actors, both warriors and wizards
		/*
		 * Actor[] actors = { new Warrior("Zeus",10), new Warrior("Meconecr",100), new
		 * Warrior("Martin",100), new Wizard("Apollo", 1000), new Wizard("Apollo6",
		 * 1000), new Wizard("Apollo2", 1000), new Wizard("Apollo3", 100) };
		 */
		/*
		 * Actor[] actors = { new Warrior("Zeus", 10), new Wizard("Apollo6", 10), new
		 * Warrior("Meconecr", 10), new Wizard("Apollo2", 10), new Warrior("Martin",10),
		 * new Wizard("Apollo", 10), new Wizard("Apollo3", 10) };
		 */
		Actor[] actors = { new Warrior("Zeus", 10), new Wizard("Apollo6", 1000), new Warrior("Meconecr", 100),
				new Wizard("Apollo2", 10000), new Warrior("Martin", 100), new Wizard("Apollo", 1000),
				new Wizard("Apollo3", 100) };

		System.out.println(" List of actors before the battle");
		for (Actor actor : actors) {
			System.out.println(actor.toString());
		}
		System.out.println("\r\n");
		System.out.println("Let's fight ...");
		for (Actor actor : actors) {
			for (Actor actor1 : actors) {
				if (!actor.equals(actor1)) {
					if (actor.getStateBoolean() && actor1.getStateBoolean()) {
						i += 1;
						System.out.println("Round" + " " + i);
						if (!actor.fight(actor1)) {

							System.out.println("il vincitore è" + " " + actor1.getName() + " " + "il perdente è " + " "
									+ actor.getName());

						} else {

							System.out.println("il vincitore è" + " " + actor.getName() + " " + "il perdente è " + " "
									+ actor1.getName());
						}

					}
				}
			}
		}
		System.out.println("\n");
		System.out.println("List of actors after the battle");
		for (Actor actor : actors) {
			System.out.println(actor.toString());
		}
		System.out.println("\r\n");
		System.out.println("The winner is ...");
		for (Actor actor : actors) {
			if (actor.getStateBoolean()) {
				System.out.println(actor.toString());
			}
		}
	}
}
