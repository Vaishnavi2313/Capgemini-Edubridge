package com.vaish;

import java.util.LinkedList;

public class LinkedListbasic {

	public static void main(String[] args) {
		LinkedList<Integer>li=new LinkedList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		System.out.println(li);
		System.out.println(li.isEmpty());
		System.out.println(li.size());
		System.out.println(li.contains(2));
		for(int i: li) {
			System.out.println(i);
		}
	}

}
