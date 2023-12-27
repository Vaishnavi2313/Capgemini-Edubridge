package com.vaish;

import java.util.Map;
import java.util.TreeMap;

public class Treehashmapdemo1 {

	public static void main(String[] args) {
		//elements will be sorted
	TreeMap<Integer, String>t=new TreeMap<Integer, String>();
	t.put(1,"Vaish");
	t.put(6,"Sakshi");
	t.put(4,"Adi");
	t.put(9,"Pranoti");
	t.put(5,"Adi");
	System.out.println(t);
	
	TreeMap<Long, String>t1=new TreeMap<Long, String>();
	t1.put( 2934567894l, "Riya");//num.put(1234567894l, "Riya");
	t1.put( 8289412372l, "Sakshi");
	t1.put( 8969745634l, "Adi");
	t1.put( 9932314562l, "Vaish");
	System.out.println(t1);
	//syntax
			//for(Map.Enter<k,V> obj:mapobj.enteryset(){}
			System.out.println("Name\tPhone number");
			for(Map.Entry<Long, String>mpi:t1.entrySet()) {
				System.out.println(mpi.getValue()+"\t"+mpi.getKey());
			}
	
	}

}
