package com.vaish;

public class Stringmethods {

	public static void main(String[] args) {
		String str="vaishnavi hiiii";
		String s1="vaishnavi hiiii";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.trim());
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		System.out.println(str.replace("hiiii","Hey"));
		System.out.println(str.startsWith("va"));
		System.out.println(str.endsWith("Va"));
		System.out.println(s1.intern());
		System.out.println(str.intern());
		System.out.println(str==s1);
		

	}

}
