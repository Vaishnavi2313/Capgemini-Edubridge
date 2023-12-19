package com.vaish;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int age;
		String name;
		float salary;
		
		//Scanner sc=new Scanner(System.in);
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter age");
		age=Integer.parseInt(br.readLine());
		System.out.println("Enter name");
		name=br.readLine();
		System.out.println("Enter salary");
		salary=Float.parseFloat(br.readLine());
		System.out.println("age:"+age);
		System.out.println("Name:"+name);
		System.out.println("salary:"+salary);

	}

}
     