package com.vaish;
//int 0, float 0.0, double 0.0 ,char is blank space, string is null

import java.util.Scanner;

class Student{
	int age;
	String name;
	static String clgname="SITCOE";
//static variable , class variable
	
 void inputData() {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Your Name:");
	
	name=sc.nextLine();
	System.out.println("Enter Your age:");
	
	age=sc.nextInt();
 	}
 }
public class Stud {

	public static void main(String[] args) {
		Student student1=new Student();
		Student student2=new Student();
		student1.inputData();
		student2.inputData();
		// TODO Auto-generated method stub
		String n;//local
		System.out.println("Name" +student1.name);
		System.out.println("Age" +student1.age);
		System.out.println("College name"+student1.clgname);
		System.out.println("Name" +student2.name);
		System.out.println("Age" +student2.age);
		System.out.println("College name"+student2.clgname);
	}

}
