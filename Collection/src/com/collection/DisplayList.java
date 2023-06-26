package com.collection;

import java.util.*;

public class DisplayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Bombay");
		al.add("pune");
		al.add("delhi");
		al.add("patana");

		System.out.println(al);
		System.out.println(
				"..................................................1..............................................................");
		for (String x : al) {
			System.out.println(x);
		}
		System.out.println(
				".................................................2...............................................................");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println(
				"......................................................3...........................................................");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);

		}
		System.out.println(
				"........................................................4...............................................................");
		ListIterator<String> lit = al.listIterator(2);
		while (lit.hasPrevious()) {
			String s1 = lit.previous();
			System.out.println(s1);
		}
System.out.println("...............................................5...................................................................");
		ListIterator<String> lt = al.listIterator();
		while (lt.hasNext()) {
			lt.next();

		}
		while (lt.hasPrevious()) {
			System.out.println(lt.previous());
		}

	}

}
