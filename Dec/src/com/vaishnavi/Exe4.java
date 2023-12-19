package com.vaishnavi;

import java.util.ArrayList;

public class Exe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>a1=new ArrayList<String>();
		a1.add("Red");
		a1.add("Blue");
		a1.add("Green");
		a1.add("Pink");
		System.out.println(a1);
		String element=a1.get(0);
		System.out.println("First Element:" +element);
		element=a1.get(2);
		System.out.println("Third elemnt:"+element);
	}

}
