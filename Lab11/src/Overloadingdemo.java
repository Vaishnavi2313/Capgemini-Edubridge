class FunctionOverloading{

	

	void display(){

		 System.out.println("No argument");

	}

	void display(int i){

		System.out.println("One argument int"+i);

	}

	void display(int i, int j){

		System.out.println("two argument of int");

	}

	void display(int i, float f){

		System.out.println("two argument of int and float");

	}

 

	void display(float f , int i){

		System.out.println("two argument of float and int");

	}

	

	void display(short i) {

		System.out.println("short int ");

		

	}

	void display(byte i) {

		System.out.println("byte int ");

		

	}

	void display(long i)

	{

		System.out.println("long int ");

	}

 

}

 

public class Overloadingdemo {

 

	public static void main(String[] args) {

		FunctionOverloading fob = new FunctionOverloading();

		fob.display();

		fob.display(10);

		fob.display(12,4.5f);

		fob.display(3.4f,20);

		//byte b=12;

		fob.display((byte)7);

		fob.display((short)12);

		fob.display((long)124353);

	}

 

}
