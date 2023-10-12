/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s9.ex1;

/**
 * Exercise: create a hierarchy of classes
 * 
 * Abstract base class
 */
public abstract class Actor {
	/**
	 * Canonical constructor
	 * 
	 * @param name the actor name
	 */
	protected String name;
	protected int level = 0;

	protected enum state {
		live, died
	};

	protected state stateActor;
	protected state var = state.live;

	protected Actor(String name, int level) {
		// TODO
		this.name = name;
		this.level = level;
		this.stateActor = state.live;

	}

	/**
	 * Fight against an enemy
	 * 
	 * @param enemy another actor
	 * @return true if the current actor wins
	 */
	public abstract boolean fight(Actor enemy);

	public int getLevel() {
		return level;
	}

	public String getName() {
		return name;
	}

	public state getState() {
		return stateActor;
	}

	public boolean getStateBoolean() {
		if (stateActor.equals(var)) {
			return true;
		}
		return false;
	}

	protected void updateState() {
		stateActor = state.died;
	}

	@Override
	public String toString() {
		return "Actor [name=" + name + "]" + "[state=" + stateActor + "]" + "[Level=" + level + "]";
	}
}
