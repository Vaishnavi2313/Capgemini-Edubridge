package com.vaishnavi;
import java.util.ArrayList;
public class Sortingcollection {

	public static void main(String[] args) {
		ArrayList<Integer> aob = new ArrayList<Integer>();
		aob.add(34);
		aob.add(43);
		aob.add(33);
		aob.add(24);
		aob.add(10);
		aob.add(90);
		
		
		//sort the list
		Sortingcollection.sort(aob);

		System.out.println("after sorting");
		System.out.println(aob);
		
		Sortingcollection.swap(aob, 2, 6);
		System.out.println("After swap"+aob);
		
		Sortingcollection.shuffle(aob);
		System.out.println("After shuffle"+aob);

	
	}

	private static void shuffle(ArrayList<Integer> aob) {
		// TODO Auto-generated method stub
		
	}

	private static void swap(ArrayList<Integer> aob, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private static void sort(ArrayList<Integer> aob) {
		// TODO Auto-generated method stub
		
	}

}
