package com.hashmap;

import java.util.*;

class Menu {
	int mid;
	String mname;
	int price;

//	Menu mmid;
	public Menu(int mid, String mname, int price) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Menu [mid=" + mid + ", mname=" + mname + ", price=" + price + "]";
	}

}

class Order {
	int oid;
	int omid;
	int quantity;

	public Order(int oid, int omid, int quantity) {
		super();
		this.oid = oid;
		this.omid = omid;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", omid=" + omid + ", quantity=" + quantity + "]";
	}

}

public class Logic_OdMe {

	public static void main(String[] args) {

		ArrayList<Menu> al = new ArrayList<>();
		al.add(new Menu(1, "tea", 5));
		al.add(new Menu(2, "samosa", 20));
		al.add(new Menu(3, "misal", 40));
		al.add(new Menu(4, "vadasambar", 40));

		System.out.println(al);

		System.out.println(
				"..................................................................................................................");

		ArrayList<Order> ald = new ArrayList<>();
		ald.add(new Order(10, 1, 2));
		ald.add(new Order(20, 2, 3));
		ald.add(new Order(30, 1, 3));
		ald.add(new Order(40, 3, 1));
		ald.add(new Order(50, 4, 2));

		HashMap<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < al.size(); i++) {
			int total_bill = 0;
			for (int j = 0; j < ald.size(); j++) {

				if (al.get(i).mid == ald.get(j).omid) {
					total_bill = total_bill + (ald.get(j).quantity * al.get(i).price);

				}
			}
			hm.put(al.get(i).mname, total_bill);
		}
		System.out.println(hm);

	}

}
