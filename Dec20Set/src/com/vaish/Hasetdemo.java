package com.vaish;

import java.util.HashSet;

public class Hasetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>hob=new HashSet<Integer>();
		hob.add(45);//Duplicates are not allowed in any of the class
		hob.add(15);
		hob.add(55);
		hob.add(null);
		hob.add(55);
		hob.add(null);
		
		for(int i=1;i<=50;i++) {
			hob.add(i);
		}
		System.out.println(hob);
	}

}
