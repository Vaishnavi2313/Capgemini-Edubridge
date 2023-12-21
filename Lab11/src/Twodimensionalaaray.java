import java.util.Scanner;

public class Twodimensionalaaray {

	public static void main(String[] args) {

		int a[][]=new int[3][3];
		Scanner sc = new Scanner(System.in);

		System.out.println("Array elements 3x3");

		for(int i=0;i<3;i++) {

			for(int j=0;j<3;j++) {

				a[i][j] = sc.nextInt();

			}

		}

		System.out.println("Display elements in matrix format");

		for(int i=0;i<3;i++) {

			for(int j=0;j<3;j++) {

				System.out.print(a[i][j]+" ");

			}

			System.out.println();

		}

		System.out.println("Print Principal Diagonal Elements");

		for(int i=0;i<3;i++) {

			for(int j=0;j<3;j++) {

				if(i==j)

				System.out.print(a[i][j]+" ");

			}

			//System.out.println();

		}


	}

 
}