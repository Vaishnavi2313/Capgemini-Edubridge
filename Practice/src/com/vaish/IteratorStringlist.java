package com.vaish;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorStringlist {

	public static void main(String[] args) {
		ArrayList<String>a3=new ArrayList<String>();
		a3.add("red");
		a3.add("pink");
		a3.add("black");
		a3.add("white");
		Iterator<String>it= a3.iterator();
		while(it.hasNext())
		System.out.println(it.next());
		

	}

}
