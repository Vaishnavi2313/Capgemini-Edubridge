package com.vaishnavi;

import java.util.ArrayList;

import java.util.Iterator;
class Employee{
	private int eid;
	private String ename;
	private float esalary;
	
	//generate constrctor of Object(no arg const
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//generate constrctor with arg
	public Employee(int eid, String ename, float esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	//generate setter and getter method
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsalary() {
		return esalary;
	}

	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}

	
	//generate toString() method of Object
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
}

public class Employeeproduct {

	public static void main(String[] args) {
				
		ArrayList<Employee> elist=new ArrayList<Employee>();
		
		Employee e1= new Employee(1111,"Kiran", 7654.2f);
		Employee e2= new Employee(1112,"Manoj", 8654.2f);
		Employee e3= new Employee(1113,"Swetha", 7654.2f);
		Employee e4= new Employee(1114,"Ravi", 74654.2f);
		Employee e5= new Employee(1115,"Rekha", 17654.2f);
		
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		elist.add(e5);
		
		//display
		System.out.println(elist);
		
		Iterator<Employee> eit = elist.iterator();
		
		System.out.println("EID\tENMAE\tESALARY");
		while(eit.hasNext()) {
			Employee e = eit.next();
			//System.out.println(e);
//			System.out.print(e.getEid()+"\t");
//			System.out.print(e.getEname()+"\t");
//			System.out.print(e.getEsalary());
//			System.out.println();
			
			System.out.println(e.getEid()+"\t"+e.getEname()+"\t"+e.getEsalary());
					
		}
		
		
	}

}
