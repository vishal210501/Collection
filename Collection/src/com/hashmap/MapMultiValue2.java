package com.hashmap;
import java.util.*;

public class MapMultiValue2 {

	public static void main(String[] args) {
	
		HashMap<String , ArrayList<String>>hm=new HashMap<>();
             ArrayList<String>al=new ArrayList<>();
             Scanner sc= new Scanner(System.in);
             for(int i=0;i<3;i++) {
             System.out.println("enter the name of department ");
             String dname=sc.next();
             ArrayList<String>alt=new ArrayList<>();
             System.out.println("enter the no of employee");
             int emp=sc.nextInt();
             for(int j=0;j<emp;j++) {
            	 System.out.println("enter the name of employee");
            	 String ename=sc.next();
            	 alt.add(ename);
             }
             hm.put(dname, alt);
             
	}
             System.out.println(".........................................................................................................................................");
             
             for(Map.Entry<String, ArrayList<String>>mp:hm.entrySet()) {
            	 System.out.println(mp.getKey()+" "+mp.getValue());
             }
             

}
}
