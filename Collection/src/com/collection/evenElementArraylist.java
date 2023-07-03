package com.collection;

import java.util.*;

public class evenElementArraylist {

	public static void main(String[] args) {

		int sum = 0;
		// ArrayList <Integer>v1=newArrayList<Integer>();
		ArrayList<Integer> v1 = new ArrayList<Integer>();

		v1.add(2);
		v1.add(4);
		v1.add(6);
		v1.add(7);
		v1.add(10);
		System.out.println(v1);
		// System.out.println("..................................................................................................................");
		System.out.println("even elements");
		for (int x : v1) {

			if (x % 2 == 0) {

				System.out.println(x);

			}
			sum = sum + x;

		}
		// System.out.println("..................................................................................................................");
		System.out.println("sum=" + sum);

	}

}
