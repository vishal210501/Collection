package com.collection;

import java.util.ArrayList;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(2);
		al.add(1);
		System.out.println(al);

		for (int i = 0; i < al.size(); i++) {
			int count = 1;
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i) > al.get(j)) {
					int temp = al.get(i);
					int temp2=al.get(j);
					al.set(i,temp2);
					al.set(j,temp);
					//al.set(i, al.get(j));
					//al.set(j, temp);
				}
			}
		}
		System.out.println(al);

	}

}
