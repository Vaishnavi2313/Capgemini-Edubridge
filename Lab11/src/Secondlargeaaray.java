import java.util.Scanner;

public class Secondlargeaaray {

		 

		public static void main(String[] args) {

			int a[];

			

			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter size of an array");

			int size = scanner.nextInt();
			a = new int[size];
			System.out.println("Enter "+ size +" array elements ");

			for(int i=0;i<size;i++) {

				a[i] = scanner.nextInt();

			}

			System.out.println("Array Elements are");

			for(int i=0;i<size;i++) {

				System.out.print(a[i]+" ");

			}

			System.out.println();

			//Sort array elements

			int temp = 0;

			for(int i=0;i<a.length;i++) {

				for(int j=0;j<a.length-i-1;j++) {

					if(a[j]<a[j+1]) {

						temp = a[j];

						a[j] = a[j+1];

						a[j+1] = temp;

					} 

				}

			}

			System.out.println("Sorted elements are ");

			for(int i=0;i<size;i++) {

				System.out.print(a[i]+" ");

			}

	 

			System.out.println("Second Largest element "+a[1]);

		}

	 

	}