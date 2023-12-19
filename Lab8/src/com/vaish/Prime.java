package com.vaish;

public class Prime {

	public static void main(String[] args) {
		  int count = 0;

		  System.out.println("Last Three Prime Numbers are:");

		  

	        for (int i = 100; i >= 1 && count < 5; i--) {

	            boolean isPrime = true;

	            

	            for (int j = 2; j <= i/2; j++) {

	                if (i % j == 0) {

	                    isPrime = false;

	                    break;

	                }

	            }

	            

	            

	            if (isPrime) {

	                System.out.println(i);

	                count++;

	            }
	        }

	}

}
