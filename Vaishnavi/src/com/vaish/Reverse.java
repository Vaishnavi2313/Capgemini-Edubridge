package com.vaish;

import java.util.Scanner;

public class Reverse {


		public static void main(String[] args) {

			// TODO Auto-generated method stub

			Scanner sc=new Scanner(System.in);

			System.out.println("Please enter a number");

			int n=sc.nextInt();

			int rev=0,rem=0;

			

			while(n!=0) {

				rem=n%10;

				rev=rev*10+rem;

				n=n/10;

			}

			System.out.println(rev);

	 

		}

	 

	}