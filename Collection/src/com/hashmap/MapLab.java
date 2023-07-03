package com.hashmap;

import java.util.*;
import java.util.Map.Entry;

public class MapLab {

	public static void main(String[] args) {

		HashMap<Character, List<String>> hm = new HashMap<>();
		List<String> al = new ArrayList<>();
		al.add("Apple");
		al.add("Angry");
		al.add("Ant");

		hm.put('A', al);
		hm.put('B', Arrays.asList("Ball", "Bat", "Bag"));
		hm.put('C', Arrays.asList("Cat", "Car", "Cow"));

		for (Map.Entry<Character, List<String>> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		List<String> li = hm.get('C');

		Iterator<String> it = li.iterator();

		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}

}
