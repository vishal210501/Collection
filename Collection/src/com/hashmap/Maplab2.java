package com.hashmap;

import java.util.*;

class Student {
	int id;
	String sname;
	int sper;

	public Student(int id, String sname, int sper) {
		super();
		this.id = id;
		this.sname = sname;
		this.sper = sper;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", sper=" + sper + "]";
	}

}

public class Maplab2 {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(101, "pooja", 78));
		al.add(new Student(102, "priya", 88));
		al.add(new Student(103, "punam", 75));
		al.add(new Student(104, "pinky", 66));

		for (Student s : al) {
			System.out.println(s);
		}

		HashMap<String, String> hm = new HashMap<>();
		String status;
		Iterator<Student> it = al.iterator();
		while (it.hasNext()) {
			Student st = it.next();
			if (st.sper > 70) {
				status = "pass";
			} else {
				status = "fail";
			}

			hm.put(st.sname, status);
		}
		System.out.println(
				"....................................................................................................");
		for (Map.Entry<String, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
