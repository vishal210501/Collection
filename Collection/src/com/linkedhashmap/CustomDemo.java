package com.linkedhashmap;

import java.util.*;

class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public int hashCode() {
		return id;
	}

	public boolean equals(Object o) {
		Employee e = (Employee) o;
		if(this.id==e.id && this.name.equalsIgnoreCase(e.name)) {
		//if (this.id == e.id) {
			return true;
		} else {
			return false;
		}
	}

}

public class CustomDemo {

	public static void main(String[] args) {

		HashMap<Employee, Integer> hm = new HashMap<>();
		hm.put(new Employee(101, "ram"), 50000);
		hm.put(new Employee(102, "laxman"), 40000);
		hm.put(new Employee(103, "bharat"), 30000);
		hm.put(new Employee(104, "shatrughna"), 20000);
		hm.put(new Employee(104, "luv_kush"), 10000);

		System.out.println(".................................................................................");

		Set s = hm.entrySet();
		Iterator<Map.Entry<Employee, Integer>> m = s.iterator();
		while (m.hasNext()) {
			Map.Entry<Employee, Integer> mp = m.next();
			System.out.println(mp.getKey() + " " + mp.getValue());
		}

	}

}
