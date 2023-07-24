package com.labsession;

import java.util.*;

class dtp {
	int did;
	String dname;

	public dtp(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "dtp [did=" + did + ", dname=" + dname + "]";
	}

}

class Employe1 implements Comparable<Employe1> {
	int id;
	String name;
	int salary;
	dtp department;

	public Employe1(int id, String name, int salary, dtp d) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = d;

	}

	@Override
	public String toString() {
		return "Employe1 [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

	@Override
	public int compareTo(Employe1 o) {
		return o.salary-this.salary;
	}

}

public class EEmap {

	public static void main(String[] args) {

		Map<Employe1, String> tm = new TreeMap<>();
		tm.put(new Employe1(1, "abc", 5000, new dtp(10, "sales")), "pune");
		tm.put(new Employe1(2, "def", 7000, new dtp(20, "IT")), "lahor");
		tm.put(new Employe1(3, "ghi", 4000, new dtp(30, "finance")), "goa");
		tm.put(new Employe1(4, "jkl", 9000, new dtp(40, "marketing")), "pune");
		tm.put(new Employe1(5, "mno", 6000, new dtp(50, "IT")), "lahor");
		System.out.println(
				"......................................................................................................................");
		Set<Map.Entry<Employe1, String>> set = tm.entrySet();
		Iterator<Map.Entry<Employe1, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<Employe1, String> mp = it.next();
			System.out.println(mp.getKey() + "" + mp.getValue());
		}
	}

}
