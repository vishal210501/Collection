package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Llogic42 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("123", "BJP");
		hm.put("144", "shivsena");
		hm.put("101", "BJP");
		hm.put("222", "congress");
		hm.put("133", "BJP");
		hm.put("145", "shivsena");

		System.out.println(hm);

		System.out.println(
				"............................................................................................................");
		HashMap<String, Integer> m = new HashMap<>();
		Set s=hm.entrySet();
		Iterator<Map.Entry<String, String>>it = s.iterator();
		while(it.hasNext()) {
			int count=0;
			Map.Entry<String, String>me=it.next();
			if(m.containsKey(me.getValue())) {
				count=m.get(me.getValue());
				count++;
			}else {
				count++;
			}
			m.put(me.getValue(), count);
		}
		System.out.println(m);

	}

}
