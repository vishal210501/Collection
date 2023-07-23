package com.hashmap;

import java.util.*;
import java.util.Map.Entry;

public class Mapdemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "red");
		hm.put(2, "yellow");
		hm.put(3, "green");

		System.out.println(hm);

		System.out.println(
				"............................................................................................................................");

		Set<Entry<Integer, String>> set = hm.entrySet();
// by inhance for loop 
		for (Map.Entry<Integer, String> m : set) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println(
				".........................................................................................................................................");

// by iterator
		Iterator<Map.Entry<Integer, String>> it = set.iterator();
		while (it.hasNext()) {
			Entry<Integer, String> iit = it.next();
			System.out.println(iit.getKey() + " " + iit.getValue());
		}

		System.out.println(
				".................................................................................................................................");

//by keyset

		Set s1 = hm.keySet();
		Iterator<Integer> m1 = s1.iterator();
		while (m1.hasNext()) {
			Integer i = m1.next();
			System.out.println(i + " " + hm.get(i));

		}
	}

}
