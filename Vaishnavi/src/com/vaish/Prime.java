package com.vaish;

public class Prime {

	public static void main(String[] args) {
		int n=7;
		int flag=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
			}
		}
			if(flag==1)
			{
				System.out.println(n+ " is not a prime number");

			}
			else
			{
				System.out.println(n+ " is prime number");
			}
		}

	}