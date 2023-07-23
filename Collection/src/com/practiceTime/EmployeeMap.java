package com.practiceTime;

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

class Employee {
	int id;
	String name;
	int salary;
	dept d;

	public Employee(int id, String name, int salary, dept d) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.d = d;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", d=" + d + "]";
	}

}

public class EmployeeMap {

	public static void main(String[] args) {
            
		
	}

}
