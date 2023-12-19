package com.vaish;
class DiplayClass{

	 synchronized void display() {

			for(int i=1;i<=5;i++) {

				System.out.println(i +" "+Thread.currentThread());

			}

		}

}



class ThreadSynch extends Thread{

	DiplayClass d1;

	public ThreadSynch(DiplayClass dobj) {

		this.d1=dobj;

	}



	public void run() {

		d1.display();

	}

	

	

}

class ThreadSynch1 extends Thread{

	DiplayClass d2;

	public ThreadSynch1(DiplayClass dobj) {

		this.d2=dobj;

	}



	public void run() {

		d2.display();

	}

	

	

}





public class MainSynchronised {



	public static void main(String[] args) throws InterruptedException {

		DiplayClass dobj = new DiplayClass();

		ThreadSynch tob1 = new ThreadSynch(dobj);

		ThreadSynch1 tob2 = new ThreadSynch1(dobj);

		tob1.setName("first");

		tob2.setName("second");

		tob1.start();

		//tob1.join();

		tob2.start();

	}



}
