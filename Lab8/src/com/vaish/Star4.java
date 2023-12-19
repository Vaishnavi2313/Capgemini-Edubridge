package com.vaish;

public class Star4 {

	public static void main(String[] args) {
		int r=4,c=4;

		for ( int i=1;i<=r;i++) {

			for ( int j=0;j<r-i;j++) {

				System.out.print(" ");

			}

		     for ( int k=1;k<=i;k++) {

				System.out.print(i+" ");

			}

			System.out.println();

		}

	}
}


 
