package com.ploymorphism;

import java.util.*;
import java.util.Iterator;

class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	static void sal(ArrayList<Employee> list) {

		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			if (e.salary > 50000) {
				System.out.println(e);
			}
		}

	}

}

public class Employeee {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "jd", 50000));
		list.add(new Employee(102, "kd", 60000));
		list.add(new Employee(103, "dd", 45000));
		Employee.sal(list);

	}

}
