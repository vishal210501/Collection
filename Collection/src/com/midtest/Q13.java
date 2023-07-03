package com.midtest;

import java.util.Arrays;

public class Q13 {
	
	public static void show(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		int sum = 7;

		int low = 0;
		int high = a.length - 1;

		while (low < high) {
			if (a[low] + a[high] > sum) {
				high--;
			} else if (a[low] + a[high] < sum) {
				low++;
			} else if (a[low] + a[high] == sum) {
				System.out.println("Pair of Sum are:" + a[low] + " + " + a[high] + "= " + sum);
				low++;
				high--;
			}
		}

		
	}

	public static void main(String[] args) {
		int a[] = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
		System.out.println(Arrays.toString(a));
		
		Q13.show(a);
		
		
	}

}
