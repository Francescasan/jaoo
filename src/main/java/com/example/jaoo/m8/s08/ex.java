package com.example.jaoo.m8.s08;

import java.util.ArrayList;
import java.util.TreeSet;

public class ex {
	public static void main(String[] args) {
		ArrayList amici = new ArrayList();

		amici.add("Francesca");
		amici.add("Rocco");
		amici.add("Pia");
		amici.add("Mia");
		amici.add("Claudio");
		amici.add("Claudio");
		amici.add("Maripia");
		System.out.println("n.elementi di amici: " + amici.size());

		System.out.println(amici);
		TreeSet<String> amiciOrdinati = new TreeSet<String>(amici);
		System.out.println("in ordine alfabetico:");
		System.out.println(amiciOrdinati);

		TreeSet<String> amici2 = new TreeSet<String>((x, y) -> {

			if (x.length() == y.length() && !(x.equals(y))) {
				return -1;
			}
			return Integer.compare(x.length(), y.length());

		});
		amici2.addAll(amici);
		System.out.println("in ordine lunghezza da più corta:");
		System.out.println(amici2);

		TreeSet<String> amici3 = new TreeSet<String>((x, y) -> Integer.compare(y.length(), x.length()));
		amici3.addAll(amici);
		System.out.println("in ordine lunghezza da più lunghe:");
		System.out.println(amici3);
		TreeSet<String> amici4 = new TreeSet<String>((x, y) -> {

			if (x.length() == y.length() && !(x.equals(y))) {
				return -1;
			}
			return Integer.compare(y.length(), x.length());

		});

		amici4.addAll(amici);
		System.out.println("in ordine lunghezza da più lunghe considerando doppioni e stessa lunghezza:");
		System.out.println(amici4);
	}
}