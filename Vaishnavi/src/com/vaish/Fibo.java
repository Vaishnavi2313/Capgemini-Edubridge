package com.vaish;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=1,num2=2,num3,n;
		System.out.println("Enetr number");
		n=sc.nextInt();
		System.out.println("Fibonaci series");
		System.out.println(num1+" "+num2+" ");
		for(int i=1;i<=n-2;i++)
		{
			num3=num1+num2;
			System.out.println(num1+" ");
			num1=num2;
			num2=num3;
		}
	}

}
