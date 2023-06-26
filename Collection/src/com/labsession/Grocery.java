package com.labsession;

import java.util.*;

class Item {
	private int id;
	private String name;
	private int price;

	public Item(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	static void show(ArrayList<Item> list) {

		Iterator<Item> it = list.iterator();
		while (it.hasNext()) {
			Item i = it.next();
			if (i.price > 100) {
				System.out.println(i);
			}
		}

	}

}

public class Grocery {

	public static void main(String[] args) {

		ArrayList<Item> list = new ArrayList<>();
		list.add(new Item(1, "soap", 35));
		list.add(new Item(2, "brush", 20));
		list.add(new Item(3, "bread", 120));

		Item.show(list);
	}

}
