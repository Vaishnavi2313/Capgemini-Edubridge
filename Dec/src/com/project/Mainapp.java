package com.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Mainapp {

	public static void main(String[] args) {
		ArrayList<Students1>studentList= new ArrayList<Students1>();
		Students1 s1=new Students1(11,"Pallavi",561.23f);
		Students1 s2=new Students1(11,"Kiran",561.23f);
		Students1 s3=new Students1(12,"Sakshi",461.283f);
		Students1 s4=new Students1(13,"Aditi",361.234f);
		Students1 s5=new Students1(14,"Pranoti",571.263f);
		Students1 s6=new Students1(15,"Ridhi",551.123f);
	
	studentList.add(s1);
	studentList.add(s2);
	studentList.add(s3);
	studentList.add(s4);
	studentList.add(s5);
	studentList.add(s6);
	System.out.println(studentList);
	System.out.println("ID\tName\tFees");
	System.out.println("_____________________________________");
	
	//Using For loop
//	for( Students1 s: studentList) {
//		System.out.println(s.getStudentsId()+"\t"+s.getStudentsName()+"\t"+s.getStudentsFees());
//	}
	
	//Using Iterator. It is used for collections
	Iterator<Students1> i= studentList.iterator();
    while(i.hasNext()){
    	Students1 st=i.next();
    			System.out.println(st.getStudentsId()+"\t"+st.getStudentsName()+"\t"+st.getStudentsFees());
        
    }
    
    SortStudentId sobj= new SortStudentId();
    Collections.sort(studentList,sobj);
    System.out.println("After Sort");
    System.out.println(studentList);
   

	}
}
