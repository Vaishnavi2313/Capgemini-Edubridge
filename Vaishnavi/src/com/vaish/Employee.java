package com.vaish;

public class Employee {
	int j;
	float k;
	String s;
	char c;
	static int p;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i=0;
		Employee e= new Employee();
		System.out.println("j="+e.j);
		System.out.println("k="+e.k);
		System.out.println("s="+e.s);
		System.out.println("c="+e.c);
		System.out.println("static access="+p);
		//System.out.println("static access="+e.p);
		System.out.println("static access="+Employee.p);
		
	}

}
