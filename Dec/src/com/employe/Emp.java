package com.employe;

import java.util.Comparator;

public class Emp {
	private int EmpId;
	private String EmpName;
	private float EmpSalary;
	private int EmpDepId;
	// 1. generate constructor with no argument(object)

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 2. generate constructor with argument
	

	public Emp(int empId, String empName, float empSalary, int empDepId) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpSalary = empSalary;
		EmpDepId = empDepId;
	}

	// 3. setter and getter method
	
	

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public float getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(float empSalary) {
		EmpSalary = empSalary;
	}

	public int getEmpDepId() {
		return EmpDepId;
	}

	public void setEmpDepId(int empDepId) {
		EmpDepId = empDepId;
	}
	//4. toString

	@Override
	public String toString() {
		return "Emp [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + ", EmpDepId=" + EmpDepId
				+ "]";
	}
}
class SortStudentId implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getStudentId()>s2.getStudentId())
			return 1;
		else if(s1.getStudentId()<s2.getStudentId())
			return -1;
		else
			return 0;
	}
	
}

//based fees
class SortStudentFees implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		//> return 1
		//<  return -1
		//== return 0
		
		if(s1.getStudentFees()>s2.getStudentFees()) 
			return 1;
		else if(s1.getStudentFees()<s2.getStudentFees())
			return -1;
		else
			return 0;
	}
	
}
//based on Name

class SortEmpSalary implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
class SortEmpDepID implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}

	

