class Employee{

	int eid;

	String ename;

 

	public Employee() {

		super();

		// TODO Auto-generated constructor stub

	}

	public Employee(int eid, String ename) {

		super();

		this.eid = eid;

		this.ename = ename;

	}

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

	@Override

	public String toString() {

		return "Employee [eid=" + eid + ", ename=" + ename + "]";

	}

 

	

	

}

 

public class Mainapp {
	public static void main(String[] args) {

		// TODO Auto-generated method stub12


		Employee eob = new Employee();

		eob.setEid(10);

		eob.setEname("Amit");

		

		System.out.println("ID="+eob.getEid());

		System.out.println("Name="+eob.getEname());

 

	}

}


