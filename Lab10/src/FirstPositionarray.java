import java.util.Scanner;

public class FirstPositionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[];

		

		Scanner sc = new Scanner(System.in);

		

		System.out.println("Enter size of an array");

		int size = sc.nextInt();

		a=new int[size];

		a = new int[size+1];

		

		System.out.println("Enter array "+ size+" elements ");
		for(int i=0;i<size; i++) {

			a[i] = sc.nextInt();

		}
		System.out.println("Enter the element to be added at first position");
		int num = sc.nextInt(); //9

		//2 3 4 6 7

		//0 1 2 3 4 

		//9 2 3 4 6 7

		//0  1  2 3 4 5

		for(int i=size-1;i>=0;i--) {
			a[i+1]=a[i];  //4 5 6 7 8

			              //4  4 5 6 7 8

		   //System.out.println(a[i]+ " i="+i);

		}
		a[0] = num;

		System.out.println("Array elements after adding in the first position");

		for(int i=0;i<a.length;i++) {

			System.out.print(a[i]+"  ");

		}

	}

 

}