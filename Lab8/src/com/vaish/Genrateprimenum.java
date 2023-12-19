package com.vaish;

public class Genrateprimenum {

	public static void main(String[] args) {
		int n=5,c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
		}

	}
	if(c==2) {
		System.out.println("Prime");
	}else {
		System.err.println("Not Prime");
	}

}}

