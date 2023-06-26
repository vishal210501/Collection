package com.collection;

import java.util.*;

public class EvenPositionElement {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		al.add(9);
		al.add(8);
		al.add(7);
		al.add(6);
		al.add(5);
		al.add(4);
		System.out.println(al);

		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			Integer ip = it.next();
			for (int i = 0; i < al.size(); i++) {
				if (i % 2 == 0) {
					System.out.println("psotion" + i + " element" + al.get(i));
				}

			}
		}

	}

}


