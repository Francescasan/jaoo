package com.example.jaoo.m8.Bingo;

import java.util.Random;

public class Cartella {
	protected int id = 0;
	protected int[][] elementi = new int[3][5];
	protected int[] copia = new int[3];
	public int[] presentiCartella = new int[15];

	public boolean fatto;

	public Cartella(Giocatore giocatore) {
		this.id = id + 1;
		this.setElementi(giocatore);
	}

//inserimento numeri nella cartella
	private void setElementi(Giocatore giocatore) {
		this.setPresenti(giocatore);
		int m = 0;
		for (int i = 0; i < 3; i = i + 1) {
			for (int j = 0; j < 5; j = j + 1) {
				elementi[i][j] = this.presentiCartella[m];
				copia[i] = 0;
				m++;
			}
		}

	}

	// verifica se un numero è presente nella cartella
	public boolean verifica(int num) {
		for (int i = 0; i < 3; i = i + 1) {
			for (int j = 0; j < 5; j = j + 1) {
				if (elementi[i][j] == num) {
					copia[i] = copia[i] + 1;
					return true;
				}

			}
		}
		return false;

	}

	// verifica cinquina
	public boolean checkCartella() {
		for (int i = 0; i < 1; i = i + 1) {
			for (int j = 0; j < 5; j = j + 1) {
				if (copia[i] == 5) {
					return true;
				}

			}
		}
		return false;
	}

	// generazione nuovo numero
	private int newElemento(Giocatore giocatore) {
		this.fatto = false;
		while (!fatto) {
			Random random = new Random();
			int number = random.nextInt(100);
			if (!this.numeroPresenteCartella(number)) {
				if (!giocatore.numeroPresente(number)) {
					return number;
				}
			}
		}
		return 0000;

	}

	// inserimento numero nel'array di appoggio
	private void setPresenti(Giocatore giocatore) {
		for (int i = 0; i < 15; i++) {
			int num = this.newElemento(giocatore);
			this.presentiCartella[i] = num;
			giocatore.setPresentiTotali(num);
		}
		presentiCartella = Cartella.MyInsertionSort(presentiCartella);
	}

	// verifica se il num è presente già nella cartella
	public boolean numeroPresenteCartella(int num) {
		int end = this.presentiCartella.length - 1;
		int start = 0;
		int index;
		while (start < end) {

			index = start + (end - start) / 2;
			if (this.presentiCartella[index] == num) {

				return true;
			} else if (this.presentiCartella[index] > num) {

				end = index - 1;

			} else {
				start = index + 1;

			}

		}

		return false;
	}

	private static int[] MyInsertionSort(int[] array) {

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

	public void getCartella() {
		System.out.print("--------------------------------");
		System.out.print("Cartella [id=" + id + "]");
		for (int i = 0; i < 3; i++) {
			System.out.print("--------------------------------");
			System.out.print("Riga " + i + "]" + "=");
			for (int j = 0; j < 5; j++) {
				System.out.print(" " + elementi[i][j] + "|");
			}
		}
		System.out.print("--------------------------------");
	}

	public int getId() {
		return this.id;
	}

}
