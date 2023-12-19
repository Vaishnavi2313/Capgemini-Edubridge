package com.vaish;

public class Jackarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] twoarray=new int[2][];
		twoarray[0]=new int[3];
		twoarray[0]=new int[3];
		twoarray[0]=new int[4];
		int counter=2;
		for(int i=0;i<twoarray.length;i++) {
			for(int j=0;j<twoarray[i].length;j++) {
				twoarray[i][j]=counter++;
				
			}
		}
		for(int i=0;i<twoarray.length;i++) {
			System.out.println("");
		}
			for(int j=0;j<twoarray[i].length;j++) {
				System.out.println(twoarray[i][j]+ " ");
		
	}

}
}
