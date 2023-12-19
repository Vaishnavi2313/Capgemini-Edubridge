package com.vaish;

public class BlankStar {

	public static void main(String[] args) {
		int r=3,c=3,m=4;

		for ( int i=1;i<=r;i++) {

			for ( int j=0;j<r-i;j++) {

				System.out.print(" ");

			}

		     for ( int k=1;k<=i;k++) {

				System.out.print(i+" ");

			}

			//System.out.println();
		
			
			for ( int a=0;a<r-i;a++) {

				System.out.print(" ");

			}

		     for ( int b=1;b<=i;b++) {

				System.out.print(i+" ");

			}

			System.out.println();

		}
	}
	
}
