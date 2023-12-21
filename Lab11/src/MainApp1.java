class Employee1{

	int eid;

	String ename;

 

	public Employee1() {

	}

	public Employee1(Employee1 e) {

		super();

		this.eid=e.eid;

		this.ename=e.ename;

		

	}

	
	public Employee1(int eid, String ename) {

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

public class MainApp1 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub12

		

		Employee1 eob = new Employee1();

		eob.setEid(10);

		eob.setEname("Amit");

		

		Employee1 eob1= new Employee1(eob);

		System.out.println("eob1="+eob1);

		//eob1= eob;

		

		System.out.println(eob1);

        System.out.println(eob);		


		System.out.println("ID="+eob.getEid());

		System.out.println("Name="+eob.getEname());

 

	}

 

}
