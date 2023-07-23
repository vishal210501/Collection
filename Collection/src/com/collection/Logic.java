package com.collection;

//delete all employee who are working in same 
import java.util.*;

class Employee {
	int id;
	String name;
	float salary;

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Logic {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee(101, "appu", 30000));
		al.add(new Employee(102, "bachhu", 25000));
		al.add(new Employee(104, "chachu", 10000));
		al.add(new Employee(103, "dadu", 15000));

		System.out.println(al);

		System.out.println("...................................................................................");

		for (Employee x : al) {

			if (x.salary < 20000) {
				x.salary = (int) (x.salary * 1.1f);

			}

		}
		for (Employee a : al) {
			System.out.println(a);
		}
	}

}
