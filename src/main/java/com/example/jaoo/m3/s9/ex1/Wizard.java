package com.example.jaoo.m3.s9.ex1;

import java.util.Random;

public class Wizard extends Actor {

	protected Wizard(String name, int level) {
		super(name, level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean fight(Actor enemy) {
		if (enemy instanceof Warrior) {
			return true;
		} else {
			if (this.getLevel() > enemy.getLevel()) {
				return true;
			} else if (this.getLevel() < enemy.getLevel()) {
				return false;
			} else {
				Random rd = new Random();
				return rd.nextBoolean();
			}
		}
	}

	@Override
	public String toString() {
		return "Wizard [name=" + name + "]" + "[state=" + stateActor + "]" + "[magicLevel=" + level + "]";
	}

}