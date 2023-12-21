package com.vaish;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double f=1;
Scanner sc =new Scanner (System.in);
System.out.println("Enter any Number");
long n=sc.nextLong();
//for(int i=1;i<=n;i++)
for(long i=n;i>=1;i--)
{
	f=f*i;
}System.out.println(f);
	}

}
