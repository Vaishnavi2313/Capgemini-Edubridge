package com.vaish;

import java.util.Scanner;

public class Checknum {
int num;
void inputData() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	num=sc.nextInt();
}

void display() {
	if(num==0) {
		System.out.println("Not negative Not Positive");
	}else {
	if(num>0) {
		System.out.println(num+"Positive num");
	}else {
		System.out.println(num+"Negative num");
	}}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checknum n=new Checknum();
		n.inputData();
		n.display();
	}

}
