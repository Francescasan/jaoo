package com.example.jaoo.m8.Bingo;

public abstract class Utente {

	protected String nome;

	public Utente(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Actor [name=" + nome + "]";
	}

}
