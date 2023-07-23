package com.set;

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

}

public class Demo {

	public static void main(String[] args) {

		HashSet<Student> hs = new HashSet<>();
		hs.add(new Student(101, "Appu", 90));
		hs.add(new Student(103, "bachhu", 80));
		hs.add(new Student(105, "chachu", 85));
		hs.add(new Student(102, "dadu", 88));
		hs.add(new Student(104, "mamu", 93));

		System.out.println(hs);

		System.out.println(".......................................................................................");

		TreeSet<Student> ts = new TreeSet<>(new Mycom());
		ts.addAll(hs);

		for (Student x : ts) {
			System.out.println(x);
		}
		
		System.out.println(".............................................................................................");
		
		ArrayList<Student>al=new ArrayList<>();
		al.addAll(ts);
		
		for( Student v:al) {
			System.out.println(v);
		}

	}

}

class Mycom implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o2.marks - o1.marks;
	}
}
