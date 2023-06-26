package com.labsession;

import java.util.*;

public class Merge {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);

		ArrayList<Integer> b1 = new ArrayList<>();
		b1.add(100);
		b1.add(200);
		b1.add(300);
		b1.add(400);

		ArrayList<Integer> al3 = new ArrayList<>();

		Iterator<Integer> it = al.iterator();
		Iterator<Integer> itr = b1.iterator();

		while (it.hasNext() || itr.hasNext()) {

			Integer i = it.next();
			Integer i1 = itr.next();

			al3.add(i);
			al3.add(i1);
		}
		System.out.println(al3);

	}

}
