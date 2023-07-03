package com.midtest;

class Watchman {
	private String name;
	private int age;
	private int Experience;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperience() {
		return Experience;
	}

	public void setExperience(int experience) {
		Experience = experience;
	}

}

class Building {
	private int srno_name;
	private int noOfflats;
	private String landmark;
	private Watchman wman;

	public int getSrno_name() {
		return srno_name;
	}

	public void setSrno_name(int srno_name) {
		this.srno_name = srno_name;
	}

	public int getNoOfflats() {
		return noOfflats;
	}

	public void setNoOfflats(int noOfflats) {
		this.noOfflats = noOfflats;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public Watchman getWman() {
		return wman;
	}

	public void setWman(Watchman wman) {
		this.wman = wman;
	}

}

public class Q12 {

	public static void main(String[] args) {
		Building b = new Building();
		b.setSrno_name(101);
		b.setNoOfflats(100);
		b.setLandmark("pune");
		b.setWman(new Watchman());

		Watchman w = b.getWman();
		w.setName("Ramsingh");
		w.setAge(55);
		w.setExperience(20);

		System.out.println("name :"+b.getSrno_name());
		System.out.println("no. of flats :"+b.getNoOfflats());
		System.out.println("landmark :"+b.getLandmark());
		System.out.println("watchman name :"+w.getName());
		System.out.println("age :"+w.getAge());
		System.out.println("experience :"+w.getExperience());

	}

}
