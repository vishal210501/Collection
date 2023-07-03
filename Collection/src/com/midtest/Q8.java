package com.midtest;

class Person {

	int adharno;
	String name;
	int age;
	String mobile;

	public Person(int adharno, String name) {
		this.adharno = adharno;
		this.name = name;
		
	}

	public Person(int adharno, String name, int age) {
		this.adharno = adharno;
		this.name = name;
		this.age = age;
	}

	public Person(int adharno, String name, int age, String mobile) {
		this.adharno = adharno;
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [adharno=" + adharno + ", name=" + name + ", age=" + age + ", mobile=" + mobile + "]";
	}

	public void display() {
		System.out.println("adharno :" + adharno);
		System.out.println("name :" + name);
		System.out.println("age:" + age);
		System.out.println("mobile :" + mobile);
	}
	
	
}

public class Q8 {

	public static void main(String[] args) {

		Person p1 = new Person(101, "appa");
		Person p2 = new Person(102, "anna", 21);
		Person p3 = new Person(103, "nana", 23, "9922017413");

		p1.display();
		p2.display();
		p3.display();
		
	}

}
