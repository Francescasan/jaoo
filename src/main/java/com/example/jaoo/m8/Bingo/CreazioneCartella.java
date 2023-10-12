package com.example.jaoo.m8.Bingo;
/**
 * import java.util.Random; public class CreazioneCartella { protected int id;
 * protected int[][] elementi = new int[3][5]; public int[] presentiCartella =
 * new int[15];
 * 
 * public boolean fatto; public CreazioneCartella( Giocatore giocatore){ this.id
 * = id; this.setElementi(giocatore); } public boolean
 * numeroPresenteCartella(int num) { int end = this.presentiCartella.length - 1;
 * int start = 0; int index; while (start < end) {
 * 
 * index = start + (end - start) / 2; if (this.presentiCartella[index] == num) {
 * 
 * return true; } else if (this.presentiCartella[index] > num) {
 * 
 * end = index - 1;
 * 
 * } else { start = index + 1;
 * 
 * }
 * 
 * }
 * 
 * return false; }
 * 
 * private int newElemento(Giocatore giocatore) { this.fatto = false; while
 * (!fatto) { Random random = new Random(); int number = random.nextInt(100); if
 * (!this.numeroPresenteCartella(number)) { if
 * (!giocatore.numeroPresente(number)) { return number; } } } return 0000;
 * 
 * }
 * 
 * private static int[] MyInsertionSort(int[] array) {
 * 
 * int j, temp, i; for (i = 0; i < array.length; i++) { temp = array[i]; j = i -
 * 1; while (j >= 0 && array[j] > temp) { array[j + 1] = array[j]; j = j - 1; }
 * array[j + 1] = temp;
 * 
 * } return array; }
 * 
 * private void setPresenti(Giocatore giocatore) { for (int i = 0; i < 15; i++)
 * { int num = this.newElemento(giocatore); this.presentiCartella[i] = num;
 * giocatore.setPresenti(num); } presentiCartella =
 * Cartella.MyInsertionSort(presentiCartella); }
 * 
 * private void setElementi(Giocatore giocatore) { this.setPresenti(giocatore);
 * int m = 0; for (int i = 0; i <= 3; i = i + 1) { for (int j = 0; j <= 5; j = j
 * + 1) { elementi[i][j] = presentiCartella[m]; m++; } }
 * 
 * }
 * 
 * }
 */