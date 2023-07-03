package com.collection;

import java.util.*;

public class DuplicateElement {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(2);
		al.add(1);
		al.add(5);
		al.add(2);
		System.out.println(al);
		for (int j = 0; j < al.size(); j++) {
			int count = 1;
			for (int i = j + 1; i < al.size(); i++) {

				if (al.get(j) == al.get(i)) {

					count++;
					al.remove(i);
					i--;
				}
			}
			System.out.println(al.get(j) + " " + count);

		}
		Collections.sort(al);
		System.out.println(al);
	}
	
	
	

}
