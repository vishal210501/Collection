package com.collection;

import java.util.*;


public class CDemo {

	public static void main(String[] args) {
		ArrayList list=new ArrayList(); // non-generic
		list.add(75);
		list.add("pune");
		list.add(50.5);
		list.add('v');
		System.out.println(list);
		
		Iterator <Object>it=list.iterator();
		while(it.hasNext()) {
			Object o=it.next();
			System.out.println(o);
		}
		
	System.out.println("..................................................................................................................................");
	
		ArrayList <Integer>a1=new ArrayList<Integer>();
		a1.add(20);
		a1.add(21);
		a1.add(22);
		a1.add(23);
		System.out.println(a1);
		
		for(int x:a1) {
			System.out.println(x);
		}
		
			
		
		
		
		
		

	}

}
