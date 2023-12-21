package com.vaish;
import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		String name;
		float salary;
		char gen;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		
		name=scanner.nextLine();
		
		System.out.println("Enter Your Age:");
		age=scanner.nextInt();
		
		System.out.println("Enter Your Salary:");
		salary=scanner.nextFloat();
		
		System.out.println("Enter Your Gender:");
		gen=scanner.next().charAt(0);//read char
		
		System.out.println("Employee Details");
		System.out.println("Name:" +name);
		System.out.println("Age:" +age);
		System.out.println("Salary:" +salary);
		System.out.println("Geneder:" +gen);
		
	}

}
