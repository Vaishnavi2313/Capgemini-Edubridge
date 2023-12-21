import java.util.Scanner;

public class Position {

	public static void main(String[] args) {
		
		int a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array");
		int size=sc.nextInt();
		size=5;
		a=new int[size+1];
		System.out.println("Enter"+(a.length-1)+ "array elements");
		for(int i=0;i<a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter element to be added in array at last");
		int num=sc.nextInt();
		a[a.length-1]=num;
		
		//Display array 
		for(int i:a) {
			System.out.println(i);
		}
	}

}
