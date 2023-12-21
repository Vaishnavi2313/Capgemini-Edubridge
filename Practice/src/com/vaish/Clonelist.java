package com.vaish;

import java.util.ArrayList;

public class Clonelist {

	public static void main(String[] args) {
		ArrayList<Integer>a4=new ArrayList<Integer>();
		a4.add(1);
		a4.add(2);
		a4.add(3);
		a4.add(4);
		System.out.println(a4);
		ArrayList<Integer>c=(ArrayList<Integer>)a4.clone();
		System.out.println(c);
	}

}
