package com.vaish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class OccurenceoftheCharacter {
// Occurrence of the character in given string
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Vaishnavi";
		ArrayList<Character>nlist= new ArrayList<Character>();
		for(int i=0;i<s.length();i++)
		{
			nlist.add(s.charAt(i));
			
			}
		System.out.println(nlist);
		HashMap<Character, Integer>hp=new HashMap<Character, Integer>();
		for(int i=0;i<nlist.size();i++) {
			hp.putIfAbsent(nlist.get(i), Collections.frequency(nlist,  nlist.get(i)));
		}
		System.out.println(hp);
		
		//display occurs like a->2
		
		for(Entry<Character, Integer> mpi:hp.entrySet()) {
			System.out.println(mpi.getKey()+"--->"+mpi.getValue());
		}
		}

}
