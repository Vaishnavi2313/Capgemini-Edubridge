package com.vaish;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashsetDemo2 {

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
		
		List<Integer>aob=new ArrayList<Integer>();
		aob.add(12);
		aob.add(22);
		aob.add(62);
		aob.add(42);
		aob.add(42);
		aob.add(22);
		HashSet<Integer> h2=new HashSet<Integer>(aob);
		Set<Integer> h1=new LinkedHashSet<Integer>(aob);
		System.out.println(h1);
		System.out.println(h2);
	}

}
