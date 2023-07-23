package com.hashmap;

import java.util.*;

public class Sorting {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "ramu");
		hm.put(2, "appa");
		hm.put(3, "bhau");
		hm.put(4, "nana");

		System.out.println(hm);

		System.out.println(
				"..........................................................................................................................................................................................");

		TreeMap<Integer, String> tm = new TreeMap<>(new Mycom());
		tm.putAll(hm);
		System.out.println(tm);

	}

}

class Mycom implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		return o2.intValue() - o1.intValue();
	}
}
