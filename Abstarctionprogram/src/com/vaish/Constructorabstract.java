package com.vaish;
abstract class Product{
	private int pid;
	private String pname;
	public Product() {
	super();
}
	public Product(int pid,String pname) {
		super();
		this.pid=pid;
		this.pname=pname;
	}
	void display() {
		System.out.println("product Id="+pid);
		System.out.println("product Name="+pname);
	}
	}
class Product1 extends Product{
	Product1(int pid,String pname){
	super(pid,pname);
	
	
	}
	}
public class Constructorabstract {

	public static void main(String[] args) {
		Product1 pob=new Product1(12,"TV");
			pob.display();
	}

}
