

class Student{
	int sid;
	String sname;
	Student(){
		sid=10;
		sname="vaishnavi";
	}
}public class Constructordemo {
	public static void main(String[] args) {
		Student s=new Student();
	System.out.println("Id: " +s.sid);
	System.out.println("Name: " +s.sname);
	}

}
