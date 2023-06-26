package com.collection;

import java.util.*;

public class primeNumber {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(7);
		al.add(11);
		al.add(10);
		al.add(5);
		al.add(3);
		System.out.println(al);

	

		for (int i = 0; i < al.size(); i++) {
			boolean isprime = false;
			for (int j = 2; j < al.get(i); j++) {
				if (al.get(i) % j == 0) {
					isprime = true;
					break;
				}
			}
			Iterator<Integer> it = al.iterator();
			while (it.hasNext()) {
				Integer ip = it.next();
				if (isprime == false) {
					System.out.println(al.get(i));
				}

			}

		}

	}

}
