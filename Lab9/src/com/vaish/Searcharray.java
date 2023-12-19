package com.vaish;

import java.util.Scanner;

public class Searcharray {

	public static void main(String[] args) {
		int a[]=new int[5]; //default values of array 0

		Scanner scanner = new Scanner(System.in);

		//input array elements

		System.out.println("Enter "+a.length+" elements");

		for(int i=0;i<a.length;i++) {

			a[i] = scanner.nextInt();
			int pos=0;
			System.out.println("Search the element");
			int key=scanner.nextInt();
			for(int j=0;j<a.length;j++) {
				if(key==a[j]) {
					pos=pos+1;
				}
			}
			if(pos>0) {
				System.out.println("successfully found");
				System.out.println(key);
		}else {
			System.out.println(key+"not found");
			System.out.println("Not found");
		}
	}

}}
