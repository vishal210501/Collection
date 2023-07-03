package com.midtest;

import java.util.Arrays;

public class Q7 {
	public static void show(int a[]) {

		int b[] = new int[a.length];
		int index = 0;
		if (a.length % 2 == 0) {
			index = a.length / 2;
			for (int i = 0; i < a.length / 2; i++) {
				b[index] = a[i];
				index++;
			}
			index = 0;
			for (int i = a.length / 2; i < a.length; i++) {
				b[index] = a[i];
				index++;
			}
		}

		if (a.length % 2 != 0) {
			index = (a.length / 2) + 1;
			b[a.length / 2] = a[a.length / 2];
			for (int i = 0; i < a.length / 2; i++) {
				b[index] = a[i];
				index++;

			}
			index = 0;
			for (int i = (a.length / 2) + 1; i < a.length; i++) {
				b[index] = a[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(b));
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		Q7.show(a);

	}

}
