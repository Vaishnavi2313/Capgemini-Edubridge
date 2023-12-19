package com.vaish;
//Methods of Thread class



class MyThread1 extends Thread{

	@Override

	public void run() {

		System.out.println("Inside run method");

		System.out.println("Child thread is "+Thread.currentThread());

	}

}

public class Mainapp1 {

	public static void main(String[] args) {

		System.out.println("Main Thread "+Thread.currentThread()); //main thread 

		MyThread tob = new MyThread();

		MyThread tob1 = new MyThread();

		tob.setName("firstthread");

		tob1.setName("secondthread");

		//get the thread name

		System.out.println("Name of the thread "+tob.getName());

		System.out.println("tob status "+tob.isAlive());

		System.out.println("tob1 status "+tob1.isAlive());

		

		tob.start();

		System.out.println("tob status "+tob.isAlive());

		

		tob1.start();

		System.out.println("tob1 status "+tob1.isAlive());

		//tob.start(); //thread cannot start more than once ,

		               //It will throw IllegalThreadStateException



	}



}
