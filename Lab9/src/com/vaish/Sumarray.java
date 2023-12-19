package com.vaish;

import java.util.Scanner;

public class Sumarray {

	public static void main(String[] args) {
int a[]=new int[5]; //default values of array 0

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
		int sum=0;
		for(int i:a) {
			sum=sum+i;
		}
		System.out.println(sum);
		float avg=0;
		avg=sum/a.length;
		System.out.println(avg);
		
		//Largest Number
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
 
System.out.println(max);


//small number
int min=a[0];
for(int i=1;i<a.length;i++) {
	if(a[i]<min) {
		max=a[i];
	}
}

System.out.println(min);
	}

 

}