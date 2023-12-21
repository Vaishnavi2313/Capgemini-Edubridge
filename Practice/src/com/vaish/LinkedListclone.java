package com.vaish;

import java.util.LinkedList;

public class LinkedListclone {

	public static void main(String[] args) {
		LinkedList<Integer>li=new LinkedList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		System.out.println(li);
		LinkedList<Integer>l1=(LinkedList<Integer>)li.clone();
		System.out.println("After Cloning:" +l1);
	}

}
