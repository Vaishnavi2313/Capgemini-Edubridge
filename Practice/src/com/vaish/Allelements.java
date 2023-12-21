package com.vaish;

import java.util.ArrayList;
import java.util.List;

public class Allelements {

	public static void main(String[] args) {
//		ArrayList<Integer> ab=new ArrayList<Integer>();
//		ab.add(12);
//		ab.add(13);
//		ab.add(14);
//		ab.add(15);
//		System.out.println(ab);
//		ArrayList<Integer> ab1=new ArrayList<Integer>();
//		ab1.add(12);
//		ab1.add(141);
//		System.out.println(ab.containsAll(ab1));
//		ab1.add("112"); 
//		System.out.println(ab.containsAll(ab1));
//	}
//
//}
		 ArrayList<String> arrl = new ArrayList<String>();
	        arrl.add("First");
	        arrl.add("Second");
	        arrl.add("Third");
	        arrl.add("Random");
	        List<String> list = new ArrayList<String>();
	        list.add("Second");
	        list.add("Random");
	        System.out.println("Does ArrayList contains all list elements?: "
	                    +arrl.containsAll(list));
	        list.add("one");
	        System.out.println("Does ArrayList contains all list elements?: "
	                    +arrl.containsAll(list));
	    }
	}
