package com.vaish;
class Table {

	synchronized public void printTable(int num) {

		for(int i=1;i<=10;i++) {

			System.out.println(num+"x"+i+"="+num*i);//2x1=2

		}

	}

}


class MyThreadClass1 extends Thread{

	Table t1;

	MyThreadClass1(Table t1){

		this.t1 = t1;

	}

	public void run() {

		t1.printTable(2);

	}

}

 

class MyThreadClass2 extends Thread{

	Table t1;

	MyThreadClass2(Table t1){

		this.t1 = t1;

	}

	public void run() {

		t1.printTable(5);

	}

}

public class MainTable {

 

	public static void main(String[] args) {

		Table tableobj  = new Table();

		MyThreadClass1 thread1 = new MyThreadClass1(tableobj);

		MyThreadClass2 thread2 = new MyThreadClass2(tableobj);

		thread1.setName("2 table");

		thread2.setName("5 table");

		thread1.start();

		thread2.start();

 

	}

 

}

