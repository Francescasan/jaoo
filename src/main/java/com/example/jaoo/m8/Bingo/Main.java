package com.example.jaoo.m8.Bingo;

public class Main {
	public static void main(String[] args) {

		boolean var = false;
		Banchista tom = new Banchista("Rocco");

		Giocatore[] giocatori = { new Giocatore("Francesca", 3), new Giocatore("Alessia", 6),
				new Giocatore("Mattia", 6), new Giocatore("Camillo", 1), new Giocatore("Martina", 10), };
		for (int i = 0; i < giocatori.length; i++) {
			giocatori[i].generazioneCartella();
		}
		while (!var) {
			int num = tom.estrazioneNumero();
			for (int i = 0; i < giocatori.length; i++) {
				var = giocatori[i].verificaCartelle(num);
			}
		}

	}
}