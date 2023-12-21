package com.vaish;

import java.util.Scanner;

public class For {

	

		public static void main(String[] args) {
			int Evensum=0;
			int Oddsum=0;
			int i=0;
			while(i<=100)
			{
				if(i%2==0)
				{
					Evensum+=i;
					System.out.println("Sum of Even numbers is: "+Evensum);
				}
				else
				{
					Oddsum+=i;
					System.out.println("Sum of Odd numbers is: "+Oddsum);
				}
				i++;
				
		}

	}
		
	}
		