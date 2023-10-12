package com.example.jaoo.m8.Bingo;

public class Giocatore extends Utente {

	private Cartella[] cartelle;
	// "presenti" è un array che contiene tutti i numeri presenti nelle cartelle del
	// giocatore
	private int[] presenti = new int[90];
	private int numeroCartelle;
	private int numNumeri = 0;

	public Giocatore(String nome, int numeroCartelle) {
		super(nome);
		if (numeroCartelle < 6) {
			this.numeroCartelle = numeroCartelle;
			this.cartelle = new Cartella[numeroCartelle];

		} else {
			this.cartelle = new Cartella[numeroCartelle];

		}

	}

	public void generazioneCartella() {
		for (int i = 0; i < this.cartelle.length; i++) {
			Cartella cartella = new Cartella(this);
			cartelle[i] = cartella;
		}
	}

	public boolean verificaCartelle(int num) {
		for (int i = 0; i < this.cartelle.length; i++) {
			if (cartelle[i].verifica(num)) {
				System.out.print("il numero  " + num + "  è presente nella cartella    " + cartelle[i].getId()
						+ " del giocatore di nome: " + this.nome);
				if (cartelle[i].checkCartella()) {
					System.out.print("Bingoooo!! con la cartella    " + cartelle[i].getId() + " sono il  giocatore : "
							+ this.nome);
					return true;
				}

			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Giocatore [name=" + nome + "]";
	}

	// inserimento nell'array "presenti" del nuovo numero;
	public void setPresentiTotali(int num) {

		this.presenti[numNumeri] = num;
		presenti = this.InsertionSort(presenti);
		this.numNumeri++;

	}

	// verifica se il num è presente già in una cartella del giocatore
	public boolean numeroPresente(int num) {
		int end = this.presenti.length - 1;
		int start = 0;
		int index;
		while (start < end) {

			index = start + (end - start) / 2;
			if (this.presenti[index] == num) {

				return true;
			} else if (this.presenti[index] > num) {

				end = index - 1;

			} else {
				start = index + 1;

			}

		}

		return false;
	}

	private static int[] InsertionSort(int[] array) {

		int j, temp, i;
		for (i = 0; i < array.length; i++) {
			temp = array[i];
			j = i - 1;
			while (j >= 0 && array[j] > temp) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = temp;

		}
		return array;
	}

}