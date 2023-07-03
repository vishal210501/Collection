package com.ploymorphism;

import java.util.*;


public class Deptinfo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Dept> al = new ArrayList<>();
		System.out.println("enter the no. of employee");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("enter the id of department");
			int did = sc.nextInt();
			System.out.println("enter the name of department");
			String dnm = sc.next();
			ArrayList<Employe> ae = new ArrayList<>();
			System.out.println("enter the no. of employee");
			int eno = sc.nextInt();
			for (int j = 0; j < eno; j++) {
				System.out.println("enter the id of employee");
				int eid = sc.nextInt();
				System.out.println("enter the name of employee");
				String enm = sc.next();
				System.out.println("enter the salary of employee");
				int esal = sc.nextInt();

				ae.add(new Employe(eid, enm, esal));
			}
			al.add(new Dept(did, dnm, ae));
		}
		System.out.println(
				".....................................................................................................");

		Iterator<Dept> it = al.iterator();
		while (it.hasNext()) {
			Dept dt = it.next();
			System.out.println(dt);
		}

	}

}
