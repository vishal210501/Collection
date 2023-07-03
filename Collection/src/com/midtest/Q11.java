package com.midtest;

public class Q11 {

	public static void show(String a) {

		char ch[] = a.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			boolean isvisited = false;
			for (int k = i - 1; k >= 0; k--) {
				if (ch[k] == ch[i]) {
					isvisited = true;
					break;
				}
			}
			if (isvisited == false) {
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						count++;
					}
				}
				

			}
			System.out.println(ch[i]+" "+count);
		}

	}

	public static void main(String[] args) {
		String a = "Success";
		System.out.println(a);
		Q11.show(a);

	}

}
