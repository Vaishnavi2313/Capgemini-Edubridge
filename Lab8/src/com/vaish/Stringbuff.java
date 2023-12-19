package com.vaish;

public class Stringbuff {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("Java");
		System.out.println(sb);
		StringBuffer sb1 = new StringBuffer("Hello guys");
		sb1.replace(1,2,"java");
		System.out.println(sb1);
		StringBuffer sb2 = new StringBuffer("Hello guys");
		sb2.reverse();
		System.out.println(sb2);
		StringBuffer sb3= new StringBuffer("Hello guys");
		
		System.out.println(sb3.capacity());
		System.out.println(sb3.length());
		System.out.println(sb3.substring(1,5)); 
		
		StringBuffer sb4 = new StringBuffer("Helloguys");
	
		System.out.println(sb4.charAt(4));
		StringBuffer sb5 = new StringBuffer("Hello guys");
		sb5.ensureCapacity(3);
		//System.out.println(sb5);
		
			
		
				

	}

}
