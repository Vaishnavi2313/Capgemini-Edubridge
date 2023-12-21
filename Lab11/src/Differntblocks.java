
public class Differntblocks {
	static {
		System.out.println("Static 1");
	}
	static {
		System.out.println("Static 1");
	}
	Differntblocks(){//for display this you can craete an object then it will works
		System.out.println("vaish");
	
	}
	{
		System.out.println("anonymus block");
	}
	public static void main(String[] args) {
		
		System.out.println("Main block");
		Differntblocks d=new Differntblocks();
	}
	
	

}
