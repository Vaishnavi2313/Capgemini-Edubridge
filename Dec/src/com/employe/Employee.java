package com.employe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee {

	public static void main(String[] args) {
		ArrayList<Emp> em = new ArrayList<Emp>();
		Emp e1 = new Emp (12, "Vaishanvi",564.3f,12345);
		Emp e2 = new Emp (32, "Riddhi",2564.3f,45678);
		Emp e3 = new Emp (83, "Sakshi",1564.3f,25648);
		Emp e4 = new Emp (45, "Pallavi",5264.3f,14569);
		Emp e5 = new Emp (75, "Aakanksha",5634.3f,13654);
		Emp e6 = new Emp (16, "Pranoti",5624.3f,75698);
		
		em.add(e1);
		em.add(e2);
		em.add(e3);
		em.add(e4);
		em.add(e5);
		em.add(e6);
		
		//use enhanced for loop
		System.out.println("ID\tname\tSalary\tDepId");
		System.out.println("________________");
		
		
		for(Emp s: em) {
			System.out.println(s.getEmpId()+"\t"+s.getEmpName()+"\t"+s.getEmpSalary()+"\t"+s.getEmpDepId());
		}
		
		
		//create an object of sorted class
				SortEmpSalary sobj = new SortEmpSalary();
				
				Collections.sort(em, sobj);
				
				System.out.println("after sort");
				//System.out.println(em);
				System.out.println("EmpId\tEmpName\tEmpSalary\tEmpDepId");
		//use Iterator
		Iterator<Emp> it = em.iterator();
		

		
	
		while(it.hasNext()) {
			Emp s1= it.next();
			System.out.println(s1.getEmpId()+"\t"+s1.getEmpName()+"\t"+s1.getEmpSalary()+"\t"+s1.getEmpDepId());
		}
		
		//sort based on Depid
		SortEmpDepId sfeesobj = new SortEmpDepId();
		Collections.sort(em,sfeesobj);
		
		//display using iterator
		
		Iterator<Emp> feesit = em.iterator();
		
	  System.out.println("EmpId\tEmpName\tEmpSalary\tEmpDepId");
	  while(feesit.hasNext()) {
		  Emp s=feesit.next();
		  System.out.println(s.getEmpId()+"\t"+s.getEmpName()+"\t"+s.getEmpSalary()+"\t"+s.getEmpDepId());
	  }
	  
	  
	  
	}



	}


