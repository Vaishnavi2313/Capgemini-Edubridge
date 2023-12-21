package com.vaish2;
class Parent1{

	public Parent1() {

		super();

		System.out.println("Parent1 constructor");

	}

}
class Child1 extends Parent1{

	public Child1() {

		super();

		System.out.println("Child1 class constructor");

	}

	public Child1(String s) {

		System.out.println("One arg constr");

	}
}

class Child2 extends Child1{

	public Child2() {

		super();

		System.out.println("Child2 class constructor");

	}

}
public class  Construct {

public static void main(String[] args) {

	Child2 cob= new Child2();

}

}
