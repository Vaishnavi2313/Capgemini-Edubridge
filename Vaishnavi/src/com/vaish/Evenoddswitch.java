package com.vaish;

import java.util.Scanner;

class Number{
	int num;
void inputdata() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		num=sc.nextInt();
}
void display() {
	if(num%2==0) {
		System.out.println("Even Number");
	}else {
		System.out.println("Odd Number");
	}
}
public class Evenoddswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number n=new Number();
		n.inputdata();
		n.display();
	}

}
}
