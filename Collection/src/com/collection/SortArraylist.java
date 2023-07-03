  package com.collection;

import java.util.*;

public class SortArraylist {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(25);
		al.add(24);
		al.add(21);
		al.add(23);
		al.add(22);
		System.out.println(al);

		for (int i = 1; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i) > al.get(j)) {
					int temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);

				}
			}
			

		}
		System.out.println(al);


	}

}
