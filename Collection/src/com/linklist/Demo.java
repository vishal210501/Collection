package com.linklist;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<>();
		list.add("mumbai");
	//	list.offerFirst("mumbai");
		System.out.println(list);
		list.addFirst("goa");
		System.out.println(list);
		list.offerFirst("nashik");
		list.remove(0);
		System.out.println(list);
		
		//list.remove();
		//System.out.println(list.pollFirst());
		System.out.println(list);
		list.remove();
		System.out.println(list);
		list.clear();
		System.out.println(list);
		
		System.out.println(list);

	}

}
