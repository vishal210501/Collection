package com.midtest;

interface Showable {
	void display();
}

interface Printable {
	void print();
}

abstract class Merge {
	abstract void present();
}

public class Q6 extends Merge implements Showable, Printable {
	@Override
	void present() {
		System.out.println("lets present........................");

	}

	@Override
	public void print() {
		System.out.println("lets print............................................");

	}

	@Override
	public void display() {
		System.out.println("lets display..................................................");

	}

	public void done() {
		System.out.println("done...........................................");
	}

	public static void main(String[] args) {

		Q6 q = new Q6();
		q.present();
		q.print();
		q.display();
		q.done();

	}

}
