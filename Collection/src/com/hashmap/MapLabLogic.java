package com.hashmap;

import java.util.*;

class Employee {
	int id;
	String name;
	String department;

	public Employee(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

}

public class MapLabLogic {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee(101, "pooja", "HR"));
		al.add(new Employee(102, "priya", "finanace"));
		al.add(new Employee(103, "ponam", "HR"));
		al.add(new Employee(104, "pinky", "marketing"));
		al.add(new Employee(105, "piyu", "finanace"));

		for (Employee e : al) {
			System.out.println(e);
		}

		System.out.println(
				"................................................................................................");

		HashMap<String, ArrayList<String>> hm = new HashMap<>();
		ArrayList<String> alt = new ArrayList<>();
		Iterator<Employee> it = al.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			if (hm.containsKey(e.department)) {
				alt = hm.get(e.department);
				alt.add(e.name);
			} else {
				alt = new ArrayList<>();
				alt.add(e.name);
			}
			hm.put(e.department, alt);
		}
		System.out.println(".................................................................................");
		for (Map.Entry<String, ArrayList<String>> mp : hm.entrySet()) {
			System.out.println(mp.getKey() + " " + mp.getValue());
		}

	}

}
