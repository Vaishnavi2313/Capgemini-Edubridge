package com.vaish;
class  MyClass2 extends Thread{

	@Override

	public void run() {

		for(int i=1;i<=5;i++) {

			System.out.println(Thread.currentThread());	

		}

	}

}

public class New {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		MyClass2 tob1 = new MyClass2();

		tob1.setName("First thread");

		MyClass2 tob2 = new MyClass2();

		tob2.setName("Second thread");

 
		tob1.start();

		tob2.start();

	}

 
}