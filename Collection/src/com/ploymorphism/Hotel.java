package com.ploymorphism;

import java.util.*;

class Menu {

	int mid;
	String mname;
	int mprice;

	public Menu(int mid, String mname, int mprice) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mprice = mprice;
	}

	@Override
	public String toString() {
		return "Menu [mid=" + mid + ", mname=" + mname + ", mprice=" + mprice + "]";
	}

}

public class Hotel {

	int hid;
	String hname;
	ArrayList<Menu> list;

	public Hotel(int hid, String hname, ArrayList<Menu> list) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.list = list;
	}

	@Override
	public String toString() {
		return "Hotel [hid=" + hid + ", hname=" + hname + ", list=" + list + "]";
	}

	public static void main(String[] args) {

		ArrayList<Hotel> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.of hotel");
		int h = sc.nextInt();
		for (int i = 0; i < h; i++) {
			System.out.println("enter the hotel id");
			int hid = sc.nextInt();
			System.out.println("enter the hotel name");
			String hname = sc.next();
			ArrayList<Menu> ae = new ArrayList<>();
			System.out.println("enter the no. of menu");
			int m = sc.nextInt();
			for (int j = 0; j < m; j++) {
				System.out.println("enter the menu id");
				int mid = sc.nextInt();
				System.out.println("enter the menu name");
				String mname = sc.next();
				System.out.println("enter the menu price");
				int mprice = sc.nextInt();
				ae.add(new Menu(mid, mname, mprice));
			}
			al.add(new Hotel(hid, hname, ae));
		}

		Iterator<Hotel> it = al.iterator();
		while (it.hasNext()) {
			Hotel iit = it.next();

			System.out.println(iit);
		}

	}
}
