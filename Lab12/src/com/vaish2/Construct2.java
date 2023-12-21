package com.vaish2;
class Parent12{

private int i;

	public Parent12(int i) {

		super();

		System.out.println("Parent1 constructor i="+i); //i=10

	}

}


class Child12 extends Parent1{

 

	public Child12(int i) {

		super();

		System.out.println("Child1 class constructor");

	}

}

 

class Child23 extends Child12{

 

	public Child23(int i) {

		super(i);

		System.out.println("Child2 class constructor");

	}

}
public class Construct2 {

public static void main(String[] args) {

	Child23 cob= new Child23(10);

	

	//Parent1 pob = new Parent1(10); // dont do this

}

}
