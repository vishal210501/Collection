package com.linkedhashmap;
import java.util.*;
public class LinkedDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String>lm=new LinkedHashMap<>();
		String s=lm.put(101, "ram");
		System.out.println(s);
		String s1=lm.put(101, "shatrughna");
		System.out.println(s1);
		lm.put(103, "laxman");
		lm.put(104, "bharat");
		System.out.println(lm);

	}

}
