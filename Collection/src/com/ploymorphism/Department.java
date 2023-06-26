package com.ploymorphism;

import java.util.*;

class Employ {
	int id;
	String name;
	int sal;

	public Employ(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

}

public class Department {

	int id;
	String name;
	Employ emp;

	public Department(int id, String name, Employ emp) {
		super();
		this.id = id;
		this.name = name;
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", emp=" + emp + "]";
	}

	static void list(ArrayList<Department> al) {
		Iterator<Department> it = al.iterator();
		while (it.hasNext()) {
			Department d = it.next();
			System.out.println(d);
		}
	}

	public static void main(String[] args) {

		ArrayList<Department> al = new ArrayList<>();
		al.add(new Department(101, "marketing", new Employ(1, "appa", 50000)));
		al.add(new Department(102, "finanace", new Employ(2, "anna", 60000)));
		al.add(new Department(103, "advertising", new Employ(3, "nana", 70000)));
		Department.list(al);

	}

}
