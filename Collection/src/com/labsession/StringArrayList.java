package com.labsession;
// remove the words whose length is greater than 3
import java.util.*;
import java.util.ArrayList;

public class StringArrayList {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("c");
		al.add("c++");
		al.add("java");
		al.add("htmal");
		al.add("add java");
		System.out.println(al);

		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			String s = it.next();
			if (s.length() > 3) {
				it.remove();

			}
	
		}
		System.out.println(al);
	}

}
