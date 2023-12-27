package com.vaish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Occurenceofnumber {

	public static void main(String[] args) {
		int a[]= {1,2,4,5,62,8,9,3,4,5};
		ArrayList<Integer>nlist= new ArrayList<Integer>();
for(int i:a) {
	nlist.add(i);
}
System.out.println(nlist);

HashMap<Integer, Integer>hp= new HashMap<Integer, Integer>();
for(int i=0;i<nlist.size();i++) {
	hp.putIfAbsent(nlist.get(i), Collections.frequency(nlist,  nlist.get(i)));
}
	System.out.println(hp);
	
	for(Entry<Integer, Integer> mpi:hp.entrySet()) {
		System.out.println(mpi.getValue()+"->"+mpi.getKey());
	}
}
}
