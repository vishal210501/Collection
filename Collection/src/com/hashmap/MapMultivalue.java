package com.hashmap;
import java.util.*;
import java.util.Map.Entry;
public class MapMultivalue {

	public static void main(String[] args) {
	HashMap<String, ArrayList<String>>hm=new HashMap<>();
//     ArrayList<String>al=new ArrayList<>();
//     al.add("sangli");
//     al.add("kolhapur");
//     al.add("satara");
//     
//     hm.put("maharashtra", al);
//     System.out.println(hm);
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the no. of states");
	int state=sc.nextInt();
	for(int i=0;i<state;i++) {
		System.out.println("enter the name of state");
	  String key=sc.next();
	  ArrayList<String>list=new ArrayList<>();
	  System.out.println("enter the no. of cities ");
	  int cities=sc.nextInt();
	  for(int j=0;j<cities;j++) {
		  System.out.println("enter the name of cities");
		  String cty=sc.next();
		  list.add( cty);
	  }
	  hm.put(key,list);
	}
	
	System.out.println("......................................................................................................................................");
	
	for(Map.Entry<String, ArrayList<String>>m:hm.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
     		
	}

}
