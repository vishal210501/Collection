package com.midtest;

//Show how constructors in inheritance works.
//Create Person class with addharNo,name,age,mobile and few methods init. 
//Use Person class in Employee class, and further Employee class in used in Manager class with some properties and methods.                                                              

class Man {
	int Adharno;
	String name;
	int age;
	String mobile;

	public Man(int adharno, String name, int age, String mobile) {
		super();
		Adharno = adharno;
		this.name = name;
		this.age = age;
		this.mobile = mobile;

	}

	@Override
	public String toString() {
		return "Man [Adharno=" + Adharno + ", name=" + name + ", age=" + age + ", mobile=" + mobile + "]";
	}

}

class Employee extends Man {
	int eid;
	int salary;

	public Employee(int adharno, String name, int age, String mobile, int eid, int salary) {
		super(adharno, name, age, mobile);
		this.eid = eid;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", salary=" + salary + ", Adharno=" + Adharno + ", name=" + name + ", age="
				+ age + ", mobile=" + mobile + "]";
	}

}

class Manager extends Employee {
	String dept;
	int experience;

	public Manager(int adharno, String name, int age, String mobile, int eid, int salary, String dept, int experience) {
		super(adharno, name, age, mobile, eid, salary);
		this.dept = dept;
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Manager [dept=" + dept + ", experience=" + experience + ", eid=" + eid + ", salary=" + salary
				+ ", Adharno=" + Adharno + ", name=" + name + ", age=" + age + ", mobile=" + mobile + "]";
	}

}

public class Q10 {

	public static void main(String[] args) {
		Man m = new Man(1001, "appa", 51, "123456789");
		System.out.println(m);

		Employee e = new Employee(101, "anna", 2002, "987654321", 52, 50000);
		System.out.println(e);

		Manager mg = new Manager(3003, "nana", 50, "1324576890", 201, 80000, "finanace", 20 );
		System.out.println(mg);
	}
}
