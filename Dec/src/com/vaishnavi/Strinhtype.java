package com.vaishnavi;

import java.util.ArrayList;

public class Strinhtype {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		names.add("Vaishnavi");
		names.add("Pranoti");
		names.add("Riddhi");
		names.add("Pallavi");
		names.add("Sakshi");
		


		System.out.println(names);

		for(String i:names)
		{
			System.out.println(i);
		}
	System.out.println(names);
		

	names.add("Vaishnavi");
	names.add("Pranoti");
	names.add("Riddhi");
	names.add("Pallavi");
	names.add("Sakshi");
	
		System.out.println(names.contains("Vaishnavi")); //search
		
	}

}
