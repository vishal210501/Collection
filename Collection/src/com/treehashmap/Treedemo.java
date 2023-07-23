package com.treehashmap;

import java.util.*;

public class Treedemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(101, "java");
		tm.put(102, "c++");
		tm.put(103, "c+");
		tm.put(104, ".net");
		tm.put(105, "csharp");
		System.out.println(tm);

		NavigableMap<Integer, String> s = tm.descendingMap();// inbuilt method for decending order
		System.out.println(s);

		System.out.println("1." + tm.ceilingEntry(104));// it will give u particular that key and pair
		System.out.println("2." + tm.ceilingEntry(100));// if that key is not present then it will give u
														// higher key if not present then return 0
		System.out.println("3." + tm.floorEntry(106));// it will give you particular that key or
														// lower key and if not present then 0
		System.out.println("4." + tm.higherEntry(102));// it will return only higher pair of given key
		System.out.println("5." + tm.lowerEntry(104));// it will return only lower pair of given key
		System.out.println("6." + tm.lastEntry());// it will return last pair
		System.out.println("7" + tm.firstEntry());// it will return first pair
		System.out.println("8" + tm.headMap(104));// it will return all key pair below that
		System.out.println("9" + tm.headMap(104, true));// it will return all below and that key too
		System.out.println("10" + tm.tailMap(101));// it will return all higher pair include given key
		System.out.println("11." + tm.tailMap(101, true));// it will return all higher pair include given key
		System.out.println("12." + tm.subMap(102, 105));// it will return pairs between given 2 keys
														// and it will include pair of 1st key but not last key
		System.out.println("13" + tm.subMap(102, false, 105, true));// same return as 12. just u can adjust which
																	// pair u want and not want
	}

	class Mycom implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {

			return o2 - o1;
		}

	}

}
