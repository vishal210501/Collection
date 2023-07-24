package com.labsession;

import java.util.*;
import java.util.Map.Entry;

class dept {
	int did;
	String dname;

	public dept(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "dept [did=" + did + ", dname=" + dname + "]";
	}

}

class Employe implements Comparable<Employe> {
	int id;
	String name;
	int salary;
	dept department;

	public Employe(int id, String name, int salary, dept d) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = d;

	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

	@Override
	public int compareTo(Employe o) {
		int deptcompare = o.department.dname.compareTo(this.department.dname);
		if (deptcompare == 0) {
			return this.salary - o.salary;
		} else {
			return deptcompare;
		}
	}

}

public class EmpMap {

	public static void main(String[] args) {

		Map<Employe, String> mt = new TreeMap<>();

		mt.put(new Employe(1, "ram", 50000, new dept(101, "sales")), "mumbai");
		mt.put(new Employe(2, "arjun", 40000, new dept(102, "IT")), "pune");
		mt.put(new Employe(3, "raghav", 55000, new dept(103, "marketing")), "sangli");
		mt.put(new Employe(4, "parth", 30000, new dept(104, "IT")), "pune");
		mt.put(new Employe(5, "kedar", 25000, new dept(105, "finanace")), "mumbai");

		System.out.println(
				"......................................................................................................................");
		Set<Map.Entry<Employe, String>> set = mt.entrySet();
		Iterator<Map.Entry<Employe, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<Employe, String> mp = it.next();
			System.out.println(mp.getKey() + "" + mp.getValue());
		}
	}

}

//class namecompare implements Comparator<Employe> {
//
//	@Override
//	public int compare(Employe o1, Employe o2) {
//
//		if (o2.department.dname.equals(o1.department.dname)) {
//			return o1.salary-o2.salary;
//		} else if (o2.department.dname != o1.department.dname) {
//
//			return o2.department.dname.compareTo(o1.department.dname);
//		}
//		return 0;
//
//	}
//}
