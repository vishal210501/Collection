package com.midtest;

import java.util.Scanner;

class NotEligibleForVaccinationException extends RuntimeException {
	public NotEligibleForVaccinationException() {
		super();
	}

	public NotEligibleForVaccinationException(String msg) {
		super(msg);
	}
}

public class CovinApp {
	public static void show(boolean b, int d) {

		boolean istaken =true;

		if (b == false) {
			System.out.println("please take vaccination");
		} else if (d < 60) {
			System.out.println("60 days are not completed");
		} else if (b == true && d > 60) {
			System.out.println("you can take 2nd dose");
			System.out.println("vrfication completed.......");
		}

	}

	public static void main(String[] args) {
		CovinApp ca = new CovinApp();
		Scanner sc = new Scanner(System.in);
		System.out.println("first vaccination taken");
		boolean b = sc.nextBoolean();
		System.out.println("how many days are compleleted after taking vaccine");
		int d = sc.nextInt();
		CovinApp.show(b, d);

		try {
			CovinApp.show(b, d);
		} catch (NotEligibleForVaccinationException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
			System.out.println("done.........................");
		}

	}

}
