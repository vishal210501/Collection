package com.midtest;
// exception
import java.util.*;

import sun.security.util.Password;

class InvalidCharacterException extends RuntimeException {

	public InvalidCharacterException() {
		super();
	}

	public InvalidCharacterException(String msg) {
		super(msg);
	}

}

class InvalidLengthException extends RuntimeException {
	public InvalidLengthException() {
		super();
	}

	public InvalidLengthException(String length) {
		super(length);
	}
}

public class Q14 {

	public static void show(String str) {

		boolean ispresent = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '#' || str.charAt(i) == '*' || str.charAt(i) == '&' || str.charAt(i) == '$'
					|| str.charAt(i) == '!' || str.charAt(i) == '%') {
				ispresent = true;
				break;
			}
		}

		boolean isPresent = false;
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) == '@') {
				isPresent = true;
				break;
			}
		}

		int len = str.length();
		char j = 0;
		if (isPresent != true) {
			System.out.println("please add @ symbol");
		} else if (len < 7) {
			System.out.println("length is less than 7");
		} else if ((len > 7 || len == 7)
				&& (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z' || str.charAt(j) >= 'a' && str.charAt(j) <= 'z')) {
			System.out.println("valid password");
			System.out.println("verification done.........");
		}

	}

	public static void main(String[] args) {
		Q14 code = new Q14();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the password");
		String password = sc.next();
		Q14.show(password);
		try {
			Q14.show(password);
		} catch (InvalidCharacterException e) {
			e.printStackTrace();
		} catch (InvalidLengthException e1) {
			e1.printStackTrace();
		} finally {
			sc.close();
			System.out.println("done..........................................");
		}

	}

}
