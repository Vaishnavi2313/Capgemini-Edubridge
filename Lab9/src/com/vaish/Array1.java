package com.vaish;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
int a[]=new int[5]; //default values of array 0

		
//		for(int i=0;i<a.length;i++) {

//			System.out.println(a[i]);

//		}
		

		Scanner scanner = new Scanner(System.in);

		//input array elements

		System.out.println("Enter "+a.length+" elements");

		for(int i=0;i<a.length;i++) {

			a[i] = scanner.nextInt();

		}
		//Display

		System.out.println("Array elements are ");

		for(int i:a) { //for each

			//System.out.println(a[i]);

			System.out.println(i);

		}

 

	}

 

}