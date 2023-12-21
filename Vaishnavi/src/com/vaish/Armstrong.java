package com.vaish;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int copynum=num;
		int sum=0;
		//for(int i=1;i<=1000;i++)
		//while(i>0)
		while(num>0) {
			int d=num%10;
			sum=sum+d*d*d;
			num=num/10;
			}
		if(copynum==sum) {
			System.out.println(copynum+ " is armstrong number");
		}
		}

}
