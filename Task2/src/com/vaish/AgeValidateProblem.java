package com.vaish;

import java.util.Scanner;

public class AgeValidateProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);

Source source=new Source();
System.out.println("Enter age of person");
int age=scanner.nextInt();
source.checkAge(age);

}

}

class InvalidAge extends Exception{
public InvalidAge(String str) {
super(str);
}
}

class MyException{

static void ageValidation(int age) throws InvalidAge{
if (age<15) {	
	throw new InvalidAge("Age is smaller than 15");
}
else {
	System.out.println("Valid");
}
}
}

class Source{
public void checkAge(int age) {
MyException myException=new MyException();
try {
	
	myException.ageValidation(age);
} catch (InvalidAge e) {
	System.out.println("Invalid Age");
	System.out.println(e);
}


}
}
