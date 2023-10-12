/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m8.s11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * HashMap exercise
 */
public class Exercise {
	/**
	 * Extract non-duplicated values in input and return them as a Collection, for
	 * example:
	 * <li>in {2, 3, 4, 4, 4, 5, 5, 5, 6, 7} -> out {2, 3, 6, 7}
	 * <li>in {4, 5, 4, 2, 5, 3, 6, 7} -> out {2, 3, 6, 7}
	 * 
	 * @param data a bunch of integers
	 * @return only the non-duplicated values from input
	 */
	public Collection<Integer> singles(int[] data) {
		// TODO
		// throw new UnsupportedOperationException("Not yet implemented");

		Map<Integer, Integer> map = new HashMap<>();
		/*
		 * Primo metodo for (int i = 0; i < data.length; i++) { if
		 * (map.containsKey(data[i])) { Integer current = map.get(data[i]);
		 * map.put(data[i], current + 1);
		 * 
		 * } else { map.put(data[i], 1); }
		 * 
		 * }
		 */
		/*
		 * secondo metodo for (int i = 0; i < data.length; i++) {
		 * 
		 * Integer value = map.putIfAbsent(data[i], 1); if (value != null) {
		 * map.put(data[i], value + 1); }
		 * 
		 * }
		 */

		for (int i = 0; i < data.length; i++) {
			map.put(data[i], map.getOrDefault(data[i], 0) + 1);
		}

		var currentVal = new ArrayList<Integer>();
		for (Integer Key : map.keySet()) {
			if (map.get(Key) == 1) {
				currentVal.add(Key);
			}
		}
		return currentVal;
	}

	public static void main(String[] args) {
		Collection<Integer> result = new Exercise().singles(new int[] { 2, 3, 4, 4, 5, 5, 6, 7 });
		System.out.println(result);
	}
}
