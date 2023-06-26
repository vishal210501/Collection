package com.collection;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
              
		ArrayList<String>al=new ArrayList<>();
		al.add("yudhistir");
		al.add("bheem");
		al.add("arjun");
		al.add("sahadev");
		al.add("nakul");
		
		
		System.out.println(al);
System.out.println("..................................1.........................................");
for(String x:al) {
	System.out.println(x);
}
System.out.println("...............................2...............................................");
for(int i=0;i<al.size();i++) {
	System.out.println(al.get(i));
}
System.out.println("..................................3.................................................");
 

	}

}
