package com.vaish;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
//		int a=10,b=5;
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter 3 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int i=c>(a>b ?a:b)?c:((a>b)?a:b);
		System.out.println("Large numbers is" +i);

	}

}
