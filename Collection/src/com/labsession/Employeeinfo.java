package com.labsession;

import java.util.*;

public class Employeeinfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Employee> al = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("enter the employee id");
			int eid = sc.nextInt();
			System.out.println("enter employee name");
			String ename = sc.next();
			System.out.println("enter the salary");
			int esal = sc.nextInt();

			Employee emp = new Employee();
			emp.setId(eid);
			emp.setName(ename);
			emp.setSalary(esal);

			al.add(emp);
		}

		int maxsal = 0;
		for (Employee m : al) {
			if (m.getSalary() > maxsal) {
				maxsal = m.getSalary();
			}
		}

		for (Employee m : al) {
			if (m.getSalary() == maxsal) {
				System.out.println(m.getId() + " " + m.getName() + " " + m.getSalary());
			}
		}

	}

}
