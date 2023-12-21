package com. vaish;

import java. util.Scanner;

 class Calculator {
	double n1,n2,ans;
	char op;
	void inputdata() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		n1=sc.nextDouble();	
		n2=sc.nextDouble();
		op=sc.next().charAt(0);
	}
	void display() {
		switch(op) {
		case 1:
			ans=n1+n2;
			System.out.println("Addition is:");
		break;
		case 2: 
			ans=n1-n2;
			System.out.println("Substarction is:");
		break;
		case 3: 
			ans=n1*n2;
			System.out.println("Multiplication is");
		break;
		case 4: System. out.println("Thursday");
		break;
		case 5:
			ans=n1/n2;
			System.out.println("Division is:");
		break;

		
		default:
			 System.out.println("Invalid");
			 break;
			
		}
	}
	public class OperatorSwitch {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.inputdata();
		c.display();

	}

}
}
