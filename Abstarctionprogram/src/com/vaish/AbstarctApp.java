//Abstract: If any one method make class is also abstract

//Can cannot create an object of abstract class

//can have constructor, instance variables, normal methods

//Abstract class have abstract as well as non abstract method

//Abstract class can have all non abstract methods also 

//but we can class can be abstract

//when we dont want object object to be created we go for abstract class

package com.vaish;
abstract class AreaFig{
	abstract void area();
	void display(){
		System.out.println("Display method ");
	}
	final void finalmethod() {
		
	}

		static void staticMethod() {
	
		}	
}	
class Recatangle extends AreaFig{
	void area() {
		int l=8;
		int b=9;
		int a=l*b;
		System.out.println("Area of Rectangle="+a);
	}
}
class Square extends AreaFig{
	void area() {
		int l=8;
		
		int a=l*l;
		System.out.println("Area of Rectangle="+a);
	}
}
public class AbstarctApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recatangle r=new Recatangle();
		r.area();
		Square s=new Square();
		s.area();
	}

}
