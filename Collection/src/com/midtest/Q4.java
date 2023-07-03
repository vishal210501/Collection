package com.midtest;
// 
interface Test {

	void show();

	default void display() {
		System.out.println("this is mathematics");
	}

}

class Addition implements Test {

	@Override
	public void show() {
		System.out.println("this is Addition");

	}
}

class Substraction implements Test {
	@Override
	public void show() {
		System.out.println("this is substraction");
	}
}

class Multiplication implements Test {
	@Override
	public void show() {
		System.out.println("this is multiplication");
	}
}

public class Q4 {

	public static void main(String[] args) {

		Test s1 = new Addition();
		
		Test s2 = new Substraction();
		
		Test s3 = new Multiplication();

		s1.show();
		s1.display();

		s2.show();
		s2.display();

		s3.show();
		s3.display();

	}

}
