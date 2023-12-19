package com.vaish;

import java.util.Scanner;

public class Armstrongwhile {

	public static void main(String[] args) {

		int num,d,result=0, n=0;

		Scanner scanner = new Scanner(System.in);

		

		System.out.println("Enter number");

		num = scanner.nextInt();
		int orgnum = num;
		while(num>0) {

			n++;

			num = num/10;

		}
		//To Check number is armstrong number

		num = orgnum;

		while(num>0) {  //123>0

			d = num%10; //123%10=3

			result = (int) (result+Math.pow(d, n));

			num = num/10;

		}

		if(orgnum == result)

			System.out.println(orgnum+" is Armstrong num");

		else

			System.out.println(orgnum+" is not Armstrong num");

	}

 

}
