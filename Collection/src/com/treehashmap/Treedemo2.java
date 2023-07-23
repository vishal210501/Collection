package com.treehashmap;

import java.util.*;

class Student /* implements Comparable<Student>*/ {
	int id;
	String name;
	int marks;

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

//	@Override
//	public int compareTo(Student o) {
//
//		return o.marks - this.marks;
//	}

}

public class Treedemo2 {

	public static void main(String[] args) {
		TreeMap<Student, String> mt = new TreeMap<>(/* new Mycom() */);
		mt.put(new Student(101, "A", 89), "delhi");
		mt.put(new Student(103, "c", 82), "Goa");
		mt.put(new Student(102, "d", 92), "pune");
		mt.put(new Student(105, "b", 73), "Mumbai");

		System.out.println(".................................................................................");

		for (Map.Entry<Student, String> m : mt.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
/*
 * // by comparator class Mycom implements Comparator<Student> {
 * 
 * @Override public int compare(Student o1, Student o2) {
 * 
 * return o2.id - o1.id; }
 * 
 * }
 */
