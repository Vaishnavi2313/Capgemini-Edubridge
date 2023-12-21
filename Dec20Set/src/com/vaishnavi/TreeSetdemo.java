package com.vaishnavi;

import java.util.Iterator;
//import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//import com.project.Students1;

//import com.project.Students1;

//import com.project.SortStudentId;



public class TreeSetdemo {

	public static void main(String[] args) {
		Set<Student> s = new TreeSet<Student>( new Sidsort());
		
		Student s1=new Student(11,"Pallavi",561.23f);
		Student s2=new Student(61,"Kiran",431.23f);
		Student s3=new Student(12,"Sakshi",461.283f);
		s.add(s1);
		s.add(s2);
		s.add(s3);
		System.out.println(s);
		System.out.println("ID\tName\tFees");
		Set<Student> se = new TreeSet<Student>( new Sfee());
		se.add(s1);
		se.add(s2);
		se.add(s3);
		System.out.println(se);
		
		//Using Iterator. It is used for collections
		Iterator<Student> i= s.iterator();
	    while(i.hasNext()){
	    	Student st=i.next();
	    			System.out.println(st.getStudentId()+"\t"+st.getStudentName()+"\t"+st.getFees());
	        
	    }
	    Iterator<Student> i1= se.iterator();
	    while(i1.hasNext()){
	    	Student set=i1.next();
	    			System.out.println(set.getStudentId()+"\t"+set.getStudentName()+"\t"+set.getFees());
	        
	    }

	   

	}

}

