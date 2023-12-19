package com.vaish;

public class Compiletimeexception {

	public static void main(String[] args) {
		try {
			Class.forName("Employee.class");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
