package com.vaish;

import java.util.Scanner;

public class Largethree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the First Number : ");
		n1 = sc.nextInt();	
		
		System.out.print(" Please Enter the Second Number : ");
		n2 = sc.nextInt();	
		System.out.print(" Please Enter the Third Number : ");
		n3 = sc.nextInt();	
		
		if(n1 >= n2) {
            if(n1 >= n3)
                System.out.println(n1 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        } else {
            if(n2 >= n3)
                System.out.println(n2 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        }
	}

}
