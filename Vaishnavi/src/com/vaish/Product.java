package com.vaish;

import java.util.Scanner;

class Pro{
	int pid;
	String pname;
	float pprice;
	void inputData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Product Name:");
		
		pname=sc.nextLine();
		System.out.println("Enter ID:");
		
		pprice=sc.nextInt();
		System.out.println("Enter Price:");
		
		pprice=sc.nextFloat();
	 	}
	void Display() {
		System.out.println("name" +this.pname);
		System.out.println("ID" +this.pid);
		System.out.println("Price" +this.pprice);
	}
	}

public class Product {

	public static void main(String[] args) {
		Pro product1=new Pro();
		Pro product2=new Pro();
		Pro product3=new Pro();
		Pro product4=new Pro();
		Pro product5=new Pro();
		
		product1.inputData();
		product2.inputData();
		product3.inputData();
		product4.inputData();
		product5.inputData();
		
		System.out.println("Name"+product1.pname);
		System.out.println("ID"+product1.pid);
		System.out.println("Price"+product1.pprice);
		
		System.out.println("Name"+product2.pname);
		System.out.println("ID"+product2.pid);
		System.out.println("Price"+product2.pprice);
		
		System.out.println("Name"+product3.pname);
		System.out.println("ID"+product3.pid);
		System.out.println("Price"+product3.pprice);
		
		System.out.println("Name"+product4.pname);
		System.out.println("ID"+product4.pid);
		System.out.println("Price"+product4.pprice);
		
		System.out.println("Name"+product5.pname);
		System.out.println("ID"+product5.pid);
		System.out.println("Price"+product5.pprice);

	}

}
