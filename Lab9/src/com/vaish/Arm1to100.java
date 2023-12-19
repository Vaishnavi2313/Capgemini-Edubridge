package com.vaish;

import java.util.Scanner;

public class Arm1to100 {

	public static void main(String[] args) {
		System.out.println("All Armstrong numbers between 1 to 1000");

		for(int i=1;i<=1000;i++) {

			int num = i,d,result=0, n=0;

			int orgnum = num;
			//to calculate number of digits
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

				//System.out.println(orgnum+" is Armstrong num");

				System.out.print(orgnum+" ");

 

		}

		}

	}