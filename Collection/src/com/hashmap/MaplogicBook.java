package com.hashmap;

import java.util.*;

class book {
	int id;
	String name;
	int price;
	String authorname;

	public book(int id, String name, int price, String authorname) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.authorname = authorname;
	}

	@Override
	public String toString() {
		return "book [id=" + id + ", name=" + name + ", price=" + price + ", authorname=" + authorname + "]";
	}

	
}

public class MaplogicBook {

	public static void main(String[] args) {

		ArrayList<book> al = new ArrayList<>();
		al.add(new book(101, "wings_of_fire", 250, "A_P_J_Kalam"));
		al.add(new book(102, "2 dhruv", 150, "v_s_khandekar"));
		al.add(new book(103, "gulamgiri", 200, "Mahatma_phule"));
		al.add(new book(104, "romeo_and_juliet", 300, "Willium_shakespeare"));
		al.add(new book(104, "julius_caesar", 300, "Willium_shakespeare"));
		for (book m : al) {
			System.out.println(m);
		}
		System.out.println(
				"...................................................................................................................................................................");

		HashMap<String, ArrayList<String>> hm = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		Iterator<book> it = al.iterator();
		while (it.hasNext()) {
			book b = it.next();
			if (hm.containsKey(b.authorname)) {
				list = hm.get(b.authorname);
				list.add(b.name);
			} else {
				list = new ArrayList<>();
				list.add(b.name);
			}
			hm.put(b.authorname, list);
		}
		System.out.println(
				"..............................................................................................................................................");
		for (Map.Entry<String, ArrayList<String>> mp : hm.entrySet()) {
			System.out.println(mp.getKey() + " " + mp.getValue());
		}
	}

}
