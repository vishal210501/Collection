package com.hashmap;

import java.util.*;
import java.util.Map;
import java.util.TreeMap;

class Student1 implements Comparable<Student1> {
	int id;
	String name;
	int marks;

	public Student1(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student1 o) {

		//return this.name.compareTo(o.name);
		return o.name.compareTo(this.name);
	}

}

public class hashmapTree {

	public static void main(String[] args) {
		HashMap<Student1, String> mt = new HashMap<>();
		mt.put(new Student1(101, "Abhi", 89), "delhi");
		mt.put(new Student1(103, "chachu", 82), "Goa");
		mt.put(new Student1(102, "dadu", 92), "pune");
		mt.put(new Student1(105, "bacchu", 73), "Mumbai");

		System.out.println(mt);

		System.out.println(".................................................................................");

		TreeMap<Student1, String> tm = new TreeMap<>();
		tm.putAll(mt);
		System.out.println(tm);
		

	}
}
