package com.hashmap;

import java.util.*;

class Movie {
	int id;
	String name;
	String Actorname;

	public Movie(int id, String name, String actorname) {
		super();
		this.id = id;
		this.name = name;
		Actorname = actorname;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", Actorname=" + Actorname + "]";
	}

}

public class MapLogic {

	public static void main(String[] args) {
		ArrayList<Movie> al = new ArrayList<>();
		al.add(new Movie(101, "Barfii", "Ranbir_kapoor"));
		al.add(new Movie(102, "3 idiots", "amir_khan"));
		al.add(new Movie(103, "ghajani", "amir_khan"));
		al.add(new Movie(104, "munna bhai MBBS", "sanjay_datta"));

		for (Movie m : al) {
			System.out.println(m);
		}

		HashMap<String, ArrayList<String>> hm = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		Iterator<Movie> it = al.iterator();
		while (it.hasNext()) {
			Movie m = it.next();
			if (hm.containsKey(m.Actorname)) {
				list = hm.get(m.Actorname);
				list.add(m.name);
			} else {
				list = new ArrayList<>();
				list.add(m.name);
			}
			hm.put(m.Actorname, list);
		}

		System.out.println(
				".............................................................................................................................................");

		for (Map.Entry<String, ArrayList<String>> mp : hm.entrySet()) {
			System.out.println(mp.getKey() + " " + mp.getValue());
		}
	}

}
