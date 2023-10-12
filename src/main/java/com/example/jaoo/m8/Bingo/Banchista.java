package com.example.jaoo.m8.Bingo;

import java.util.Random;

public class Banchista extends Utente {
	protected int[] numeriEstratti = new int[90];
	protected boolean fatto;
	protected int id = 0;

	public Banchista(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	// estrazione numero

	public int estrazioneNumero() {
		fatto = false;
		while (!fatto) {
			int num = this.newElemento();
			if (!this.verificaEstratto(num)) {
				numeriEstratti[id] = num;
				numeriEstratti = this.MyInsertionSortBanchista(numeriEstratti);
				this.id++;
				fatto = true;
				return num;
			}
		}
		return 00000;

	}

	// generazione nuovo numero
	private int newElemento() {
		this.fatto = false;
		while (!fatto) {
			Random random = new Random();
			int number = random.nextInt(100);
			if (!this.verificaEstratto(number)) {

				return number;

			}
		}
		return 0000;

	}

	// verifica se il num è presente già estratto
	public boolean verificaEstratto(int num) {
		int end = this.numeriEstratti.length - 1;
		int start = 0;
		int index;
		while (start < end) {

			index = start + (end - start) / 2;
			if (this.numeriEstratti[index] == num) {

				return true;
			} else if (this.numeriEstratti[index] > num) {

				end = index - 1;

			} else {
				start = index + 1;

			}

		}

		return false;
	}

	private static int[] MyInsertionSortBanchista(int[] array) {

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

	@Override
	public String toString() {
		return "Banchista [name=" + nome + "]";
	}

}