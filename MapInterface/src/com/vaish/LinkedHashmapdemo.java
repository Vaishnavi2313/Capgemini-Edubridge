package com.vaish;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashmapdemo {

	public static void main(String[] args) {
		//It maintains the order
		LinkedHashMap<Integer, String>link=new 	LinkedHashMap<Integer, String>();
		link.put(1,"Vaish");
		link.put(6,"Sakshi");
		link.put(4,"Adi");
		link.put(9,"Pranoti");
		link.put(5,"Adi");
		System.out.println(link);
		
		LinkedHashMap<Long, String>li=new LinkedHashMap<Long, String>();
		li.put( 2934567894l, "Riya");//num.put(1234567894l, "Riya");
		li.put( 8289412372l, "Sakshi");
		li.put( 8969745634l, "Adi");
		li.put( 9932314562l, "Vaish");
		System.out.println(li);
		//syntax
				//for(Map.Enter<k,V> obj:mapobj.enteryset(){}
				System.out.println("Name\tPhone number");
				for(Entry<Long, String> mpi:li.entrySet()) {
					System.out.println(mpi.getValue()+"\t"+mpi.getKey());
				}
		

	}

}
