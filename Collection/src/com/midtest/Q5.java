package com.midtest;

public class Q5 {

	public static void show(int a[][]) {
		int sum = 0;
		int avrage = 0;
		for (int i = 0; i < a.length; i++) {
			sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum = sum + a[i][j];
			}
			System.out.println(sum);
			avrage = sum / 3;
			System.out.println("rowwise avrage :" + avrage);
		}

		for (int i = 0; i < a[i].length; i++) {
			sum = 0;
			for (int j = 0; j < a.length; j++) {
				sum = sum + a[j][i];
			}
			System.out.println(sum);
			avrage = sum / 4;
			System.out.println("coloumwise avrage :" + avrage);
		}
	}

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		System.out.println(a);
		Q5.show(a);
	}

}
