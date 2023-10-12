package com.example.jaoo.m3.s9.ex1;

import java.util.Random;

public class Warrior extends Actor {

	protected Warrior(String name, int level) {
		super(name, level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean fight(Actor enemy) {
		if (enemy instanceof Wizard) {
			return false;
		} else {
			if (this.getLevel() > enemy.getLevel()) {
				return true;
			} else if (this.getLevel() < enemy.getLevel()) {
				return false;
			} else {
				boolean result;
				Random rd = new Random();
				result = rd.nextBoolean();
				if (result) {
					enemy.updateState();
					return result;
				} else {
					this.updateState();
					return result;
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Warrior [name=" + name + "]" + "[state=" + stateActor + "]" + "[fighterLevel=" + level + "]";
	}

}