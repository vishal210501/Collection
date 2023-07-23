package com.collection;

import java.util.*;

class Dept {
	int id;
	String name;
	int salary;
	String department;

	public Dept(int id, String name, int salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

}

public class logic2 {

	public static void main(String[] args) {

		LinkedList<Dept> ld = new LinkedList<>();
		ld.add(new Dept(10, "appu", 100, "hr"));
		ld.add(new Dept(2, "bachhu", 150, "marketing"));
		ld.add(new Dept(1, "chachu", 200, "hr"));
		ld.add(new Dept(5, "dadu", 100, "finanace"));

		System.out.println(ld);
		System.out.println(
				".............................................................................................................");

		String dname = " ";
		for (int i = 0; i < ld.size(); i++) {
			if (ld.get(i).id == 10) {
				dname = ld.get(i).department;
			}
		}
		for (int i = 0; i < ld.size(); i++) {
			if (ld.get(i).department.equals(dname)) {
				ld.remove(i);
			}
		}
		System.out.println(ld);

	}

}
