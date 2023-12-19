package com.vaishnavi;
import java.util.ArrayList;
public class Remove1 {

	public static void main(String[] args) {

		ArrayList<Integer> aob = new ArrayList<Integer>();

          aob.add(34);

          aob.add(64);

          aob.add(24);

          aob.add(78);

          aob.add(89);

          aob.add(12);

          aob.add(90);

          

          System.out.println(aob);

          //display using loop

          

          for(int i:aob) { //for each

        	  System.out.println(i);

          }

aob.clear(); //remove all the elements

          

          System.out.println(aob); //[]

          

          aob.add(34);

          aob.add(64);

          aob.add(24);

          aob.add(78);

          aob.add(89);

          

          System.out.println(aob.contains(24)); //search

          

          ArrayList<Integer> aob1 = new ArrayList<Integer>();

          aob1.add(34);

          aob1.add(164);

          aob1.add(24);

          System.out.println(aob.containsAll(aob1));

         aob1.remove(1);

         System.out.println(aob1);

         aob1.add(1, 45);

         System.out.println(aob1);

      
	}

 

}