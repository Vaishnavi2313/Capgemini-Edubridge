

	class Student1{

		int sid;

		String sname;

			

		public Student1(int sid, String sname) {

			super(); //calls Object class constructor

			System.out.println("sid="+this.sid);

			System.out.println("sname="+this.sname);

			

			this.sid = sid;

			this.sname = sname;

			System.out.println("Present Object "+this);

		}

	 

		public Student1() {

			System.out.println("No argument constructor");

		}

	 

		@Override

		public String toString() {

			return "Student [sid=" + sid + ", sname=" + sname + "]";

		}

		

	}

	public class Constructordemo1 {

	 

		public static void main(String[] args) {

			Student1 sob= new Student1(10,"Manoj");

			Student1 sob1= new Student1(11,"Sakshi");

			Student1 sob3 = new Student1();

			System.out.println("Object of student sob="+sob);

			System.out.println("Object of student sob1="+sob1);

			System.out.println("Object of student sob3="+sob3);

			System.out.println("sid="+sob.sid);

			System.out.println("sname="+sob.sname);

	 

		}

	 

	}
	