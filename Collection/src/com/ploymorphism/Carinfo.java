package com.ploymorphism;

import java.util.*;

public class Carinfo {

	public static void main(String[] args) {

		ArrayList<Car> cr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of car");
		int cn = sc.nextInt();
		for (int i = 0; i < cn; i++) {
			System.out.println("enter the model no. of car");
			int mn = sc.nextInt();
			System.out.println("enter car name");
			String cname = sc.next();
			System.out.println("enter car colour");
			String cc = sc.next();
			System.out.println("enter car price");
			int cprice = sc.nextInt();

			Car c = new Car();
			c.setModel_no(mn);
			c.setName(cname);
			c.setColour(cc);
			c.setPrice(cprice);

			cr.add(c);
			
			Iterator<Car>it=cr.iterator();
			while(it.hasNext()) {
				Car crr=it.next();
				if(crr.getColour()=="red") {
					System.out.println(crr);
				}
			}
			
			}
		}
	}
