package com.vaishnavi;

import java.util.ArrayList;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[]=new int[4]; //store only 4 numbers
		//a[4]=45;

		ArrayList<Integer> aob=new ArrayList<Integer>();
		aob.add(34);
		aob.add(89);
		aob.add(76);
		aob.add(25);
		aob.add(65);
		aob.add(94);
		aob.add(14);


		System.out.println(aob);

		for(int i:aob)
		{
			System.out.println(i);
		}
		aob.clear(); //remove all the elements
		
		System.out.println(aob);
		

		aob.add(89);
		aob.add(76);
		aob.add(25);
		aob.add(65);
		aob.add(94);
		aob.add(14);
		System.out.println(aob.contains(14)); //search
		
		

	}

}