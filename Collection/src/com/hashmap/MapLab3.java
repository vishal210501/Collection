package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapLab3 {

	public static void main(String[] args) {

		HashMap<Integer, Integer> hm = new HashMap<>();
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(5);
		al.add(2);
		al.add(1);
		al.add(1);
		al.add(5);
		for (Integer m : al) {
			
			System.out.println(m);
		}
		System.out.println("................................................................................................................................");
		
		Iterator<Integer>it=al.iterator();
          while(it.hasNext()) {
        	  Integer ig=it.next();
        	  int count=1;
        	  if(hm.containsKey(ig)) {
        		  count=hm.get(ig);
        		  count++;
        		  hm.put(ig, count);
        	  }else {
        		  hm.put(ig, count);
        	  }
          }
          System.out.println(hm);
	}

}
