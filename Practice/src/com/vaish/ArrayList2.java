package com.vaish;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>a2=new ArrayList<Integer>();
		a2.add(12);
		a2.add(13);
		a2.add(14);
		a2.add(15);
		a2.add(16);
		System.out.println(a2);
		System.out.println(a2.get(1));
		System.out.println(a2.contains(12));
		a2.add(56);
		System.out.println(a2);
		System.out.println(a2.isEmpty());
		System.out.println(a2.indexOf(56));
		System.out.println(a2.size());

	}

}
