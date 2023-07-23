package com.collection;

import java.util.*;

class Order {
	int id;
	String mname;
	int quantity;
	int price;

	public Order(int id, String mname, int quantity, int price) {
		super();
		this.id = id;
		this.mname = mname;
		this.quantity = quantity;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", mname=" + mname + ", quantity=" + quantity + ", price=" + price + "]";
	}

}

public class logic3 {

	public static void main(String[] args) {

		LinkedList<Order> ld = new LinkedList<>();
		ld.add(new Order(1, "dosa", 2, 40));
		ld.add(new Order(2, "misal", 3, 30));
		ld.add(new Order(3, "pavbhaji", 1, 50));
		ld.add(new Order(4, "dosa", 3, 40));
		ld.add(new Order(5, "misal", 3, 40));

		System.out.print(ld);

		System.out.println(
				"......................................................................................................");
		int bill = 0;
		int total_bill = 0;
		for (Order x : ld) {
			if (x.mname.equals("misal")) {
				bill = x.quantity * x.price;
				total_bill = total_bill + bill;

			}

		}

		System.out.println("total_bill_of_misal :" + total_bill);

	}

}
