package com.collection;

import java.util.*;

public class oddPositionElement {

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

			if (it.hasNext()) {
				System.out.print(it.next());

			}

		}

	}

}
