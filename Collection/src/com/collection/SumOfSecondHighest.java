package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SumOfSecondHighest {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		a.add(8);
		a.add(1);
		a.add(4);
		a.add(2);
		a.add(9);

		Collections.sort(a);
		int secondHighest = a.get(a.size() - 2);

		int sum = 0;
		for (int num : a) {
			if (num < secondHighest) {
				sum += num;
			}
		}
		System.out.println(sum);

	}

}
