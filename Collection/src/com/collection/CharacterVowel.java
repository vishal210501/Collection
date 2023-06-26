package com.collection;

import java.util.*;

public class CharacterVowel {

	public static void main(String[] args) {

		ArrayList<Character> v1 = new ArrayList<>();
		v1.add('a');
		v1.add('e');
		v1.add('d');
		v1.add('o');
		v1.add('k');
		System.out.println(v1);
		System.out.println("vowels:");
		
		

	for (char v : v1) {
//		if (isvowel(v)) {
//			System.out.println(v);
//			}
		
		if(v=='a' || v=='i' || v=='e' || v=='o' || v=='u') {
			System.out.println(v);
		}

		}

	}

//	public static boolean isvowel(char v) {
//		v = Character.toLowerCase(v);
//		return v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u';
//	}

}
