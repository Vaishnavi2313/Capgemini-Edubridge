package com.vaish;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number ");
		n=sc.nextInt();
		double sum=0;
		double facto=1;
		for(int i=2;i<=n;i++) {
			
			sum=+i/facto;
			
		}
System.out.println("Sum: " +sum);
	}

}
