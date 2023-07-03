package com.midtest;

import java.*;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int fnum = sc.nextInt();

		if (fnum < 100) {
			System.out.println("it is not a facinating number");
		}

		boolean ispresent = false;
		int num2 = fnum * 2;
		int num3 = fnum * 3;
		String str = "" + fnum + num2 + num3;
		for (int i = 1; i <= 9; i++) {
			int idx1 = str.indexOf(i);
			int idx2 = str.lastIndexOf(i);
			if (idx1 == -1 || idx1 != idx2) {
				ispresent = true;
				break;
			}

		}
		if (ispresent == false) {
			System.out.println("it is facinating number");
		} else {
			System.out.println("itis not facinating number");
		}

	}

}
