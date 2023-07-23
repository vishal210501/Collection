package com.linkedhashmap;

import java.util.*;

class Student {
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

	public int hashCode() {
		return id;

	}

	public boolean equals(Object o) {
		Student s = (Student) o;
		if (this.marks == s.marks) {
			return true;
		} else {

			return false;

		}

	}
}

public class Linkedlogic {

	public static void main(String[] args) {
		LinkedHashMap<Student, String> lh = new LinkedHashMap<>();
		lh.put(new Student(101, "appa", 78), "c+");
		lh.put(new Student(103, "anna", 88), "c++");
		lh.put(new Student(104, "nana", 98), "java");
		lh.put(new Student(106, "kaka", 82), ".net");

		

		System.out.println(
				"....................................................................................................");

		for (Map.Entry<Student, String> m : lh.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
