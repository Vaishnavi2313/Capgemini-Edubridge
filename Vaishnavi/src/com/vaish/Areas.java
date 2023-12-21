package com.vaish;
import java.util.Scanner;

class AreaFigures
{
	double area;
	public void areaSquare(double side) { //method with argument and no return type
		area = side*side;
		System.out.println("Area of reactangle ="+area);
	}
	
	//method with return type with arguments
	public double areaReactangle(double l, double b ) { //formal parameters
		area = l*b;
		return area;
	}

	public void areaCircle(double radius) {
		area = 3.14159f *radius * radius;
		
		System.out.println("Area of Cricle = "+area);
	}

	public void areaTraingle(double base, double height) {
		area = (base*height)/2; //0.5f*base*height
		System.out.println("Area of Triangle ="+area);
		
	}
}

public class Areas {

	public static void main(String[] args) {
		double l,b;
		
		AreaFigures areaob = new AreaFigures();
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU Area of Different Figures");
		
		System.out.println("Enter your choice");
		System.out.println("1.Reactangle");
		System.out.println("2.Area Square");
		System.out.println("3.Area of Circle");
		System.out.println("4.Area of Triangle");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: System.out.println("Enter length and breadth of Reactangle");
		         l=sc.nextDouble();
		         b=sc.nextDouble();
		        double arearect= areaob.areaReactangle(l, b); //actual parameters
		        System.out.println("Area of Reactangle="+arearect);
		        break;
		case 2: System.out.println("Enter side of square");
		        double side=sc.nextDouble();
		        areaob.areaSquare(side);
		case 3: //area of Circle
			     System.out.println("Enter radius");
			     double radius = sc.nextDouble();
			      areaob.areaCircle(radius);
			     break;
		case 4: //area of Triangle
			      System.out.println("Enter base and height of a triangle");
			      double base = sc.nextDouble();
			      double height = sc.nextDouble();
			      areaob.areaTraingle(base,height);
			      break;
	    default: System.out.println("Invalid input");
		     
		
		}
	}

}
