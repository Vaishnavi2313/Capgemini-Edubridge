package com.vaish;

import java.util.Scanner;

public class Grade {
	int a;
	void inputmarks() {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Marks");
		a=sc.nextInt();
		
	}
	void display() {
		if(a>=0&&a<39) {
			System.out.println("Fail");
		}
		else if(a>=80&&a<100) {
			System.out.println("Grade A");
		}
		else if(a>=60&&a<79) {
			System.out.println("Grade B");
		}
		else if(a>=40&&a<59) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Invalid ");
		}

		
	}




	public static void main(String[] args) {
		Grade m=new Grade();
		m.inputmarks();
		m.display();
		//System.out.println(m.a);
		
	}

}
