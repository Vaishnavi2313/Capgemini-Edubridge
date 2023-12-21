package com.vaish;

import java.util.Scanner;

class Empl{
	String name;
	int age;
	float salary;
	char gen;
	void inputData() {
		Scanner sc=new Scanner(System.in);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		
		name=scanner.nextLine();
		
		System.out.println("Enter Your Age:");
		age=scanner.nextInt();
		
		System.out.println("Enter Your Salary:");
		salary=scanner.nextFloat();
		
		System.out.println("Enter Your Gender:");
		gen=scanner.next().charAt(0);
	}
	void Display()
	{
		System.out.println("Employee Details");
		System.out.println("Name:" +name);
		System.out.println("Age:" +age);
		System.out.println("Salary:" +salary);
		System.out.println("Geneder:" +gen);
	}
}
public class MainAppEncapsulation {

	public static void main(String[] args) {
		System.out.println("Main Method");
		Empl e=new Empl();
		e.inputData();
		e.Display();
		
	}

}
