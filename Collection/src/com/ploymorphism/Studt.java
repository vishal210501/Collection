package com.ploymorphism;

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
	
	static void mk(ArrayList<Student> al ) {
		Iterator<Student>it=al.iterator();
		while(it.hasNext()) {
			Student st=it.next();
			if(st.marks>60) {
			System.out.println(st);
			}
			
		}
		
		
	}

}

public class Studt {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(101, "jd", 95));
		al.add(new Student(102, "kd", 60));
		al.add(new Student(103, "dd", 70));
		al.add(new Student(104, "bb", 80));
             Student.mk(al);
	}

}
