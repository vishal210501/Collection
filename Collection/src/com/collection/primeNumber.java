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

		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			Integer ip = it.next();
			boolean isprime = true;
			for (int j = 2; j < ip; j++) {
				if (ip % j == 0) {
					isprime = false;
				}

			}
			if (isprime == true) {
				System.out.println(ip);

			}

		}

	}

}
