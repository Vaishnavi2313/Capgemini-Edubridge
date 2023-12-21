package com.vaish;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		a=sc.nextInt();
		if(a%2==0) {
			System.out.println("Even number"+a);
		}
		else {
			System.out.println("Odd number"+a);
		}

	}

}
