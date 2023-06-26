package com.ploymorphism;

import java.util.*;

class Product {
	int id;
	String name;
	int price;

	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	static void pt(ArrayList<Product> al) {

		Iterator<Product> it = al.iterator();
		while (it.hasNext()) {
			Product p = it.next();
			if (p.name == "cake") {
				System.out.println(p);
			}

		}

	}

}

public class Market {

	public static void main(String[] args) {

		ArrayList<Product> al = new ArrayList<>();
		al.add(new Product(1, "jam", 300));
		al.add(new Product(2, "cake", 100));
		al.add(new Product(3, "maza", 120));

		Product.pt(al);
	}

}
