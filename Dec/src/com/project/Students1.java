package com.project;

import java.util.Comparator;

public class Students1 {
	private int studentsId;
	private String studentsName;
	private float studentsFees;
	// 1. generate constructor with no argument(object)

	public Students1() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	// 2. generate constructor with argument
	public Students1(int studentsId, String studentsName, float studentsFees) {
		super();
		this.studentsId = studentsId;
		this.studentsName = studentsName;
		this.studentsFees = studentsFees;
	}

	// 3. setter and getter method
	public int getStudentsId() {
		return studentsId;
	}


	public void setStudentsId(int studentsId) {
		this.studentsId = studentsId;
	}


	public String getStudentsName() {
		return studentsName;
	}


	public void setStudentsName(String studentsName) {
		this.studentsName = studentsName;
	}


	public float getStudentsFees() {
		return studentsFees;
	}


	public void setStudentsFees(float studentsFees) {
		this.studentsFees = studentsFees;
	}

	// 4. toString
	@Override
	public String toString() {
		return "Students1 [studentsId=" + studentsId + ", studentsName=" + studentsName + ", studentsFees="
				+ studentsFees + "]";
	}
}
	 //Sort the data
    class SortStudentId implements Comparator<Students1>{

		@Override
		public int compare(Students1 o1, Students1 o2) {
			if(o1.getStudentsId()>o2.getStudentsId())
			return 1;
			else if (o1.getStudentsId()< o2.getStudentsId())
				return -1;
				else
					return 0;
		}
	
	}
		
	
	
