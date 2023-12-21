package com.vaish;

import java.util.Vector;

public class Vectorcreation {

	public static void main(String[] args) {
		Vector<Integer>v=new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		System.out.println(v);
		v.add(2,6);
		System.out.println(v);
		System.out.println(v.get(3));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.indexOf(2));
		System.out.println(v.isEmpty());

	}

}
