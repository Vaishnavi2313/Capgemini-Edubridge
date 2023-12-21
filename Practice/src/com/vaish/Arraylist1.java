package com.vaish;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(11);
		a1.add(12);
		a1.add(13);
		System.out.println(a1);
		for(int i:a1) {
			System.out.println(i);
		}

	}

}
