package com.vaish;
abstract class Ex1{

	 abstract void method1();

	 //abstract method need to override in the child class

	abstract void method2(); 

	//final and static methods cannot be overridden

	final void finalDisplay() {

		System.out.println("Final method");

	}

	static void staticlDisplay() {

		System.out.println("static method");

	}

}

abstract class Ex2 extends Ex1{

	@Override

	public void method1() {

		System.out.println("method1");
	}
	static void staticlDisplay() {

		System.out.println("static method");

	}

}

class Ex3 extends Ex2{
	@Override

	void method2() {

		System.out.println("method2");

	}

}

public class MainApp {
	public static void main(String[] args) {

		 Ex3 ob = new Ex3();

		 ob.method1();

		 ob.method2();

		 ob.finalDisplay();

	}

}