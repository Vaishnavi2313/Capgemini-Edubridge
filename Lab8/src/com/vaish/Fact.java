package com.vaish;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		//int n=5;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number ");
		n=sc.nextInt();
		double sum=0;
		double facto=1;
		for(int i=1;i<=n;i++) {
			facto=facto*i;
			sum=sum+i/facto;
			
		}
System.out.println("Sum: " +sum);
	}

}
