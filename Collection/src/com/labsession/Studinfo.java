package com.labsession;

import java.util.*;

public class Studinfo {

	public static void main(String[] args) {

		ArrayList<Stud> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of student");
		int snum = sc.nextInt();
		for (int i = 0; i < snum; i++) {

			System.out.println("enter Student id");
			int sid = sc.nextInt();
			System.out.println("enter Student name");
			String sname = sc.next();
			System.out.println("enter marks");
			int marks[] = new int[3];

			int sum = 0;
			for (int j = 0; j< marks.length; j++) {
				marks[j] = sc.nextInt();
				sum = sum + marks[j];
			}

			float per = sum / marks.length;
			Stud st = new Stud();
			st.setId(sid);
			st.setName(sname);
			st.setMarks(marks);
			st.setPer(per);

			al.add(st);

		}

		for (Stud s : al) {
			System.out.println(s.getId() + " " + s.getName() + " " + s.getPer());

		}

	}

}
