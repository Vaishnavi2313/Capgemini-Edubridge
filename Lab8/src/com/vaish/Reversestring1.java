package com.vaish;

import java.util.Scanner;

public class Reversestring1 {
	public static void main(String[] args) {
		String s="Vaishnavi".toUpperCase();
//        char[] chArr=s.toCharArray();
		char [] ch=s.toCharArray();
        for(int i= ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
        System.out.println("");
        
        //aprroach 2
        for(int i=s.length()-1;i>=0;i--) {
        	System.out.print(s.charAt(i));
        }
        
        System.out.println("");
        
//        //Aprroach 3
//        StringBuilder sb=new StringBuilder(s);
//        System.out.println(s.reverse());
    }
	

}

