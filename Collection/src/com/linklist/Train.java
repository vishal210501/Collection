package com.linklist;

import java.util.*;

public class Train implements Comparable<Train> {

	int id;
	String name;
	int no_seat;

	public Train(int id, String name, int no_seat) {
		super();
		this.id = id;
		this.name = name;
		this.no_seat = no_seat;
	}

	@Override
	public String toString() {
		return "Train [id=" + id + ", name=" + name + ", no_seat=" + no_seat + "]";
	}

	@Override
	public int compareTo(Train o) {

		if (this.no_seat == o.no_seat) {
			return o.id - this.id;
		} else {
			return o.no_seat - this.no_seat;
		}

	}

	public static void main(String[] args) {

		LinkedList<Train> ld = new LinkedList<>();
		ld.add(new Train(101, "ram", 91));
		ld.add(new Train(102, "laxman", 92));
		ld.add(new Train(103, "bharat", 91));
		ld.add(new Train(104, "shatrughna", 94));

		for (Train x : ld) {
			System.out.println(x);
		}

		System.out.println(
				"...............................................................................................");

		Collections.sort(ld);
		for (Train x : ld) {
			System.out.println(x);
		}
	}

}
