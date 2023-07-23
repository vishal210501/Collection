package com.hashmap;
import java.*;
import java.util.HashMap;
import java.util.Map.Entry;
public class MapDemo2 {

	public static void main(String[] args) {
		HashMap<Integer, String>hm=new HashMap<>();
		System.out.println(hm.put(10, "pune"));
		
		hm.put(20, "Mumbai");
String s=hm.put(10, "Goa");
System.out.println(s);

//		String s1=hm.put(20, "MP");
//		System.out.println("s1= "+s1);
		
		System.out.println(hm);
		

	}

}



