package com.vaishnavi;

import java.util.Comparator;

//import com.project.Students1;

public class Student {
	private int studentId;
	private String studentName;
	private float fees;
	
	
public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


public Student(int studentId, String studentName, float fees) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.fees = fees;
}


public int getStudentId() {
	return studentId;
}


public void setStudentId(int studentId) {
	this.studentId = studentId;
}


public String getStudentName() {
	return studentName;
}


public void setStudentName(String studentName) {
	this.studentName = studentName;
}


public float getFees() {
	return fees;
}


public void setFees(float fees) {
	this.fees = fees;
}


@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", fees=" + fees + "]";
}}


class Sidsort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getStudentId()>o2.getStudentId())
			return 1;
			else if (o1.getStudentId()< o2.getStudentId())
				return -1;
				else
		return 0;
	}
}
 
class Sfee implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getStudentId()>o2.getStudentId())
			return 1;
			else if (o1.getStudentId()< o2.getStudentId())
				return -1;
				else
		return 0;
	}
	
}
