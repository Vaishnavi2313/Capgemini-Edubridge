package com.vaish;

import java.util.Scanner;

public class Studmarks {
	char ch;
	void inputmarks() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Grade");
		ch=sc.next().toUpperCase().charAt(0);
		
	}
	void display() {
		if(ch=='F') {
			System.out.println("0 to 39");
		}
		else if(ch=='A') {
			System.out.println("80 to 100");
		}
		else if(ch=='B') {
			System.out.println("60 to 79");
		}
		else if(ch=='C') {
			System.out.println("40 to 59");
		}
		else {
			System.out.println("Invalid ");
		}

		
	}
	public static void main(String[] args) {
		
		Studmarks s=new Studmarks();
		s.inputmarks();
		s.display();

	}

}
