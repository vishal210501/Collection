package com.midtest;

public class Q11 {

	public static void show(String a) {
          
		int len=a.length();
		int cnt=0;
		char ch=a.charAt(0);
		for(int i=0;i<len;i++) {
			int count=1;
			for(int j=0;j<len;j++) {
				if(a.charAt(i) != a.charAt(j)) {
					break;
				}
				if(cnt<count) {
					cnt=count;
					ch=a.charAt(i);
				}
			}
	             
		}
                System.out.println(ch);		

	}

	public static void main(String[] args) {
		String a = "Success";
		System.out.println(a);
		Q11.show(a);
		
		System.out.println();

	}

}
