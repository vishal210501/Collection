package com.set;

import java.util.*;

class Employee {
	int id;
	String name;
	int salary;
	Dept department;

	public Employee(int id, String name, int salary, Dept department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

}

class Dept {
	int id;
	String dname;

	public Dept(int id, String dname) {
		super();
		this.id = id;
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", dname=" + dname + "]";
	}

}

public class Demo2 {

	public static void main(String[] args) {

		HashSet<Employee> hs = new HashSet<>();
		hs.add(new Employee(101, "appu", 40000, new Dept(1, "HR")));
		hs.add(new Employee(102, "bachhu", 30000, new Dept(2, "Marketing")));
		hs.add(new Employee(103, "chachu", 20000, new Dept(1, "finance")));
		hs.add(new Employee(104, "dadu", 10000, new Dept(5, "HR")));
		System.out.println(hs);
		System.out.println(
				"............................................................................................................");

		HashMap<Dept, Integer> hm = new HashMap<>();
		Iterator<Employee> it = hs.iterator();
		while (it.hasNext()) {
			Employee ep = it.next();
			Dept d = ep.department;
			int salary = ep.salary;
			if (hm.containsKey(d)) {
				int a = hm.get(d);
				salary = salary + a;
			} else {
				hm.put(d, salary);
			}
		}
		System.out.println(hm);
	}

}
