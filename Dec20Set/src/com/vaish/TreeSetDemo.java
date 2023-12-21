package com.vaish;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//It will not take any null Value
		// by default it will give ascending order
		
		Set<Integer>tob=new TreeSet<Integer>();//Set is the interface. you can use Set instead of LinkedHasSet 
		tob.add(90);
		tob.add(45);
		tob.add(90);
		tob.add(90);
		tob.add(5);
		System.out.println(tob);
		Set<Integer> res=((TreeSet<Integer>) tob).descendingSet();//Descending order
		
		//Using Iterator
		Iterator<Integer>i=res.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	

	}

}
