package com.vaish;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetDemo {

	public static void main(String[] args) {
	//	LinkedHashSet<Integer>lob=new LinkedHashSet<Integer>();
	 Set<Integer>lob=new LinkedHashSet<Integer>();//Set is the interface. you can use Set instead of LinkedHasSet. Use left hand side Set interace 
		lob.add(90);
		lob.add(45);
		lob.add(90);
		lob.add(90);
		lob.add(null);
		System.out.println(lob);
		
	}

}
