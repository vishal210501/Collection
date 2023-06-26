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

		Object a[] = al.toArray();

		for (int i = 0; i < a.length; i++) {
			int count = 1;
			boolean isvisited = false;
			for (int k = i - 1; k >= 0; k--) {
				if (a[k] == a[i]) {
					isvisited = true;
					break;
				}
			}
			if (isvisited == false) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;

					}
				}
			if (count == 1) {
					System.out.println(a[i] + " " + count);
			} // else if (count == 1) { // for unique character(remove duplicates)
				// System.out.println(a[i] + " " + count);
		}
		// System.out.println(a[i] + " " + count);
	}

}
}
