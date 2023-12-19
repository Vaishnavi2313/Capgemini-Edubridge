package com.vaish;
class MyThread extends Thread{

	@Override

	public void run() {

		System.out.println("Inside run method");

		System.out.println("Child thread is "+Thread.currentThread());

	}

}

 

public class MainThraed {

 

	public static void main(String[] args) {

		

		System.out.println("Main Thread "+Thread.currentThread());

 

		MyThread tob = new MyThread();

		MyThread tob1 = new MyThread();

		tob.setName("Firstthread");

		tob1.setName("Secondthread");//set the name

		System.out.println("tob status "+tob.isAlive());

		System.out.println("tob1 status "+tob1.isAlive());


		tob.start();

		System.out.println("tob status "+tob.isAlive());

	
		//thread cannot be started more than once 

		//tob.start();

		tob1.start();//start a method

		System.out.println("tob1 status "+tob1.isAlive());

 

	}

 

}
