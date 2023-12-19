package com.vaishnavi;
import java.util.ArrayList;

import java.util.Iterator;
class Student{

	private int sid;

	private String sname;

	private float sfees;

	public Student() {

		super();

		// TODO Auto-generated constructor stub

	}

	public Student(int sid, String sname, float sfees) {

		super();

		this.sid = sid;

		this.sname = sname;

		this.sfees = sfees;

	}

	public int getSid() {

		return sid;

	}

	public void setSid(int sid) {

		this.sid = sid;

	}

	public String getSname() {

		return sname;

	}

	public void setSname(String sname) {

		this.sname = sname;

	}

	public float getSfees() {

		return sfees;

	}

	public void setSfees(float sfees) {

		this.sfees = sfees;

	}

	@Override

	public String toString() {

		return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";

	}

	

	

}

public class CollectionStudent {

 

	public static void main(String[] args) {

		ArrayList<Student> slist = new ArrayList<Student>();

		

		Student s1 = new Student(1, "Neha", 564.3f);

		Student s2 = new Student(2, "Amit", 1564.3f);

		Student s3 = new Student(3, "Sanika", 5164.3f);

		Student s4 = new Student(4, "Uday", 2564.3f);

		Student s5 = new Student(5, "Sakshi", 5264.3f);

 

		slist.add(s1);

		slist.add(s2);

		slist.add(s3);

		slist.add(s4);

		slist.add(s5);

		

		System.out.println(slist);

		

		Iterator<Student> sitor= slist.iterator();

		

		System.out.println("sid\tsname\tsfees");

		

		while(sitor.hasNext()) {

			Student s=sitor.next();

			System.out.println(s.getSid()+"\t"+s.getSname()+"\t"+s.getSfees());

		}

		

     }

 

}

