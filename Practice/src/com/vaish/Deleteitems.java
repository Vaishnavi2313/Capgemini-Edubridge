package com.vaish;

import java.util.ArrayList;

public class Deleteitems {

	public static void main(String[] args) {
		ArrayList<Integer> ab=new ArrayList<Integer>();
		ab.add(12);
		ab.add(13);
		ab.add(14);
		ab.add(15);
		System.out.println(ab);
		ab.clear();
		System.out.println(ab);

	}

}
