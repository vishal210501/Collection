package com.collection;

import java.util.*;

public class Logic4 {


	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(123, "BJP");
		hm.put(144, "shivsena");
		hm.put(101, "BJP");
		hm.put(222, "congress");
		hm.put(133, "BJP");
		hm.put(145, "shivsena");

		System.out.println(hm);

		System.out.println(
				"............................................................................................................");
		HashMap<String, Integer> m = new HashMap<>();
		ArrayList<String> al = new ArrayList<>(hm.values());
		System.out.println(al);
		for (int i = 0; i < al.size(); i++) {
			int count = Collections.frequency(al, al.get(i));
			m.put(al.get(i), count);
		}

		System.out.println(m);

	}
}
