package com.labsession;

import java.util.*;

public class Supplierinfo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Supplier> al = new ArrayList<>();

		for (int i = 0; i < 3; i++) {

			System.out.println("enter the Supplier id");
			int sid = sc.nextInt();
			System.out.println("enter the supplier name");
			String sname = sc.next();
			System.out.println("enter item id");
			int iid = sc.nextInt();
			System.out.println("enter the item name");
			String iname = sc.next();
			System.out.println("price of item");
			int iprice = sc.nextInt();

			Supplier s = new Supplier();
			s.setId(sid);
			s.setName(sname);
			s.setItm(new Ittem());
			s.getItm().setIid(iid);
			s.getItm().setIname(iname);
			s.getItm().setIprice(iprice);

			al.add(s);

			Iterator<Supplier> itt = al.iterator();
			while (itt.hasNext()) {
				Supplier sp = itt.next();

				if (sp.getItm().getIprice() > 1000) {
					System.out.println(sp);
				}
			}

		}

	}
}
